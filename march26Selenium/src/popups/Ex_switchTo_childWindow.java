package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_switchTo_childWindow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");	
				
		//click on newtab link from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		
		//get childWindow ID
		Set<String> allIds = driver.getWindowHandles();  //{mainPageID, childWindowID}
		ArrayList<String> al=new ArrayList<String>(allIds);  //{mainPageID(0), childWindowID(1)}
		String childWindowID = al.get(1);
		
		
		//switch to childWindow
		driver.switchTo().window(childWindowID);   //String windowID
				
		
		//click on training link from child Window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		

	}

}
