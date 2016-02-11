package Other;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;


@SuppressWarnings("ALL")
public class Keywords {
	
    public WebDriver driver;
	
	 public String navigate(String object,String data){
	        APP_LOGS.debug("Navigating to URL");
	        try{
	            driver.navigate().to(data);
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" -- Not able to navigate";
	        }
	        return Constants.KEYWORD_PASS;
	    }

	    public String clickLink(String object,String data){
	        APP_LOGS.debug("Clicking on link ");
	        try{
	            driver.findElement(By.xpath(OR.getProperty(object))).click();
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" -- Not able to click on link"+e.getMessage();
	        }

	        return Constants.KEYWORD_PASS;
	    }

	    public String clickLinkCss(String object,String data){
	        APP_LOGS.debug("Clicking on link ");
	        try{
	            driver.findElement(By.cssSelector(OR.getProperty(object))).click();
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" -- Not able to click on link"+e.getMessage();
	        }

	        return Constants.KEYWORD_PASS;
	    }

	    public String clickLink_linkText(String object,String data){
	        APP_LOGS.debug("Clicking on link ");
	        driver.findElement(By.linkText(OR.getProperty(object))).click();

	        return Constants.KEYWORD_PASS;
	    }



	    public  String verifyLinkText(String object,String data){
	        APP_LOGS.debug("Verifying link Text");
	        try{
	            String actual=driver.findElement(By.xpath(OR.getProperty(object))).getText();
	            String expected=data;

	            if(actual.equals(expected))
	                return Constants.KEYWORD_PASS;
	            else
	                return Constants.KEYWORD_FAIL+" -- Link text not verified";

	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" -- Link text not verified"+e.getMessage();

	        }

	    }


	    public  String clickButton(String object,String data){
	        APP_LOGS.debug("Clicking on Button");
	        try{
	            driver.findElement(By.xpath(OR.getProperty(object))).click();
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" -- Not able to click on Button"+e.getMessage();
	        }


	        return Constants.KEYWORD_PASS;
	    }

	    public  String clickButtonCss(String object,String data){
	        APP_LOGS.debug("Clicking on Button");
	        try{
	            driver.findElement(By.cssSelector(OR.getProperty(object))).click();
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" -- Not able to click on Button"+e.getMessage();
	        }


	        return Constants.KEYWORD_PASS;
	    }

	    public  String verifyButtonText(String object,String data){
	        APP_LOGS.debug("Verifying the button text");
	        try{
	            String actual=driver.findElement(By.xpath(OR.getProperty(object))).getText();
	            String expected=data;

	            if(actual.equals(expected))
	                return Constants.KEYWORD_PASS;
	            else
	                return Constants.KEYWORD_FAIL+" -- Button text not verified "+actual+" -- "+expected;
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" Object not found "+e.getMessage();
	        }

	    }
	
	    public String verifyText(String object, String data){
	        APP_LOGS.debug("Verifying the text");
	        try{
	            String actual=driver.findElement(By.xpath(OR.getProperty(object))).getText();
	            String expected=data;

	            if(actual.equals(expected))
	                return Constants.KEYWORD_PASS;
	            else
	                return Constants.KEYWORD_FAIL+" -- text not verified "+actual+" -- "+expected;
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" Object not found "+e.getMessage();
	        }

	    }

	    public  String writeInInput(String object,String data){
	        APP_LOGS.debug("Writing in text box");

	        try{
	            driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(data);
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" Unable to write "+e.getMessage();

	        }
	        return Constants.KEYWORD_PASS;

	    }

	    public  String writeInInputCss(String object,String data){
	        APP_LOGS.debug("Writing in text box");

	        try{
	            driver.findElement(By.cssSelector(OR.getProperty(object))).sendKeys(data);
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" Unable to write "+e.getMessage();

	        }
	        return Constants.KEYWORD_PASS;

	    }

