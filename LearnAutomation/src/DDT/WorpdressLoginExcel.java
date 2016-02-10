package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.ExcelDataConfig;

public class WorpdressLoginExcel {
	
	WebDriver driver;
	
	
@Test(dataProvider="wordpressData")
//for more data i change parameters and add more
	public void loginToWordpress(String username,String password) throws InterruptedException{
		
		
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		
		Thread.sleep(5000);
//	System.out.println(driver.getTitle());
//		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is not able to login-Invalid Credentials");
		System.out.println("Page Title verified- User is able to login Successfully");
		
		
	}
@AfterMethod
public void tearDown(){
	driver.quit();
	
}



@DataProvider(name="wordpressData")
public Object[][] passData() throws Exception{
	
	ExcelDataConfig config= new ExcelDataConfig("C:\\Users\\dmpasd\\workspace\\LearnAutomation\\TestingData\\DDT.xlsx");
	int rows= config.getRowCount(0);
	
	//array of Objects that contains 3 rows 2 cols 
	//first row is for username and second for password
	Object[][] data=new Object[rows][2];
	for (int i=0;i<rows;i++){
	
		data[i][0]=config.getData(0, i, 0);
		data[i][1]=config.getData(0, i, 1);
	}
	
   return data;
}

}
