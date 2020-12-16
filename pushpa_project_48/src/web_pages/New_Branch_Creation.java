package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_Branch_Creation {
	
	WebDriver driver;
	private String url="http://122.175.8.158/Ranford2/home.aspx";
	private String title="admin_banker_master";
	public New_Branch_Creation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='BtnNewBR']")
	public WebElement New_Branch;
		
	@FindBy(xpath = "//input[@id='txtbName']")
	public WebElement Branch_Name;
	
	@FindBy(xpath = "//input[@id='txtAdd1']")
	public WebElement Address1;
	
	@FindBy(xpath = "//input[@id='Txtadd2']")
	public WebElement Address2;
	
	@FindBy(xpath = "//input[@id='txtadd3']")
	public WebElement Address3;
	
	@FindBy(xpath = "//input[@id='txtArea']")
	public WebElement Area;
	
	@FindBy(xpath = "//input[@id='txtZip']")
	public WebElement Zipcode;
	
	@FindBy(xpath = "//select[@id='lst_counrtyU']")
	public WebElement Select_Country_Name;
	
	@FindBy(xpath = "//select[@id='lst_stateI']")
	public WebElement Select_State_Name;
	
	@FindBy(xpath = "//select[@id='lst_cityI']")
	public WebElement Select_City;
	
	@FindBy(xpath = "//input[@id='btn_insert']")
	public WebElement Submit_btn;
	
	@FindBy(xpath = "//input[@id='Btn_Reset']")
	public WebElement Reset_btn;
	
	@FindBy(xpath = "//input[@id='Btn_cancel']")
	public WebElement Cancel_btn;
	
	@FindBy(xpath="//a[href='admin_banker_master.aspx']")
	public WebElement Admin_Bank;
	

	public void Click_On_New_Branch()
	{
		New_Branch.click();
	}
	public boolean Is_NewBranch_Page_Displayed()
	{

		String Runtime_title=driver.getTitle();
		boolean flag= Runtime_title.contains(title);
		return flag;
	}
	public void Type_Branch_Name(String name)
	{
		Branch_Name.clear();
		Branch_Name.sendKeys(name);
	}
	public void Type_Address1(String address1)
	{
		Address1.clear();
		Address1.sendKeys(address1);
	}
	public void Type_Address2(String address2)
	{
		Address2.clear();
		Address2.sendKeys(address2);
	}
	public void Type_Address3(String address3)
	{
		Address3.clear();
		Address3.sendKeys(address3);
	}
	public void Type_Area(String area)
	{
		Area.clear();
		Area.sendKeys(area);
	}
	public void Type_Zipcode(String zipcode)
	{
		Zipcode.clear();
		Zipcode.sendKeys(zipcode);
	}
	public void Select_Select_Country_Name(String country_name)
	{
		new Select(driver.findElement(By.id("lst_counrtyU"))).selectByVisibleText(country_name);
	}
	public void Select_Select_State_Name(String state_name)
	{
		new Select(driver.findElement(By.id("lst_stateI"))).selectByVisibleText(state_name);
	}
	public void Select_Select_City(String city_name)
	{
		new Select(driver.findElement(By.id("lst_cityI"))).selectByVisibleText(city_name);
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
