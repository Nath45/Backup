package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Links_in_Webpage_1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		 List<WebElement> Links = driver.findElements(By.xpath("//a"));
		 
		 int count=Links.size();
		 
		 System.out.println("Number of Links in webpage: "+count);
		 
		 for(WebElement s1:Links)
		 {
			 String Link_Name=s1.getAttribute("href");
			 
			 System.out.println(Link_Name);
			 
		 }
		
		

	}

}
