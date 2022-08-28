package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open browser",true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("--login to app--",true);
	}
	
	@Test
	public void verifyPN2()
	{
		Reporter.log("running verify PN2 Test case",true);
	}
	
	@Test
	public void verifyPN1()
	{
		Reporter.log("running verify PN1 Test case",true);
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("--Logout from App--",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close browser",true);
		
	}

}
