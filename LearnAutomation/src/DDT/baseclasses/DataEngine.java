package DDT.baseclasses;

import org.openqa.selenium.By;

import DDT.helpers.ButtonHelper;
import DDT.helpers.GenericHelper;

import org.apache.tools.ant.ComponentHelper;
import org.apache.tools.ant.ComponentHelper.*;
import DDT.helpers.*;
//import org.openqa.selenium.ComponentHelper;
//public class DataEngine {
	
	
	public class DataEngine{
		
		private int _keywordCol;
		private int _locatorTypeCol;
		private int _locatorValueCol;
		private int _parameterCol;
		
		public DataEngine(int keywordCol,int locatorTypeCol,int locatorValueCol,int parameterCol){
			
			this._keywordCol= keywordCol;
			this._locatorTypeCol= locatorTypeCol;
			this._locatorValueCol= locatorValueCol;
			this._parameterCol= parameterCol;
		
		}
	
	private By GetElementLocator(String locatorType,String locatorValue){
		switch(locatorType)
		{
		case"ClassName":
			return By.className(locatorValue);
		case"id":
			return By.id(locatorValue);
		case"Name":
			return By.name(locatorValue);
		case"Xpath":
			return By.xpath(locatorValue);
		default:
			return By.xpath(locatorValue);
		}	
		
	}
		
	public By PerformAction(String keyword,String locatorType,String locatorValue){
		switch(keyword)
		{
		case"Click":
			ButtonHelper.click(GetElementLocator(locatorType,locatorValue));
			break;
			//return By.className(locatorValue);
		case"SendKeys":
			TextBoxHelper.TypeInTextBox(GetElementLocator(locatorType,locatorValue));
			break;
			//return By.id(locatorValue);
		case"WaitForFile":
			GenericHelper.waitForElement(GetElementLocator(locatorType,locatorValue));
			break;
			//return By.name(locatorValue);
		case"Navigate":
			NavigationHelpet.
			break;
			
			//return By.xpath(locatorValue);
		default:
			throw_new NoKeywordFoundException("Keyword Not Found"+ keyword);
			//return By.xpath(locatorValue);
		}	
		
	}
	
	
	}
	
	
	


