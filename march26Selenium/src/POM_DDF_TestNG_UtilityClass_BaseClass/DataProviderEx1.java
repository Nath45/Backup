package POM_DDF_TestNG_UtilityClass_BaseClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
	
	@Test(dataProvider="loginCreds")
	public void loginCH(String uName, String pwd) {
		
		String url="http://localhost/login.do";
		System.out.println("User Name: "+uName);
		System.out.println("Password: "+pwd);
		
		System.out.println("********************");
  }
	
	@DataProvider(name="loginCreds")
	public Object[][] loginCredentials() {
		Object [][] testData=new Object [2][2];
		testData[0][0]="admin";
		testData[0][1]="manager";
		
		testData[0][0]="admin1";
		testData[0][1]="manager1";
		
		return testData;
	}
	

}
