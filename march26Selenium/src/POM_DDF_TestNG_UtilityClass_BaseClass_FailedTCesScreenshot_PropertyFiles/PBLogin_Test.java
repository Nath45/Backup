package POM_DDF_TestNG_UtilityClass_BaseClass_FailedTCesScreenshot_PropertyFiles;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLogin_Test extends BaseClass
{
	  PBLogInPage login;
	  PBSignInWithMObNumPage MobNum;
	  PBSignInWithPwdPage pwd;
	  PBUserIconPage userIcon;
	  PBProfilePage profile;
	  int TCID;
	  
	
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
		MobNum.setPBSignInWithMObNumPagemobNum(UtilityClass.getPFData("MobNum"));
		MobNum.clickPBSignInWithMObNumPagesignInWithPwd();
		Thread.sleep(3000);
		pwd.setPBSignInWithPwdPagePWD(UtilityClass.getPFData("PWD"));
		pwd.clicksetPBSignInWithPwdPageSignIn();		
	}
	
	
	@Test
	public void verifyPN() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		TCID = 101;
		
		Thread.sleep(3000);
		login.mouseOverPBLogInPageMyAccIcon();
		userIcon.clickPBUserIconPageMyProfile();
		profile.switchToChildWindow();
		
		String actPN=profile.getPBProfilePageActPN();
		String expPN=UtilityClass.getTD(0, 2);
		
		Assert.assertEquals(actPN, expPN,"Failed: both results are not equal");
	}
	
	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureScreenShot(driver, TCID);
		}
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	



}
