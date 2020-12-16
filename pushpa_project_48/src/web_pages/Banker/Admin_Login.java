package web_pages.Banker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin_Login {
	
	WebDriver driver;
	public Admin_Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//select[@id='drlist']")
	public WebElement Branch_Name;
	
	@FindBy(xpath = "//input[@id='txtuId']")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@id='txtPword']")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@id='login']")
	public WebElement Login;
	
	public void Select_Branch_Name()
	{
		Branch_Name.click();
		new Select(driver.findElement(By.name("drlist"))).selectByVisibleText("HayathNagar");

	}
	public void Type_Username(String username)
	{
		Username.clear();
		Username.sendKeys("sriram123");
	}
	public void Type_Password(String pwd)
	{
		Password.clear();
		Password.sendKeys("sriram123");
	}
	public void Click_On_Login()
	{
		Login.clear();
	}

}
