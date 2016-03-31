package POMWrdprs.POMWrdprs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ReusableFunctions2 {
 WebDriver driver;

public ReusableFunctions2(WebDriver driver){
	this.driver=driver;
	
	
}

	public void login(String username,String password,String xpathu,String xpathp,String xpathb) {
		waitforSomeTime();
		driver.findElement(By.xpath(xpathu)).sendKeys(username);
		
		driver.findElement(By.xpath(xpathp)).sendKeys(password);
		driver.findElement(By.xpath(xpathb)).click();
	}
public void waitforSomeTime(){
	try{
		Thread.sleep(10000);
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}
	
}

public void logout(String xpathlog1,String xpathlog){
	driver.findElement(By.xpath(xpathlog1)).click();
	driver.findElement(By.xpath(xpathlog)).click();
	
}


public void forgotPassword(String username,String xpathb1,String xpathu,String xpathb2){
	
	driver.findElement(By.xpath(xpathb1)).click();
	driver.findElement(By.xpath(xpathu)).sendKeys(username);
	driver.findElement(By.xpath(xpathb2)).click();

}

////a[@ class="btn btn-md btn-default btn-block ng-binding"]
public void signUP(String username,String btnsignup,String xpathu,String xpathb2){
	
	driver.findElement(By.xpath(btnsignup)).click();
	driver.findElement(By.xpath(xpathu)).sendKeys(username);
	driver.findElement(By.xpath(xpathb2)).click();
	//Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Please enter your username or email address. You will receive a link to create a new password via email."));

}

////*[@id="app"]/div[2]/div/div/form/a
}
