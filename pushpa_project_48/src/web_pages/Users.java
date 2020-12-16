package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Users {
	
	WebDriver driver;
	private String url="http://122.175.8.158/Ranford2/home.aspx";
	private String title="UserDetails";
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
	
	@FindBy(xpath = "(//img[@align='center'])[1]")
	public WebElement Edit;
	
	@FindBy(xpath = "(//img[@border='0'])[9]")
	public WebElement Delete;
	public boolean Is_User_UpdationPage_Displayed()
	{

		String Runtime_title=driver.getTitle();
		boolean flag= Runtime_title.contains(title);
		return flag;
	}
	
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
	public void Click_On_Edit_btn()
	{
		Edit.click();
	}
	public void Click_On_Delete_btn()
	{
		Delete.click();
	}
	 public boolean is_AlertPresent()
		{
			try {
				driver.switchTo().alert();
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		
		
		public void close_Alert()
		{
			if(is_AlertPresent())
				driver.switchTo().alert().accept();
			else
				System.out.println("Alert not presented");
		}
		
		

}

	
	
	
	
	
	

