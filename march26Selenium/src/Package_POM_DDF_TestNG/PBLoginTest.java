package Package_POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest 
{
	  int a; //declare globally
	  PBLogInPage login;
	  PBSignInWithMObNumPage MobNum;
	  PBSignInWithPwdPage pwd;
	  PBUserIconPage userIcon;
	  PBProfilePage profile;
	  Sheet sh;
	  WebDriver driver;
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\Study\\26 Mar Eve.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF1");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 login=new PBLogInPage(driver);
		 MobNum=new PBSignInWithMObNumPage(driver);
	     pwd=new PBSignInWithPwdPage(driver);
		 userIcon=new PBUserIconPage(driver);
		 profile=new PBProfilePage(driver);		
		// a=10;
	}
	
	
	@BeforeMethod
	public void loginToApp() 
	{
		//System.out.println(a);
		login.clickPBLogInPagesignIn();
		MobNum.setPBSignInWithMObNumPagemobNum(sh.getRow(0).getCell(0).getStringCellValue());
		MobNum.clickPBSignInWithMObNumPagesignInWithPwd();
		pwd.setPBSignInWithPwdPagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clicksetPBSignInWithPwdPageSignIn();		
	}
	
	
	@Test
	public void verifyPN() throws InterruptedException 
	{
		Thread.sleep(3000);
		login.mouseOverPBLogInPageMyAccIcon();
		userIcon.clickPBUserIconPageMyProfile();
		profile.switchToChildWindow();
		//profile.verifyPBProfilePageProfileName(sh.getRow(0).getCell(2).getStringCellValue());	
		
		String actPN=profile.getPBProfilePageActPN();
		String expPN=sh.getRow(0).getCell(2).getStringCellValue();
		
		Assert.assertEquals(actPN, expPN,"Failed: both results are not equal");
	}
	
	@AfterMethod
	public void logoutFromApp() 
	{
		
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	

}