package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 
{
	@FindBy(xpath="//span[text()=' Your profile ']")private WebElement yourProfile;
	
	public Pom4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPom4YourProfile()
	{
		yourProfile.click();
	}


}
