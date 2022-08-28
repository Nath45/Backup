package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SelectOption_From_SingleSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		//Step1:
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		//Step2:
		 Select s=new Select(month);
		 
		 //Step3:
		 s.selectByVisibleText("May");      //String text
		 
		// s.selectByValue("5");              // String value
		 
		// s.selectByIndex(4);                // int index

		
	}


}
