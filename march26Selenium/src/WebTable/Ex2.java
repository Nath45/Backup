package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/directory");
		
		//.switchTo().alert().accept();;
		
		driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		
		 List<WebElement> allRows = driver.findElements(By.xpath("((//table[@class='table'])//th[@scope='row'])"));
		 
		 int rowSize=allRows.size();
		 
		 System.out.println(rowSize);

	//	int colSize=driver.findElements(By.xpath("((//table[@class='table'])//th[@scope='col'])")).size();

	}

}
