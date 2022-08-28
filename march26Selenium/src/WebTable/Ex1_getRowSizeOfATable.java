package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_getRowSizeOfATable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("file:///E:/html%20coding/webtable.html");
		
		 List<WebElement> allRows = driver.findElements(By.xpath("//table[@border='5']//tr"));
		 
		 int rowSize=allRows.size();
		 
		 System.out.println(rowSize);
		 
		 int colSize=driver.findElements(By.xpath("//table[@border='5']//tr[3]/td")).size();
		 
		 System.out.println(colSize);
		
		


	}

}
