package iFrame;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/guru99home/"); 
		
		
		//switch to frame 
				driver.switchTo().frame(0);     
							
				//getText from frame element
				String text = driver.findElement(By.xpath("//h1[text()='Not Found']")).getText();
				System.out.println(text);
				
				
				//switch to main page page
				//driver.switchTo().parentFrame();
				driver.switchTo().defaultContent();
				
				//click on selenium element from main page 
				driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();


	}

}
