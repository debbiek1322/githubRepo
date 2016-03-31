package POMWrdprs.POMWrdprs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ReusableFunctions {
 WebDriver driver;

public ReusableFunctions(WebDriver driver){
	this.driver=driver;
	
	
}

	public void login(String username,String password) {
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
//	driver.findElement(By.tagName("body")).getText().contains("Log Out").click();
	Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("You are now logged out."));

}


public void forgotPassword(String username){
	
	driver.findElement(By.id("login_error")).click();
	driver.findElement(By.id("user_login")).sendKeys(username);
	driver.findElement(By.id("wp-submit")).click();
	//Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Please enter your username or email address. You will receive a link to create a new password via email."));

}
}
