package TestNG;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex6_SoftAssertClass1
{
	@Test
	public void TC()
	{
	SoftAssert soft=new SoftAssert();
	String actResult="Hello";
	String expResult="Hi";
	
	soft.assertEquals(actResult,expResult,"Failed-both results are diff");
	
	boolean actResult1=false;
	
	soft.assertTrue(actResult1, "Failed- act result is false ");
	
	soft.assertAll();
	
	}

}
