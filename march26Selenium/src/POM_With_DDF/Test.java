package POM_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("E:\\Study\\26 Mar Eve.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");

		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		PBLogInPage login=new PBLogInPage(driver);
		login.clickPBLogInPagesignIn();
		
		PBSignInWithMObNumPage MobNumPage=new PBSignInWithMObNumPage(driver);
		MobNumPage.setPBSignInWithMObNumPagemobNum(sh.getRow(0).getCell(0).getStringCellValue());
		MobNumPage.clickPBSignInWithMObNumPagesignInWithPwd();
		
		PBSignInWithPwdPage PWD=new PBSignInWithPwdPage(driver);
		PWD.setPBSignInWithPwdPagePWD(sh.getRow(0).getCell(1).getStringCellValue());
		PWD.clicksetPBSignInWithPwdPageSignIn();
		
		Thread.sleep(2000);
		
		login.mouseOverPBLogInPageMyAccIcon();
		
		PBUserIconPage UI= new PBUserIconPage(driver);
		UI.clickPBUserIconPageMAP();
		
		PBProfilePage PN= new PBProfilePage(driver);
		PN.switchToChildWindow();
		PN.verifyPBProfilePagePN(sh.getRow(0).getCell(2).getStringCellValue());
		
		Thread.sleep(4000);
		
		driver.quit();



	}

}
