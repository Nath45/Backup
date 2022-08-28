package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class POM_Test {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Pom1 login=new Pom1(driver);
		login.clickPom1SignIN();
		
		Pom2 MobNumPage=new Pom2(driver);
		MobNumPage.setPom2mobNum();
		MobNumPage.clickPom2ignInWithPwd();
		
		Pom3 PWD=new Pom3(driver);
		PWD.setPom3PWD();
		PWD.clickPom3signIn();
		
		login.mouseOverPom1UserIcon();
		
		Pom4 UI= new Pom4(driver);
		UI.clickPom4YourProfile();
		
		Pom5 PN= new Pom5(driver);
		PN.switchToChildWindow();
		PN.verifyPom5PN();
		
		Thread.sleep(4000);
		
		driver.quit();


	}

}
