package PagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver= driver;	
    }
	
	
	By dashboard= By.xpath("//h6[text()='Dashboard']");
	
	public boolean dashboardText()
	{
	  boolean result  = driver.findElement(dashboard).isDisplayed();
	  return result;
	}

}
