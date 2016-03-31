package AgroAlertPOM.AgroAlertPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

//store all locator and methods
public class SignUpPage {

	WebDriver driver;
	
	By signupBtn = By.xpath("//a[@class=\"btn btn-md btn-default btn-block ng-binding\"]");
	By name = By.xpath("//div/input[@id=\"name\"]");
	By surname = By.xpath("//div/input[@id=\"surname\"]");
	By fathern = By.xpath("//div/input[@id=\"fathername\"]");
	By email = By.xpath("//div/input[@id=\"email\"]");
	By mobile = By.xpath("//div/input[@id=\"mobile\"]");
	By prefecture = By.xpath("//div/select[@name=\"prefecture\"]");
	By pref = By.xpath("//div/select/option[@value=\"object:798\"]");
	
	By municipality = By.xpath("//div/select[@name=\"municipality\"]"); 
	By mun = By.xpath("//div/select/option[@value=\"object:851\"]"); 
	
	By department = By.xpath("//div/select[@name=\"department\"]");
	By dep = By.xpath("//div/select/option[@value=\"object:860\"]");
	
	
	By zipcode = By.xpath("//div/input[@id=\"zipcode\"]");
	By notifications = By.xpath("//div/label/input[@type=\"checkbox\"]");
	By password = By.xpath("//div/input[@id=\"password\"]");
	By confirmpassword = By.xpath("//div/input[@id=\"confirmpassword\"]");
	By savebtn = By.xpath("//div/button[@type=\"submit\"]");
	
	//  //div/select/option[@value="object:798"]
	
	String fname = "DESPOINA";
	String lname= "M";
	String fathername = "VASILIOS";
	String mail= "dmpasdeki@dotsoft.gr";
	String mob = "6955000000";
	String zip= "54625";
	String pass = "3dsa123";
	String confpass= "3dsa123";
	
	
	
public SignUpPage(WebDriver driver){
	
	this.driver=driver;
	
}


public void signup(){
	

	driver.findElement(signupBtn).click();
	driver.findElement(name).sendKeys(fname);
	driver.findElement(surname).sendKeys(lname);
	driver.findElement(fathern).sendKeys(fathername);
	driver.findElement(email).sendKeys(mail);
	driver.findElement(mobile).sendKeys(mob);
	
//	driver.findElement(prefecture).click();
////	driver.findElement(pref).click();
//	
//	driver.findElement(municipality).click();
//	//driver.findElement(mun).click();
//	driver.findElement(department).click();
//	//driver.findElement(dep).click();
	
	Select select = new Select(driver.findElement(prefecture));
	 select.selectByValue("object:798");
	//select.deselectAll();
	//select.selectByVisibleText("Ν.ΘΕΣΣΑΛΟΝΙΚΗΣ");
	
	Select select1 = new Select(driver.findElement(prefecture));
	//select1.deselectAll();
	//select1.selectByVisibleText("ΘΕΣΣΑΛΟΝΙΚΗΣ");
	 select1.selectByValue("object:851");
	
	Select select2 = new Select(driver.findElement(prefecture));
	//select2.deselectAll();
	//select2.selectByVisibleText("Δ.ΘΕΣΣΑΛΟΝΙΚΗΣ");
	 select2.selectByValue("object:860");
	
	driver.findElement(zipcode).sendKeys(zip);
	driver.findElement(notifications).click();
	driver.findElement(password).sendKeys(pass);
	driver.findElement(confirmpassword).sendKeys(confpass);
	driver.findElement(savebtn).click();
	
}

}
