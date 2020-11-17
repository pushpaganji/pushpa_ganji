package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Users {
	
	WebDriver driver;
	public Users(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//input[@id='Btnuser']")
	public WebElement New_User;
	
	@FindBy(xpath = "//select[@id='lst_branchS']")
	public WebElement Select_Branch_Name;
	
	@FindBy(xpath = "//select[@id='lst_rolesS']")
	public WebElement Select_Roles;
	
	@FindBy(xpath = "//input[@id='btn_search']")
	public WebElement Search_btn;
	
	@FindBy(xpath = "//input[@id='btn_clear']")
	public WebElement Clear_btn;
	
	@FindBy(xpath = "(//td[contains(.,'Edit')])[2]")
	public WebElement Edit;
	
	@FindBy(xpath = "(//td[contains(.,'Delete')])[2]")
	public WebElement Delete;
	
	public void Select_Select_Branch_Name(String branch_name)
	{
		new Select(driver.findElement(By.id("lst_branchS"))).selectByVisibleText(branch_name);
	}
	public void Select_Select_Roles(String role_name)
	{
		new Select(driver.findElement(By.id("lst_rolesS"))).selectByVisibleText(role_name);
	}
	public void Click_On_Search_btn()
	{
		Search_btn.click();
	}
	public void Click_On_Clear_btn()
	{
		Clear_btn.click();
	}
	
}
	
	
	
	
	
	

