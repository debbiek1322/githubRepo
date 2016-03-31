package AgroAlertPOM.AgroAlertPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//store all locator and methods
public class LogoutPage {

	WebDriver driver;
	
	By admin = By.xpath("//a/span[@class=\"hidden-xs ng-binding\"]");
	By logout = By.xpath("//li/a[@ng-click=\"logout()\"]");
	
	
	String uid = "sadmin@gmail.com";
	String pass= "1234";
	
public LogoutPage(WebDriver driver){
	
	this.driver=driver;
	
}


public void clickLogout(){
	

	driver.findElement(admin).click();
	driver.findElement(logout).click();
	
}

}
