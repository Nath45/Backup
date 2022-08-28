package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNum;
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement signInWithPwd;
	
	public Pom2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setPom2mobNum()
	{
		mobNum.sendKeys("9112780945");
	}
	
	public void clickPom2ignInWithPwd()
	{
		signInWithPwd.click();
	}

}
