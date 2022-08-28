package HandlingOfDynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("realme gt2 pro");

		driver.findElement(By.xpath("//input[@value='Go']")).click();

		//get ratings

		String rating =driver.findElement(By.xpath("((//div[@cel_widget_id='MAIN-SEARCH_RESULTS-1'])[1]//span)[15]")).getText();

		System.out.println(rating);
	}

}
