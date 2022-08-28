package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xpathByAttribute
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
				
	
		//driver.findElement("locator type")
		//driver.findElement(By.xpath("xpathExpression"))
		
		//enter UN
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nomble66@gmail.com");
		
		//enter pwd
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("@Inath451");
				
		//click on login btn
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nomble66@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("@Inath451");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
		
	}

}
