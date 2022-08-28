package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
	static int CountBL=0;

	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com/");
		 
		 //wait
		 Thread.sleep(5000);
		 
		 // capture links from a webpage
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 //Number of links
		 System.out.println(links.size());
		 
		 for(int i=0; i<links.size();i++)
		 {
			 //by using href attribute we can get URL of required link
			 
			 WebElement element = links.get(i);
			 String url = element.getAttribute("href");
			 
			 URL link=new URL(url);
			 
			 //create a connection using url object 'link'
			 HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
			 //wait time 2 secs
			 Thread.sleep(2000);
			 //establish connection
			 httpConn.connect();
			 
			 int rescode = httpConn.getResponseCode();  // return response code. If res code is above 400: broken link
			 
			 if(rescode>=400)
			 {
				 System.out.println(url +"-"+" is broken link");
				 CountBL++;
			 }
			 
			 else
			 {
				 System.out.println(url +"-"+" is valid link");
				 
			 }
		 }
		 
		 System.out.println("Brokenlink: "+CountBL);
	}

}
