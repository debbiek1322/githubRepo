package POMWrdprs.POMWrdprs;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SanityTestSuiteFunctionDriven {

	
	  static WebDriver driver;
	static  ReusableFunctions fun;
	
	@BeforeClass
	public static void before(){
		driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		fun= new ReusableFunctions(driver);
		
	}
	
	@AfterClass
	public static void after(){
		driver.quit();
		driver= null;
	}
	
	@Test
	public void userCanLoginValidDetails(){
		
		
		fun.login("admin","demo123");
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Dashboard"));
		fun.waitforSomeTime();
		fun.logout();
//		waitforSomeTime();
			
	}
	
	@Test
	public void userCanNotLoginInValidDetails(){
	
		// login("admin1","demo123");
		fun.login("admin1","demo123");
		// Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("ERROR"));	
		fun.waitforSomeTime();
		fun.logout();
		
	}
	
	
	@Test
	public void userSeeforgotPasswordAfterWrongPassword(){
		
		fun.login("admin","dmo123");
		fun.forgotPassword("admin");
		Assert.assertTrue(driver.findElement(By.linkText("Lost your password")).isDisplayed());;
		
		fun.waitforSomeTime();
		
//		login("admin1","demo123");
	}
	
	
	public void login(String username,String password){
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();

		
		
	}

	public void waitforSomeTime(){
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

	public void logout(){

		driver.findElement(By.xpath("//*[@id=wp-admin-bar-logout]/a")).click();
//		driver.findElement(By.tagName("body")).getText().contains("Log Out").click();
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("You are now logged out."));

	}

}