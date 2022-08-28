package TestNG;

import org.testng.Assert;

public class Ex6_AssertClass6_assertNotNull 
{
	public void assertNotNull()
	{
	String actResult=null;
	
	Assert.assertNotNull(actResult,"Failed-act result is null");
	
	}

}
