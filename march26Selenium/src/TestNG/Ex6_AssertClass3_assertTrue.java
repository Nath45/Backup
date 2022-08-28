package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex6_AssertClass3_assertTrue 
{
	@Test
	public void assertTrue()
	{
		boolean actResult=false;
		
		Assert.assertTrue(actResult,"Failed-act result is false");
	}

}
