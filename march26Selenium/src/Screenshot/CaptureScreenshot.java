package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot 
{
	static WebDriver driver;

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		takeScreenshot("Flipkart_LoginPage"); 
		
	}
		
		public static void takeScreenshot(String fileName) throws IOException
		{
			//1. Take screenshot and store it as a file format:
			
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//2. Copy the screenshot to desired location using copyfile method
			
			 Files.copy(file,new File("C:\\Users\\Admin\\Desktop\\Screenshots\\"+fileName+".jpg"));
		
			
		}
		
	    
		
	


}
