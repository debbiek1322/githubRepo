package POMWrdprs.POMWrdprs;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class POMWordpressVerifyLogin2 {

	
	@Test
	public void verifyValidLogin(){
	
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPageWithParameters login= new LoginPageWithParameters(driver);
		
		login.typeUsername("admin");
		login.typePassword("demo123");
		login.clickLoginBtn();
		
		driver.quit();
	}
	
	
	
}
