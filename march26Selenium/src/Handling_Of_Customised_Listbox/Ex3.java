package Handling_Of_Customised_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		
	    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();	
	    
	    Thread.sleep(3000);
	    
	    WebElement month = driver.findElement(By.id("month"));
	    
	    Actions act=new Actions(driver);
	    
	    act.click(month).perform();
	    
	    Thread.sleep(2000);
	    
	    //navigate to last option using END key
	    
	    act.sendKeys(Keys.END).perform();
	    
	    for(int i=1; i<=4; i++)
	    {
	    	act.sendKeys(Keys.ARROW_UP).perform();
	    }


	}

}
