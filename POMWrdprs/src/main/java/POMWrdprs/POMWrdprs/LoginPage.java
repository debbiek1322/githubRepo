package POMWrdprs.POMWrdprs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//store all locator and methods
public class LoginPage {

	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.xpath(".//*[@id=\"user_pass\"]");
	By loginBtn= By.name("wp-submit");


public LoginPage(WebDriver driver){
	
	this.driver=driver;
	
}


public void typeUsername(){
	
	driver.findElement(username).sendKeys("admin");
	
}

public void typePassword(){
	
	driver.findElement(password).sendKeys("demo123");
	
}


public void clickLoginBtn(){
	
	driver.findElement(loginBtn).click();
	
}

}
