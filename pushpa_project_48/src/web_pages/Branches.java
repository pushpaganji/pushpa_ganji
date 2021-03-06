package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Branches {
	

	WebDriver driver;
	private String url="http://122.175.8.158/Ranford2/home.aspx";
	private String title="BRANCHES PAGE";
	private String title2="admin_banker_master";

	public Branches(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='BtnNewBR']")
	public WebElement New_Branch;
	
	@FindBy(xpath = "//input[@id='txtbnameU']")
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
	
	
	@FindBy(xpath = "//select[@id='lst_countryS']")
	public WebElement Country_Name;
	
	@FindBy(xpath = "//select[@id='lst_stateS']")
	public WebElement StateName;
	
	@FindBy(xpath = "//select[@id='lst_cityS']")
	public WebElement City_Name;
	
	@FindBy(xpath = "//input[@id='btn_search']")
	public WebElement Search_btn;
	
	@FindBy(xpath = "//input[@id='btn_clsearch']")
	public WebElement Clear_Search;
		
	@FindBy(xpath = "(//img[@border='0'])[8]")
	public WebElement Edit;
	
	@FindBy(xpath = "//input[@id='btnupdate']")
	public WebElement Update_btn;
	
	@FindBy(xpath = "(//img[contains(@src,'delete.gif')])[1]")
	public WebElement Delete;
	
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
	public void Select_Country_Name(String country_name)
	{
		new Select(driver.findElement(By.id("lst_countryS"))).selectByVisibleText(country_name);	
	}
	public void Select_State_Name(String state_name)
	{
		new Select(driver.findElement(By.id("lst_stateS"))).selectByVisibleText(state_name);
    }
	public void Select_City_Name(String city_name)
	{
		new Select(driver.findElement(By.id("lst_cityS"))).selectByVisibleText(city_name);
	}
	public void Click_On_Search_btn()
	{
		Search_btn.click();
	}
	public void Click_On_Clear_Search()
	{
		Clear_Search.click();
	}
	public void Click_On_Edit()
	{
		Edit.click();
	}
	public boolean Is_Updation_Page_Displayed()
	{

		String Runtime_title2=driver.getTitle();
		boolean flag= Runtime_title2.contains(title2);
		return flag;
	}
	public void Click_On_Update_btn()
	{
		Update_btn.click();
	}
	public void Click_On_Delete()
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