package POM_DDF_TestNG_UtilityClass_BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInWithPwdPage 
{
	@FindBy(xpath="(//input[@type='password'])[1]")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signIn;
	
	public PBSignInWithPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void setPBSignInWithPwdPagePWD(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clicksetPBSignInWithPwdPageSignIn()
	{
		signIn.click();
	}

}
