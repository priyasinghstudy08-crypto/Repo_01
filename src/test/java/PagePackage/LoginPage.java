package PagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;	
    }
	
	By user = By.xpath("//input[@name='username']");
	By pass= By.xpath("//input[@name='password']");
	By submit = By.xpath("//button[@type='submit']");
	By forget= By.xpath("//p[text()='Forgot your password? ']");
	By linkedIn= By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]");
	By facebook= By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]");
	By twitter=  By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]");
	By youtube= By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]");
	
	public void login(String username, String password)
	 {
		 driver.findElement(user).sendKeys(username);
		 driver.findElement(pass).sendKeys(password);
		 driver.findElement(submit).click();
	 }
	
	public void ForgetPassword()
	{
		 driver.findElement(forget).click();
	}
	
	public void sociallinks()
	{
		 driver.findElement(linkedIn).click();
		 driver.findElement(facebook).click();
		 driver.findElement(twitter).click();
		 driver.findElement(youtube).click();
	}
	


}
