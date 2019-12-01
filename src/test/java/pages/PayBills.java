package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills {

	WebDriver driver;
	public PayBills(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Pay Bills']")
	public WebElement paybilltb;
	
	@FindBy(xpath="//a[text()='Add New Payee']")
	public WebElement addpayeetb;
	
	@FindBy(id="np_new_payee_name")
	public WebElement name;
	
	@FindBy(id="np_new_payee_address")
	public WebElement address;
	
	@FindBy(id="np_new_payee_account")
	public WebElement account;
	
	
	@FindBy(id="np_new_payee_details")
	public WebElement details;
	
	@FindBy(id="add_new_payee")
	public WebElement Addbtn;
	

public void PayBills()
{
	paybilltb.click();
		
	}
public void AddNewPayee()
{
	addpayeetb.click();
}
public void ClickAddBtn()
{
	Addbtn.click();
}


//Create a method
	public void InputPayeeDetails()
	{ 
		name.sendKeys("Hema");
		address.sendKeys("Yarmouth");
		account.sendKeys("124578");
		details.sendKeys("personal");
		
		}
}
