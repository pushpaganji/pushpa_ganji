package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHome {
	
	WebDriver driver;
	public AdminHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
    
	@FindBy(xpath="//a[@href='adminflow.aspx']")
	public WebElement Home_btn;
	
	@FindBy(xpath="//a[href='change_password.aspx']")
	public WebElement Change_password;
	
	@FindBy(xpath="//a[href='home.aspx']")
	public WebElement Logout;
	
	@FindBy(xpath = "//img[@src='images/Branches_but.jpg']")
	public WebElement Branches_info;
	
	@FindBy(xpath = "//img[@src='images/Roles_but.jpg']")
	public WebElement Roles_info;
	
	@FindBy(xpath = "//img[@src='images/Users_but.jpg']")
	public WebElement Users_info;
	
	@FindBy(xpath = "//img[contains(@src,'btn.jpg')]")
	public WebElement Employee_info;
	
	public void Click_On_Home_btn()
	{
		Home_btn.click();
	}
	public void Click_On_Change_password()
	{
		Change_password.click();
	}
	public void Click_On_Logout()
	{
		Logout.click();
	}
	public void Click_On_Branches_info()
	{
		Branches_info.click();
	}
	public void Click_On_Roles_info()
	{
		Roles_info.click();
	}
	public void Click_On_Users_info()
	{
		Users_info.click();
	}
	public void Click_On_Employee_info()
	{
		Employee_info.click();
	}
	
}
