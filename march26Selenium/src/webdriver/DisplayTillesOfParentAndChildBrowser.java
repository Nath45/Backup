package webdriver;



import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTillesOfParentAndChildBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Set<String> set = driver.getWindowHandles();
		
		for(String str:set)
		{
			driver.switchTo().window(str);
			
			System.out.println(driver.getTitle());
		}
		
		
	}

}
