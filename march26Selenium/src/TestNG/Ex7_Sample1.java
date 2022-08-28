package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex7_Sample1 
{
	@Test
	public void TC3()            //1 Test case = 1 test method
	{
		Reporter.log("running TC3",true);		
	}
	

	@Test
	public void TC1()            //1 Test case = 1 test method
	{
		Reporter.log("running TC1",true);	
	}

	
	@Test
	public void TC2()            //1 Test case = 1 test method
	{
		Reporter.log("running TC2",true);		
	}


}
