package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement source = driver.findElement(By.xpath("((//a[@class='button button-orange'])[2])"));
		
		WebElement destination = driver.findElement(By.xpath("((//li[@class='placeholder'])[2])"));
		
		Actions act=new Actions(driver);
		
		//act.dragAndDrop(source,destination);
		
		act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
	}

}
