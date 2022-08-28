package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 
{
	//Step1: Declaration
	@FindBy(xpath="//a[@class='sign-in']")private WebElement SignIn;  
	//private WebElement SignIn=driver.findElement(By.xpath("//a[@class='sign-in']"))
	
	@FindBy(xpath="(//a[@class='signed'])[1]")private WebElement userIcon;
	
	WebDriver driver1;
	
	
	//Step2: Initialization
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;  //assign local object info to global object
		
	}
	
	//step3: 
		public void clickPom1SignIN()
		{
			SignIn.click();
		}
			
		
		public void mouseOverPom1UserIcon() 
		{
			Actions act=new Actions(driver1);
			act.moveToElement(userIcon).perform();		
		}

}
