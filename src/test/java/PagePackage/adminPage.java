package PagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class adminPage
{
	WebDriver driver;
	public adminPage(WebDriver driver)
	{
		this.driver=driver;	
		}
	By sideNav_Admin= By.xpath("//span[text()='Admin']");
	By username = By.xpath("//label[text()='Username']/following::input[1]");
	By userRole= By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'][1]");
	By clickADMINOption= By.xpath("//div[@role='option']//span[text()='Admin']");
	
	By empName= By.xpath("//label[text()='User Role']/following::input[1]");
	By status= By.xpath("//div[text()='-- Select --']");
	
	
	public void sideNavItems1()	
	{
		driver.findElement(sideNav_Admin).click();
		}
	
	public void username(String username1)
	 {
		 driver.findElement(username).sendKeys(username1);
		
	 }
	public void userRoleClick()
	{
		WebElement Role =driver.findElement(userRole);
		Role.click();
		
		Actions act= new Actions(driver);
		WebElement AdminOption =driver.findElement(clickADMINOption);
		act.moveToElement(AdminOption).click().perform();	
	}
	
	public void EmpName(String name)
	{
		driver.findElement(empName).sendKeys(name);
	}
	
	public void statusClick()
	{
		driver.findElement(status).click();
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
	}
}
