package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopup1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		Thread.sleep(2000);

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		// Enter customer ID

		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("OMnath");

		//click on submit button

		driver.findElement(By.xpath("//input[@name='submit']")).click();

		Thread.sleep(2000);

		//getText from alert popup

		String text=driver.switchTo().alert().getText();
		System.out.println(text);

		//click on cancel btn from alert popup

		//driver.switchTo().alert().dismiss();

		// click on Ok btn from 1st alert popup

		driver.switchTo().alert().accept();

		// click on Ok btn from 2nd alert popup

		driver.switchTo().alert().accept();



	}

}
