package AgroAlertPOM.AgroAlertPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//store all locator and methods
public class LoginPageWithParameters {

	WebDriver driver;
	
	By username = By.xpath("//div/input[@name=\"email\"]");
	By password = By.xpath("//div/input[@name=\"password\"]");
	By loginBtn= By.xpath("//button[@data-ng-click=\"login()\"]");
	
	String uid = "sadmin@gmail.com";
	String pass= "1234";
	
public LoginPageWithParameters(WebDriver driver){
	
	this.driver=driver;
	
}


public void typeUsername(){
	
	driver.findElement(username).sendKeys(uid);
	
}

public void typePassword(){
	
	driver.findElement(password).sendKeys(pass);
	
}


public void clickLoginBtn(){
	
	driver.findElement(loginBtn).click();
	
}

//public void waitforTIme(){
//	
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	
//}
}
