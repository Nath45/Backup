package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex7_Sample2 
{
	@Test
	public void TC4()            //1 Test case = 1 test method
	{
		Reporter.log("running TC4",true);		
	}
	

	@Test
	public void TC6()            //1 Test case = 1 test method
	{
		Reporter.log("running TC6",true);	
	}

	
	@Test
	public void TC5()            //1 Test case = 1 test method
	{
		Reporter.log("running TC5",true);		
	}


}
