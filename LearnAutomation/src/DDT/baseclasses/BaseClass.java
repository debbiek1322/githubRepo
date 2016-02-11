package DDT.baseclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DDT.helpers.GenericHelper;

public class BaseClass  {  //extends InitializeWebDriver
	
	protected void Logout() {
		if(GenericHelper.isElementPresentQuick(By.xpath("//span[@class='headerMenuPipe']/preceding-sibling::span[contains(text(),'Welcome')]"))){
			WebElement logout = GenericHelper.getElement(By.xpath("//span[@class='headerMenuPipe']/preceding-sibling::span[contains(text(),'Welcome')]"));
			logout = GenericHelper.waitForElementClickAble(logout);
			logout.click();
			logout = GenericHelper.waitForElement(By.xpath("//a[contains(text(),'Log Off')]"));
			logout.click();
			GenericHelper.waitForElement(By.xpath("//div[@class='loginWrapper']"));
		}
		
	}

}
