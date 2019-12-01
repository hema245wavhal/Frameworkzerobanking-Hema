package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountSummaryPage;
import pages.Loginpage;
import pages.PayBills;
import pages.WelcomePage;

public class Testcase_AddPayee {

	WebDriver driver;
	Loginpage lp;
	WelcomePage wp;
    PayBills pb;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   lp=new Loginpage(driver);
		   wp=new WelcomePage(driver);
		   AccountSummaryPage ap=new AccountSummaryPage(driver);
		   pb=new PayBills(driver);
		    driver.get("http://zero.webappsecurity.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test
	public void VerifyAddPayee()
	{
		wp.clickSignInBtn();
		lp.DoLogin("username", "password");
	    pb.PayBills();
		pb.AddNewPayee();
		pb.InputPayeeDetails();
		pb.ClickAddBtn();
	}
		
	
	
	@AfterMethod 
	public void tearDown()
	{
	driver.quit();
	}
}