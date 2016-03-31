package AgroAlertPOM.AgroAlertPOM;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class POMAgroAlertTest {

	
	@Test
	public void verifyValidLogin(){
	
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://3dsa.dotsoft.gr/");
		
		LoginPageWithParameters login= new LoginPageWithParameters(driver);
		
		login.typeUsername();
		login.typePassword();
		login.clickLoginBtn();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Προβλέψεις"));
		//login.waitforTIme();
		LogoutPage logout= new LogoutPage(driver);
		logout.clickLogout();
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Δεν έχετε λογαριασμό;"));
		
		SignUpPage signup= new SignUpPage(driver);	
		signup.signup();
		
		driver.quit();
	}
	
//	@Test
//	public void verifysignUP(){
//	
//		
//		WebDriver driver=new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.get("http://3dsa.dotsoft.gr/");	
//		SignUpPage signup= new SignUpPage(driver);	
//		signup.signup();
//		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		//Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Δεν έχετε λογαριασμό;"));
//		driver.quit();
//	}
	
}
