package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword5_dependsOnMethod1
{
	
	@Test                      
	public void login()
	{
		Reporter.log("--running login TC--", true)
	}
	
	@Test(dependsOnMethods="login")        
	public void logout()
	{
		Reporter.log("--running logout TC--", true);
	}
	
	
	

}