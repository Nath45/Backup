package Package_POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInWithMObNumPage 
{
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNum;
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement signInWithPwd;
	
	public PBSignInWithMObNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setPBSignInWithMObNumPagemobNum(String MobNum)
	{
		mobNum.sendKeys(MobNum);
	}
	
	public void clickPBSignInWithMObNumPagesignInWithPwd()
	{
		signInWithPwd.click();
	}
	

}
