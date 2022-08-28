package POM_DDF_TestNG_UtilityClass_BaseClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest extends BaseClass
{
	  PBLogInPage login;
	  PBSignInWithMObNumPage MobNum;
	  PBSignInWithPwdPage pwd;
	  PBUserIconPage userIcon;
	  PBProfilePage profile;
	  
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		 initializeBrowser();
		 
		 login=new PBLogInPage(driver);
		 MobNum=new PBSignInWithMObNumPage(driver);
	     pwd=new PBSignInWithPwdPage(driver);
		 userIcon=new PBUserIconPage(driver);
		 profile=new PBProfilePage(driver);		
	}
	
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		login.clickPBLogInPagesignIn();
		MobNum.setPBSignInWithMObNumPagemobNum(UtilityClass.getTD(0, 0));
		MobNum.clickPBSignInWithMObNumPagesignInWithPwd();
		Thread.sleep(3000);
		pwd.setPBSignInWithPwdPagePWD(UtilityClass.getTD(0, 1));
		pwd.clicksetPBSignInWithPwdPageSignIn();		
	}
	
	
	@Test
	public void verifyPN() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		Thread.sleep(3000);
		login.mouseOverPBLogInPageMyAccIcon();
		userIcon.clickPBUserIconPageMyProfile();
		profile.switchToChildWindow();
		
		String actPN=profile.getPBProfilePageActPN();
		String expPN=UtilityClass.getTD(0, 2);
		
		Assert.assertEquals(actPN, expPN,"Failed: both results are not equal");
	}
	
	@AfterMethod
	public void logoutFromApp() 
	{
		
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	

}