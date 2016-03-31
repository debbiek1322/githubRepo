package POMWrdprs.POMWrdprs;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SanityTestSuite {

	
	  static WebDriver driver;

	
	@BeforeClass
	public static void before(){
		driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		//fun= new ReusableFunctions(driver);
		
	}
	
	@AfterClass
	public static void after(){
		driver.quit();
		driver= null;
	}
	
	@Test
	public void userCanLoginValidDetails(){
		
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.id("wp-submit")).click();

		//fun.login("admin","demo123");
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Dashboard"));
		//fun.waitforSomeTime();
		//fun.logout();
		
			
	}
	
	
}
