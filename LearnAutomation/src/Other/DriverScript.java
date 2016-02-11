package Other;



import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;

import Lib.ExcelDataConfig;
public class DriverScript {

	
	 public static Logger APP_LOGS;
	    //suite.xlsx
//	    public ExcelDataConfig config;
	    public int currentSuiteID;
	    public String currentTestSuite;

	    // current test suite
	    public static ExcelDataConfig currentTestconfig;
	    public static int currentTestCaseID;
	    public static String currentTestCaseName;
	    public static int currentTestStepID;
	    public static String currentKeyword;
	    public static int currentTestDataSetID=2;
	    public static Method method[];
	    public static Method capturescreenShot_method;


	    public static Keywords keywords;
	    public static String keyword_execution_result;
	    public static ArrayList<String> resultSet;
	    public static String data;
	    public static String object;

	    // properties
	    public static Properties CONFIG;
	    public static Properties OR;

	    public DriverScript() throws NoSuchMethodException, SecurityException{
	        keywords = new Keywords();
	        method = keywords.getClass().getMethods();
	        capturescreenShot_method =keywords.getClass().getMethod("captureScreenshot",String.class,String.class);
	    }

	    public static void main(String[] args) throws Exception {
	        FileInputStream fs = new FileInputStream("src/test/java/com/totsy/config/config.properties");
	        CONFIG= new Properties();
	        CONFIG.load(fs);

	        fs = new FileInputStream("src/test/java/com/totsy/config/or.properties");
	        OR= new Properties();
	        OR.load(fs);

	        //System.out.println(CONFIG.getProperty("testsiteURL"));
	        //System.out.println(OR.getProperty("name"));


	        DriverScript test = new DriverScript();
	        test.start();
	    }
//
//
	    public void start() throws Exception{

	    
	    	
	    }
	
}
