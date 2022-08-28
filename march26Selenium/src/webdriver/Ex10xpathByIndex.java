package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex10xpathByIndex {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		//Enter FN 
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nath");
		
		//Enter LN
		
		driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys("Ombale");
		
		//Enter Mob No
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7066835003");
		
		//Enter DOB
		
		Select date=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText("6");
		
		Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("May");
		
		Select year=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		year.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("@aiSaheb18");

		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		

		
		
		

	}
	
}