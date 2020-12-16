package web_tests;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web_pages.AdminHome;
import web_pages.New_Branch_Creation;
import web_pages.New_Role_Creation;
import web_pages.RanfordHome;
public class Test_Branches2 {
	WebDriver driver;
	String Driver_Path="webdrivers\\chromedriver.exe";
	String screen_path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\screens";
	
	public String Branch_name="name";
	public String Branch_add1="add1";
	public String Branch_add2="add2";
	public String Branch_add3="add3";
	public String Area="area_name";
	public int Zipcode=12345;
	public String Role_name="name";
	public String Role_Desc="desc";
	public String Role_Type="A";
	
	@Test(priority=0)
	public void Tc004_Click_New_Branch_Button() throws InterruptedException
	
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);
		RHP.Click_On_Login();     
		Thread.sleep(3000);
		AdminHome AH= new AdminHome(driver);
		AH.Click_On_Branches_info();
		New_Branch_Creation NBC= new New_Branch_Creation(driver);
        NBC.Click_On_New_Branch();
        Assert.assertTrue(NBC.Is_NewBranch_Page_Displayed());
		NBC.Type_Branch_Name("abcdefg");
		NBC.Type_Address1("Hyderabad");
		NBC.Type_Address2("Delhi Univers");
		NBC.Type_Address3("Mumbai");
		NBC.Type_Area("Sainagar colony");
        NBC.Type_Zipcode("12345");
        NBC.Select_Select_Country_Name("INDIA");
        NBC.Select_Select_State_Name("Delhi");
        NBC.Select_Select_City("Delhi");
        NBC.Click_On_Submit_btn();
       Assert.assertTrue(NBC.is_AlertPresent());
       NBC.close_Alert();
        Thread.sleep(5000);
}


	@Test(priority=1)
