package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_Emp_Creation {
	
	WebDriver driver;
	public New_Emp_Creation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

    }
	@FindBy(xpath = "//input[@id='txtUname']")
	public WebElement Emp_Name;
	
	@FindBy(xpath = "//input[@id='txtLpwd']")
	public WebElement Enter_Password;
	
	@FindBy(xpath = "//select[@id='lst_Roles']")
	public WebElement Select_Role;
	
	@FindBy(xpath = "//select[@id='lst_Branch']")
	public WebElement Select_Branch;
	
	@FindBy(xpath = "//input[@id='BtnSubmit']")
	public WebElement Submit_btn;
	
	@FindBy(xpath = "//input[@id='btnreset']")
	public WebElement Reset_btn;
	
	@FindBy(xpath = "//input[@id='btnCancel']")
	public WebElement Cancel_btn;
	
	public void Type_Emp_Name(String emp_name)
	{
		Emp_Name.clear();
		Emp_Name.sendKeys(emp_name);
	}
	public void Type_Enter_Password(String pwd)
	{
		Enter_Password.clear();
		Enter_Password.sendKeys(pwd);
	}
	public void Select_Select_Role(String role)
	{
		new Select(driver.findElement(By.id("lst_Roles"))).selectByVisibleText(role);
	}
	public void Select_Select_Branch(String branch)
	{
		new Select(driver.findElement(By.id("lst_Branch"))).selectByVisibleText(branch);

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
