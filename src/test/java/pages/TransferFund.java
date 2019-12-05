package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFund {
	
	WebDriver driver;
	public TransferFund(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="transfer_funds_tab")
	public WebElement transfundtab;
	
	@FindBy(id="tf_fromAccountId")
	public WebElement fromacc;
	
	@FindBy(id="tf_toAccountId")
	public WebElement toacc;
	
	@FindBy(id="tf_amount")
	public WebElement amount;
	
	@FindBy(id="tf_description")
	public WebElement description;
	
	@FindBy(id="btn_submit")
	public WebElement continuetb;
	
	@FindBy(id="btn_submit")
	public WebElement submitbtn;
	
	public void TransferFund()
	{
		transfundtab.click();
	}
	
	public void ClickContinuebtn()
	{
		continuetb.click();	
	}
	
	public void Submitbtn()
	{
		submitbtn.click();
	}
	
	//Create a method
		public void InputFundDetails()
		{ 
			fromacc.sendKeys("3");
			toacc.sendKeys("2");
			amount.sendKeys("4554");
			description.sendKeys("family");
			
			}
}
