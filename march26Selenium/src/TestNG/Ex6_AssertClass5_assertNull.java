package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex6_AssertClass5_assertNull
{
	@Test
	public void assertNull()
	{
		String actResult="ABCD";
		
		Assert.assertNull(actResult,"Failed-act result is not null");
	}

}