package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_Click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
        Thread.sleep(2000);
        
         WebElement Ele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
         
         Actions act=new Actions(driver);
         
         act.doubleClick(Ele).perform();
         
         driver.switchTo().alert().accept();
         
         driver.close();
         
         


	}

}
