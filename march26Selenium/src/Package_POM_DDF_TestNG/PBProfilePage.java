package Package_POM_DDF_TestNG;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage {

	@FindBy(xpath="//div[@class='sc-ckVGcZ kWpXlQ']") private WebElement profileName;
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchToChildWindow() {
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> ar = new ArrayList<String>(allIds);
		 String cwadd = ar.get(1);
		 driver1.switchTo().window(cwadd);
	}
	
	
	public String getPBProfilePageActPN() 
	{
		String actualPN = profileName.getText();
		return actualPN;
	}
	
	
//	public void verifyPBProfilePageProfileName(String expectedPN) {
//		String actproname = profileName.getText();
//		
//		String expproname = expectedPN;
//		
//		if(actproname.equals(expproname)) {
//			System.out.println("Test case Pass");
//		}
//		
//		else {
//			System.out.println("Test case Fail");
//		}
//	}
}