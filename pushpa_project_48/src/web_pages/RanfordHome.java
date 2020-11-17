package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RanfordHome {
	
	WebDriver driver;
	public String url="http://122.175.8.158/Ranford2/home.aspx";
	public String title="MINDQ RANFORD BANK";
	public RanfordHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.get(url);
	}
   
	@FindBy(xpath="//a[@href='http://ravinderbasani.com']")
	public WebElement Home_btn;
	
	@FindBy(xpath="//a[@href='personal_banking.html']")
	public WebElement Personal_Banking_btn;
	
	@FindBy(xpath="//a[@ href='Corporate Banking.html']")
	public WebElement Corporate_Banking_btn;
	
	@FindBy(xpath="//a[@href='International Banking.html']")
	public WebElement International_Banking_btn;
	
	@FindBy(xpath="//a[@href='aboutus.html']")
	public WebElement About_us_btn; 
	
	@FindBy(xpath = "//select[@id='drlist']")
	public WebElement Branch_Name;
	
	@FindBy(xpath = "//input[@type='text']")
	public WebElement Username;
	
	@FindBy(xpath = "//input[@id='login']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='login']")
	public WebElement Login;
	
	@FindBy(xpath = "//a[@href='customerServices.html']")
	public WebElement Customer_Service;
	
	@FindBy(xpath = "//a[@href='faqs.html']")
	public WebElement Internet_Banking;
	
	@FindBy(xpath = "//a[@href='privacy.html']")
	public WebElement Privacy;
	
	@FindBy(xpath = "//a[@href='terms&conditions.html']")
	public WebElement Terms_and_Conditions;
	
	@FindBy(xpath = "//a[@href='disclaimer.html']")
	public WebElement Disclaimer;
	
	@FindBy(xpath = "//a[@href='sitemap.html']")
	public WebElement Site_Map;

    public void Click_On_Home_btn()
    {
          Home_btn.click();
    }
    public void Click_on_Personal_Banking_btn()
    {
    	Personal_Banking_btn.click();
    }
    public void Click_On_Corporate_Banking_btn()
    {
    	Corporate_Banking_btn.click();
    }
    public void Click_On_International_Banking_btn()
    {
    	International_Banking_btn.click();
    }
    public void Select_Branch_Name()
    {
    	Branch_Name.click();
    }
    public void Type_Username(String username)
    {
    	Username.clear();
    	Username.sendKeys("admin");
     }
    public void Type_password(String pwd)
    {
    	password.clear();
    	password.sendKeys("M1ndq");
    }
    public void Click_On_Login()
    {
    	Login.click();
    }
	public boolean Is_Ranford_Homepage_Opened()
	{
		String Runtime_title=driver.getTitle();
		boolean flag= Runtime_title.contains(title);
		return flag;
	}
    public void Click_On_Customer_Service()
    {
    	Customer_Service.click();
    }
    public void Click_On_Internet_Banking()
    {
    	Internet_Banking.click();
    }
       public void Click_On_Privacy()
    {
    	Privacy.click();
    }
    public void Terms_and_Conditions()
    {
    	Terms_and_Conditions.click();
    }
    public void Disclaimer()
    {
    	Disclaimer.click();
    }
    public void Site_Map()
    {
    	Site_Map.click();
    }
    public void Enter_Admin_Banker_Login(String username,String password)
	{
		Type_Username(username);
		Type_password(password);
		Click_On_Login();
		
	}
}
	
	

