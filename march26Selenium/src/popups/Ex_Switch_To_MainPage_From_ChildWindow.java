package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ex_Switch_To_MainPage_From_ChildWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");	
				
		//click on newtab link from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		
		//get childWindow ID
		Set<String> allIds = driver.getWindowHandles();  //{mainPageID, childWindowID}
		ArrayList<String> al=new ArrayList<String>(allIds);  //{mainPageID(0), childWindowID(1)}
		
		
		//switch to childWindow
		driver.switchTo().window(al.get(1));   //String windowID
				
		
		//click on training link from child Window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(1500);
		
		//switch to main Page
		driver.switchTo().window(al.get(0));
		
	     Thread.sleep(1500);
		
		//click on newWindow from main page 
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		
		driver.switchTo().window(al.get(2));
		
		driver.manage().window().maximize();

	}

}
