package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_Annotations 
{
	@BeforeClass
	public void openBrowser() 
	{
		Reporter.log("open browser",true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("--Login To App--",true);
	}
	
	@Test
	public void verifyPN2() 
	{
		Reporter.log("running verify PN2 Test Case",true);
	}
	
	@Test
	public void verifyPN1() 
	{
		Reporter.log("running verify PN1 Test Case",true);
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("--Logout From App--",true);
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("close browser",true);
	}
	
	

}