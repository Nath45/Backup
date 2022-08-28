package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogInPage 
{
	@FindBy(xpath="//a[@class='sign-in']")private WebElement SignIn;
	@FindBy(xpath="//div[text()='My account']")private WebElement MyAccI;
	
	WebDriver driver1;
	public PBLogInPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
		
	}
	
	public void clickPBLogInPagesignIn()
	{
		SignIn.click();
	}
	
	public void mouseOverPBLogInPageMyAccIcon()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(MyAccI).perform();
	}

}
