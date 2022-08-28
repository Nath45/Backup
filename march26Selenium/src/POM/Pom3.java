package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 
{
	@FindBy(xpath="(//input[@type='password'])[1]")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signIn;
	
	public Pom3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void setPom3PWD()
	{
		pwd.sendKeys("@Nath451");
	}
	
	public void clickPom3signIn()
	{
		signIn.click();
	}


}
