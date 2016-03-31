package POMWrdprs.POMWrdprs;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AfroAlertt_Test_Suite {

	
	  static WebDriver driver;
	static  ReusableFunctions2 fun;
	
	@BeforeClass
	public static void before(){
		driver = new FirefoxDriver();
		driver.get("http://3dsa.dotsoft.gr/");
		fun= new ReusableFunctions2(driver);
		
	}
	
	@AfterClass
	public static void after(){
		driver.quit();
		driver= null;
	}
	
	@Test
	public void userCanLoginValidDetails(){
		
		
		fun.login("sadmin@gmail.com","1234","//div/input[@name=\"email\"]","//div/input[@name=\"password\"]","//button[@data-ng-click=\"login()\"]");
		fun.waitforSomeTime();
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Προβλέψεις"));
		fun.logout("//a/span[@class=\"hidden-xs ng-binding\"]","//li/a[@ng-click=\"logout()\"]");
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Δεν έχετε λογαριασμό;"));
		
			
	}
	
	@Test
	public void userCanNotLoginInValidDetails(){
	
	
		fun.login("sadmin@gmail.com","124","//div/input[@name=\"email\"]","//div/input[@name=\"password\"]","//button[@data-ng-click=\"login()\"]");
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Δεν έχετε λογαριασμό;"));
		
	}
	
	

	
	


}