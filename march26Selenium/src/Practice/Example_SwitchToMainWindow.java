package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_SwitchToMainWindow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();
	
		
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		

		Set<String> allId = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allId);
		String childId = al.get(1);
		 
		driver.switchTo().window(childId);
	     
		String text = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		
		System.out.println(text);

	}

}
