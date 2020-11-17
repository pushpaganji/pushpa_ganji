package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roles {
	
	WebDriver driver;
	public Roles(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

    }	
	@FindBy(xpath = "//input[@id='btnRoles']")
	public WebElement New_Role;
		
	@FindBy(xpath = "(//td[contains(.,'Edit')])[2]")
	public WebElement Edit_btn;
	
	@FindBy(xpath = "(//td[contains(.,'Delete')])[2]")
	public WebElement Delete_btn;
	
	public void Click_On_New_Role()
	{
		New_Role.click();
	}
	public void Click_On_Edit_btn()
	{
		Edit_btn.click();
	}
    public void Click_On_Delete_btn()
    {
    	Delete_btn.click();
    }
}
