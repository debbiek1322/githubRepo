package DDT.helpers;
import DDT.objectrepo.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DDT.baseclasses.*;


public class NavigationHelpet{
	
public static void navigateToWebsite() {
	ObjectRepository.driver.navigate().to(ObjectRepository.config.getWebSite());
	
}

public static void navigateToWebsite(String webSite) {
	ObjectRepository.driver.navigate().to(webSite);
}
}
