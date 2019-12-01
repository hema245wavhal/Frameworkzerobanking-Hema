package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
			//Find a Web Element
	@FindBy(id="user_login")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy(name="submit")
	public WebElement submitbtn;
	
	
	//Create a method
	public void DoLogin(String myusername, String mypassword)
	{ 
	username.sendKeys(myusername);
	password.sendKeys(mypassword);
	submitbtn.click();
	}
	
}
