package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotaionsEx1 {
	
	@BeforeClass
	
	public void openBrowser()
	{
		Reporter.log("Open Browser", true);
	}
	
	@BeforeMethod
	
	public void loginToApp() 
	{
		Reporter.log("---Log in to App---",true);
	}
	
	@Test
	public void verifyPN1()
	{
		Reporter.log("Running verify PN1 test case",true);
	}
	
	@Test
	public void verifyPN3()
	{
		Reporter.log("Running verify PN3 test case",true);
	}
	
	@Test
	public void verifyPN2()
	{
		Reporter.log("Running verify PN2 test case",true);
	}
	
	@AfterMethod
	public void logout()
	{
        
		Reporter.log("---logout from App---",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close browser",true);
	}

}
