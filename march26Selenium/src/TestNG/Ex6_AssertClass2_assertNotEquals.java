package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex6_AssertClass2_assertNotEquals {
	
	@Test
	public void assertNotEquals()
	{
		String actResult="Hello";
		String expResult="Hello";
		
		Assert.assertNotEquals(actResult, expResult,"Failed-both results are same");
	}

}
