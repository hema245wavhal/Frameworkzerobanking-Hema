package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountSummaryPage;
import pages.Loginpage;
import pages.WelcomePage;

public class Testcase_Login {
WebDriver driver;
Loginpage lp;
WelcomePage wp;
AccountSummaryPage asp;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   lp=PageFactory.initElements(driver,Loginpage.class);
		   wp=PageFactory.initElements(driver,WelcomePage.class);
		   asp=PageFactory.initElements(driver,AccountSummaryPage.class);
		   
		    driver.get("http://zero.webappsecurity.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test
	public void login()
	{
		wp.clickSignInBtn();
		lp.DoLogin("username", "password");
		// System.out.println("welcome");
		String expected =driver.getTitle();
		String actual ="Zero - Account Summary";
		Assert.assertEquals(actual,expected);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	
}
