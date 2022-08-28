package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SwitchToFrame {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		
		//switch to frame 
				//driver.switchTo().frame("a077aa5e");     //String frameID
				//driver.switchTo().frame("a077aa5e");         //String frameName
				//driver.switchTo().frame(1);     //int frameIndex
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='a077aa5e']"))); //frame webElement
				
				
				//click on click me btn
			//	driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
				
				
				
				
				
				
	

	}

}
