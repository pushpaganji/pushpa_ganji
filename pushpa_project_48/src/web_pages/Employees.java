package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employees {

	WebDriver driver;
	private String url="http://122.175.8.158/Ranford2/home.aspx";
	private String title="Employee Updation";
	public Employees(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
    @FindBy(xpath="//a[@href='adminflow.aspx']")
	public WebElement New_Employee;
	
    @FindBy(xpath = "(//img[@src='images/b-edit.png'])[1]")
    public WebElement Edit_btn;
	
    @FindBy(xpath = "(//img[contains(@src,'delete.gif')])[1]")
    public WebElement Delete_btn;
    public boolean Is_Employee_Updation_Page_Displayed()
    {
 	   String Runtime_title=driver.getTitle();
 		boolean flag= Runtime_title.contains(title);
 		return flag;
 	}
	public void Click_On_New_Employee()
	{
	    New_Employee.click();
	}
	public void Click_On_Edit_btn()
	{
		Edit_btn.click();
	}
	public void Click_On_Delete_btn()
	{
		Delete_btn.click();
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



