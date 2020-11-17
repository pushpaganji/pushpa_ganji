package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Branches {
	
	WebDriver driver;
	public Branches(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//input[@id='BtnNewBR']")
	public WebElement New_Branch;
	
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
		
	@FindBy(xpath = "(//td[contains(.,'Edit')])[2]")
	public WebElement Edit;
	
	@FindBy(xpath = "(//td[contains(.,'Delete')])[2]")
	public WebElement Delete;
	
	public void Click_On_New_Branch()
	{
		New_Branch.click();
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
	public void Click_On_Delete()
	{
		Delete.click();
	}
	
	
}