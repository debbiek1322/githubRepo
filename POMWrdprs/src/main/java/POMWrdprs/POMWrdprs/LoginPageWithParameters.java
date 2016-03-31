package POMWrdprs.POMWrdprs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//store all locator and methods
public class LoginPageWithParameters {

	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.xpath(".//*[@id=\"user_pass\"]");
	By loginBtn= By.name("wp-submit");


public LoginPageWithParameters(WebDriver driver){
	
	this.driver=driver;
	
}


public void typeUsername(String uid){
	
	driver.findElement(username).sendKeys(uid);
	
}

public void typePassword(String pass){
	
	driver.findElement(password).sendKeys(pass);
	
}


public void clickLoginBtn(){
	
	driver.findElement(loginBtn).click();
	
}

}
