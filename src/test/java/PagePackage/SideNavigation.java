package PagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideNavigation {

WebDriver driver;
	
	public SideNavigation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By sideNav_Admin= By.xpath("//span[text()='Admin']");
	By sideNav_PIM = By.xpath("//span[text()='PIM']");
	By sideNav_leave = By.xpath("//span[text()='Leave']");
	By sideNav_Time = By.xpath("//span[text()='Time']");
	By sideNav_Rec=  By.xpath("//span[text()='Recruitment']");
	By sideNav_Myinfo=  By.xpath("//span[text()='My Info']");
	By sideNav_Performance=  By.xpath("//span[text()='Performance']");
	By sideNav_dashboard=  By.xpath("//span[text()='Dashboard']");
	By sideNav_Directory=  By.xpath("//span[text()='Directory']");
	By sideNav_Maintenance=  By.xpath("//span[text()='Maintenance']");
	By cancel= By.xpath("//button[@type='button']");
	
	By sideNav_Claim=  By.xpath("//span[text()='Claim']");
	By sideNav_Buzz=  By.xpath("//span[text()='Buzz']");
	
	
	public void sideNavItems1()	 {
		driver.findElement(sideNav_Admin).click();	}
	
	public void sideNavItems2(){
		driver.findElement(sideNav_PIM).click();}
	
	public void sideNavItems3() {
		 driver.findElement(sideNav_leave).click();}
	
	public void sideNavItems4() {
		 driver.findElement(sideNav_Time).click();}
	
	public void sideNavItems5() {
		 driver.findElement(sideNav_Rec).click();}
	
	public void sideNavItems6() {
		 driver.findElement(sideNav_Myinfo).click();
	}
	public void sideNavItems7() {
		 driver.findElement(sideNav_Performance).click();}
	
	public void sideNavItems8() {
		 driver.findElement(sideNav_dashboard).click();}
	
	public void sideNavItems9() {
		 driver.findElement(sideNav_Directory).click();}
	
	public void sideNavItems10() {
		 driver.findElement(sideNav_Maintenance).click();
		 driver.findElement(cancel).click();}
	
	public void sideNavItems11() {
		 driver.findElement(sideNav_Claim).click();}
	
	public void sideNavItems12() {
		 driver.findElement(sideNav_Buzz).click();	
		 
	 }
}
