package web_pages.Personal_Banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MoneyTransfer_within_Ranford {
	
	WebDriver driver;
	public MoneyTransfer_within_Ranford(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@src='images/money_but.jpg']")
	public WebElement Money_transfer;
	
	@FindBy(xpath = "//a[@id='lnk_samebr']")
	public WebElement Transfer_Funds_within_Ranford;
	
	@FindBy(xpath = "//input[@id='txtaCCNO']")
	public WebElement Receivers_Account_No;
	
	@FindBy(xpath = "//input[@id='txtTPWD']")
	public WebElement Transaction_Password;
	
	@FindBy(xpath = "//select[@id='lst_branchname']")
	public WebElement Receivers_BranchName;

	@FindBy(xpath = "//input[@id='btnsubmit']")
	public WebElement Continue_btn;
	
	@FindBy(xpath = "//input[@id='btncancel']")
	public WebElement Cancel_btn;
	
	
	
	
	
	
	public void Click_On_Money_transfer()
	{
		Money_transfer.click();
	}
	public void Click_On_Transfer_Funds_within_Ranford()
	{
		Transfer_Funds_within_Ranford.click();
	}
	public void Type_Receivers_Account_No(int accountno)
	{
		Receivers_Account_No.clear();
		Receivers_Account_No.sendKeys("3001776101375");
	}
	public void Type_Transaction_Password(int password)
	{
		Transaction_Password.clear();
		Transaction_Password.sendKeys("shekarVarma");
	}
	public void Select_Receivers_BranchName()
	{
		new Select(driver.findElement(By.id("lst_branchname"))).selectByVisibleText("HayathNagar");
	}
	public void Click_On_Continue_btn()
	{
		Continue_btn.click();
	}
	public void Click_On_Cancel_btn()
	{
		Cancel_btn.click();
	}
	
	
}
