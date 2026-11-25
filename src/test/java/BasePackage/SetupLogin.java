package BasePackage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PagePackage.DashboardPage;
import PagePackage.LoginPage;
import PagePackage.SideNavigation;
import PagePackage.adminPage;

public class SetupLogin 
{
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	void setup(String browser)
	{
		//ChromeOptions op= new ChromeOptions();
		//op.addArguments("--Incognito");
		switch(browser)
		{
		case "chrome":
		driver = new  ChromeDriver();
		break;
		
		case "edge":
		driver= new EdgeDriver();
		break;
		
		case "firefox":
		driver= new FirefoxDriver();
		break;	
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
	}
	
	@Test(priority=1)
	public void validLogin() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.login("Admin","admin123");	
		
		DashboardPage dp= new DashboardPage(driver);
		Assert.assertEquals(dp.dashboardText(),true);
		//Thread.sleep(2000);	
	}
	
	@Test(priority=2)
	public void ForgetPass() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.ForgetPassword();
		//Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void SocialMediaLinks() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.sociallinks();
		//Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void sidebarLinks() throws InterruptedException
	{
		this.validLogin();
		SideNavigation link=new SideNavigation(driver);
		link.sideNavItems1();
		link.sideNavItems2();
		link.sideNavItems3();
		link.sideNavItems4();
		link.sideNavItems5();
		link.sideNavItems6();
		link.sideNavItems7();
		link.sideNavItems8();
		link.sideNavItems9();
		link.sideNavItems10();
		link.sideNavItems11();
		link.sideNavItems12();
		
		
		//Thread.sleep(2000);
	}
	
	
	@Test(priority=5)
	public void admin() throws InterruptedException 
	{	
		this.validLogin();
		SideNavigation link=new SideNavigation(driver);
		link.sideNavItems1();
		adminPage ap= new adminPage(driver);
		ap.username("TestChoucair2");
		ap.userRoleClick();
		ap.EmpName("Dasharath K");
		ap.statusClick();
		Thread.sleep(2000);
	}
	
	
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
		
	}
}
