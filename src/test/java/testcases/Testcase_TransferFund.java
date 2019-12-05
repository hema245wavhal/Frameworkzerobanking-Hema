package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountSummaryPage;
import pages.Loginpage;
import pages.PayBills;
import pages.TransferFund;
import pages.WelcomePage;

public class Testcase_TransferFund {
	
	WebDriver driver;
	Loginpage lp;
	WelcomePage wp;
    PayBills pb;
    TransferFund TF;
    
    @BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   lp=new Loginpage(driver);
		   wp=new WelcomePage(driver);
		   AccountSummaryPage ap=new AccountSummaryPage(driver);
		   pb=new PayBills(driver);
		    TF=new TransferFund(driver);
		    driver.get("http://zero.webappsecurity.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
    @Test
	public void VerifyAddPayee() throws InterruptedException
	{
		wp.clickSignInBtn();
		lp.DoLogin("username", "password");
	    TF.TransferFund();
	    Thread.sleep(2000);
	    TF.InputFundDetails();
	    TF.ClickContinuebtn();
	    Thread.sleep(2000);
	    TF.Submitbtn();
		}
    
    @AfterMethod
    public void teardown() {
  	  driver.quit();
    }
}