	    public  String verifyTextinInput(String object,String data){
	        APP_LOGS.debug("Verifying the text in input box");
	        try{
	            String actual = driver.findElement(By.xpath(OR.getProperty(object))).getAttribute("value");
	            String expected=data;

	            if(actual.equals(expected)){
	                return Constants.KEYWORD_PASS;
	            }else{
	                return Constants.KEYWORD_FAIL+" Not matching ";
	            }

	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" Unable to find input box "+e.getMessage();

	        }
	    }
	    public  String verifyTitle(String object, String data){
	        APP_LOGS.debug("Verifying title");
	        try{
	            String actualTitle= driver.getTitle();
	            String expectedTitle=data;
	            if(actualTitle.equals(expectedTitle))
	                return Constants.KEYWORD_PASS;
	            else
	                return Constants.KEYWORD_FAIL+" -- Title not verified "+expectedTitle+" -- "+actualTitle;
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" Error in retrieving title";
	        }
	    }

	    public String exist(String object,String data){
	        APP_LOGS.debug("Checking existance of element");
	        try{
	            driver.findElement(By.xpath(OR.getProperty(object)));
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+" Object doest not exist";
	        }


	        return Constants.KEYWORD_PASS;
	    }
	    
	    public  String synchronize(String object,String data){
	        APP_LOGS.debug("Waiting for page to load");
	        ((JavascriptExecutor) driver).executeScript(
	                "function pageloadingtime()"+
	                        "{"+
	                        "return 'Page has completely loaded'"+
	                        "}"+
	                        "return (window.onload=pageloadingtime());");

	        return Constants.KEYWORD_PASS;
	    }
	    
	    public  String waitForElementVisibility(String object,String data){
	        APP_LOGS.debug("Waiting for an element to be visible");
	        int start=0;
	        int time=(int)Double.parseDouble(data);
	        try{
	            while(time == start){
	                if(driver.findElements(By.xpath(OR.getProperty(object))).size() == 0){
	                    Thread.sleep(1000L);
	                    start++;
	                }else{
	                    break;
	                }
	            }
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+"Unable to close browser. Check if its open"+e.getMessage();
	        }
	        return Constants.KEYWORD_PASS;
	    }

	    public  String closeBrowser(String object, String data){
	        APP_LOGS.debug("Closing the browser");
	        try{
	            driver.close();
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+"Unable to close browser. Check if its open"+e.getMessage();
	        }
	        return Constants.KEYWORD_PASS;

	    }
	    
	    
	    public  String quitBrowser(String object, String data){
	        APP_LOGS.debug("Closing the browser");
	        try{
	            driver.quit();
	        }catch(Exception e){
	            return Constants.KEYWORD_FAIL+"Unable to close browser. Check if its open"+e.getMessage();
	        }
	        return Constants.KEYWORD_PASS;

	    }
	    
	    public String validateLogin(String object, String data){
	        // object of the current test XLS
	        // name of my current test case
	        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
	        String data_flag = currentTestSuiteXLS.getCellData(currentTestCaseName, "Data_correctness",currentTestDataSetID );

	        try{

	            String expected=driver.findElement(By.xpath(OR.getProperty("myAccount_link"))).getText();
	            String unexpected=driver.findElement(By.cssSelector(OR.getProperty("login_signIn_button_css"))).getText();


	            if(expected.equals(null))
	                if(!data_flag.equals(Constants.POSITIVE_DATA))
	                    return Constants.KEYWORD_PASS;
	                else
	                    return Constants.KEYWORD_FAIL;


	        }catch(Exception e){

	        }


	        // check for page title
	        if(data_flag.equals(Constants.POSITIVE_DATA))
	            return Constants.KEYWORD_PASS;
	        else
	            return Constants.KEYWORD_FAIL;
	    }

	    public void captureScreenshot(String filename, String keyword_execution_result) throws IOException{
	        // take screen shots
	        if(CONFIG.getProperty("screenshot_everystep").equals("Y")){
	            // capturescreen

	            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") +"//screenshots//"+filename+".jpg"));

	        }else if (keyword_execution_result.startsWith(Constants.KEYWORD_FAIL) && CONFIG.getProperty("screenshot_error").equals("Y") ){
	            // capture screenshot
	            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") +"//screenshots//"+filename+".jpg"));
	        }
	    }
	
	
}