public void Tc004_Enter_Valid_Branch_Details() throws InterruptedException
{
	New_Branch_Creation NBC= new New_Branch_Creation(driver);
	NBC.Click_On_New_Branch();
    Assert.assertTrue(NBC.Is_NewBranch_Page_Displayed());
	NBC.Type_Branch_Name("abcdefgh");
	NBC.Type_Address1("Hyderabad");
	NBC.Type_Address2("Delhi");
	NBC.Type_Address3("Mumbai");
    NBC.Type_Area("Sainagar");
    NBC.Type_Zipcode("46573");
    NBC.Select_Select_Country_Name("INDIA");
    NBC.Select_Select_State_Name("Delhi");
    NBC.Select_Select_City("Delhi");
    NBC.Click_On_Submit_btn();
    Assert.assertTrue(NBC.is_AlertPresent());
    NBC.close_Alert();	
    Thread.sleep(3000);
}	
@Test(priority=2)
public void Tc005_Click_New_Branch_Button()
{
	New_Branch_Creation NBC= new New_Branch_Creation(driver);
	NBC.Click_On_New_Branch();
    Assert.assertTrue(NBC.Is_NewBranch_Page_Displayed());
	NBC.Type_Branch_Name("SriNagarColony");
	NBC.Type_Address1("Hyderabad");
	NBC.Type_Address2("Delhi");
	NBC.Type_Address3("Mumbai");
    NBC.Type_Area("Sainagar");
    NBC.Type_Zipcode("46573");
    NBC.Select_Select_Country_Name("INDIA");
    NBC.Select_Select_State_Name("Delhi");
    NBC.Select_Select_City("Delhi");
    NBC.Click_On_Submit_btn();
    Assert.assertTrue(NBC.is_AlertPresent());
    NBC.close_Alert();	
}
@Test(priority=3)
public void TC005_Admin_Enter_Branch_Name_With_Less_Characters() throws InterruptedException
{
	New_Branch_Creation NBC= new New_Branch_Creation(driver);
	NBC.Click_On_New_Branch();
	NBC.Type_Branch_Name("abc"
			+ ""
			+ "defg");
	NBC.Type_Address1("Hyderabad");
	NBC.Type_Address2("Delhi");
	NBC.Type_Address3("Mumbai");
    NBC.Type_Area("Sainagar");
    NBC.Type_Zipcode("46574");
    NBC.Select_Select_Country_Name("INDIA");
    NBC.Select_Select_State_Name("GOA");
    NBC.Select_Select_City("GOA");
    NBC.Click_On_Submit_btn();
    Assert.assertTrue(NBC.is_AlertPresent());
    NBC.close_Alert();	
    Thread.sleep(3000);
   
}
@Test(priority=4)
public void Tc006_Click_New_Branch_Button() throws InterruptedException
{
	New_Branch_Creation NBC= new New_Branch_Creation(driver);
	NBC.Click_On_New_Branch();
    Assert.assertTrue(NBC.Is_NewBranch_Page_Displayed());
	NBC.Type_Branch_Name("SriNagarColony");
	NBC.Type_Address1("Hyderabad");
	NBC.Type_Address2("Delhi");
	NBC.Type_Address3("Mumbai");
    NBC.Type_Area("Sainagar");
    NBC.Type_Zipcode("46574");
    NBC.Select_Select_Country_Name("INDIA");
    NBC.Select_Select_State_Name("GOA");
    NBC.Select_Select_City("GOA");
    NBC.Click_On_Submit_btn();
    Assert.assertTrue(NBC.is_AlertPresent());
    NBC.close_Alert();	
    Thread.sleep(3000);
}
	@Test(priority=5)
	public void Tcoo6_Leave_all_Mandatory_Fields_and_Click_On_Submit_Button() throws InterruptedException
	{
		New_Branch_Creation NBC= new New_Branch_Creation(driver);
		NBC.Click_On_New_Branch();
        Assert.assertTrue(NBC.Is_NewBranch_Page_Displayed());
        NBC.Click_On_Submit_btn();
        Thread.sleep(3000);
        Assert.assertTrue(NBC.is_AlertPresent());
        NBC.close_Alert();	
        Thread.sleep(3000);
	}
	@Test(priority=6)
	
	public void TCoo7_Click_New_Role_Button() throws InterruptedException 
	{
		AdminHome AH= new AdminHome(driver);
		AH.Click_On_Roles_info();
	   New_Role_Creation NRC= new New_Role_Creation(driver);
	   NRC.Click_On_New_Role();
	   NRC.Is_New_Role_Page_Displayed();
	   NRC.Type_Enter_Role_Name("Avanchi");
	   NRC.Type_Enter_Role_Description("Hyd india");
	   NRC.Role_Type("E");
	   NRC.Click_On_Submit_btn();
	   Assert.assertTrue(NRC.is_AlertPresent());
       NRC.close_Alert();	
	   Thread.sleep(3000);
	   		
	}
	@Test(priority=7)
	public void Tc007_Enter_Valid_Role_Details_and_Click_on_Submit_Button() throws InterruptedException
	{
		
		New_Role_Creation NRC= new New_Role_Creation(driver);
		NRC.Is_New_Role_Page_Displayed();
		NRC.Click_On_New_Role();
		NRC.Type_Enter_Role_Name("Virinchi");
		NRC.Type_Enter_Role_Description("Bangalore 123 ");
		NRC.Role_Type("E");
		NRC.Click_On_Submit_btn();
        Thread.sleep(2000);
        Assert.assertTrue(NRC.is_AlertPresent());
        NRC.close_Alert();	
	
	}
	
	@AfterMethod//Invoke every @Test annotation after.
	  public void afterMethod(Method method) throws Exception 
	  {
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(src, new File(screen_path+method.getName()+".png"));
	  }

	  @BeforeClass//Invoke once before execution of all @Test annotations
	  public void beforeClass() 
	  {
		  System.setProperty("webdriver.chrome.driver", Driver_Path);
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();  
	  }

	  @AfterClass //Invoke once after execution of all @Test annotations
	  public void afterClass() throws InterruptedException 
	  {
		  Thread.sleep(10000);
		  driver.close();
	  }

}
