package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_Role_Creation {
	
	WebDriver driver;
	public New_Role_Creation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='txtRname']")
	public WebElement Enter_Role_Name;
	
	@FindBy(xpath = "//input[@id='txtRDesc']")
	public WebElement Enter_Role_Description;
	
	@FindBy(xpath = "//select[@id='lstRtypeN']")
	public WebElement Role_Type;
	
	@FindBy(xpath = "//input[@id='btninsert']")
	public WebElement Submit_btn;
	
	@FindBy(xpath = "//input[@id='Btn_Reset']")
	public WebElement Reset_btn;
	
	@FindBy(xpath = "//input[@id='Btn_cancel']")
	public WebElement Cancel_btn;
	
	public void Type_Enter_Role_Name(String role_name)
	{
		Enter_Role_Name.clear();
		Enter_Role_Name.sendKeys(role_name);
	}
	
	public void Type_Enter_Role_Description(String role_desc)
	{
		Enter_Role_Description.clear();
		Enter_Role_Description.sendKeys(role_desc);
	}
	public void Role_Type(String role_type)
	{
		new Select(driver.findElement(By.id("lstRtypeN"))).selectByVisibleText(role_type);
	}
	public void Click_On_Submit_btn()
	{
		Submit_btn.click();
	}
	public void Click_On_Reset_btn()
	{
		Reset_btn.click();
	}
	public void Click_On_Cancel_btn()
	{
		Cancel_btn.click();
	}

}
