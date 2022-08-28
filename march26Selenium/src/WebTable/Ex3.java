package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///E:/html%20coding/webtable.html");		

		//for header
		int colSize = driver.findElements(By.xpath("//table[@border='5']//tr[1]/th")).size();
		System.out.println(colSize);
		
		
		
//		int colmSize = driver.findElements(By.xpath("table[@border='5']//tr[3]/td")).size();
//		System.out.println(colmSize);
		
		String text=driver.findElement(By.xpath("//table[@border='5']//tr[1]/th[3]")).getText();
		System.out.println(text);


	}

}
