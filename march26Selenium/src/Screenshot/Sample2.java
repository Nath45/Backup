package Screenshot;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sample2
{
	public static void main(String[] args) throws IOException 
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");		
	
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.amazon.com/");
		
		String RS=RandomString.make(2);
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
				
		File dest=new File("C:\\Users\\Admin\\Desktop\\Study\\Screenshots\\Image"+RS+".jpg");
			
		FileHandler.copy(src, dest);
		
		driver.close();
		
	}

}
