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
import web_pages.Branch_Updation;
import web_pages.Branches;
import web_pages.Employee_Updation;
import web_pages.Employees;
import web_pages.RanfordHome;
import web_pages.Roles;
import web_pages.Roles_Updation;
import web_pages.User_Updation;
import web_pages.Users;

public class Test_Updations {

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
	public void Click_On_BranchEdit_Button() throws InterruptedException
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
		Branches branches= new Branches(driver);
		branches.Click_On_Edit();
		Assert.assertTrue(branches.Is_Updation_Page_Displayed());
		Branch_Updation BU= new Branch_Updation(driver);
		BU.Type_Branch_Name("HayathNagar");
		BU.Type_Address1("Delhi");
		BU.Type_Address2("Mumbai");
		BU.Type_Address3("asdfkjjr");
		BU.Type_Area("SaiNagar");
		BU.Type_Zipcode("67890");
		BU.Click_On_Update_btn();
		 Assert.assertTrue(BU.is_AlertPresent());
		 BU.close_Alert();
	      Thread.sleep(5000);
		
}
@Test(priority=1)
	public void Click_On_BranchDelete_Button() throws InterruptedException
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
		Branches branches= new Branches(driver);
		branches.Click_On_Delete();
		Assert.assertTrue(branches.is_AlertPresent());
		 branches.close_Alert();
		 branches.close_Alert();
	      Thread.sleep(3000);
	}
@Test(priority=2)
	public void Click_On_RolesUpdate_Button() throws InterruptedException
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);
		RHP.Click_On_Login();     
		Thread.sleep(3000);
		AdminHome AH= new AdminHome(driver);
		AH.Click_On_Roles_info();
		Roles roles= new Roles(driver);
		roles.Click_On_Edit_btn();
		Roles_Updation RU= new Roles_Updation(driver);
		RU.Type_Enter_Role_Name("virinchi");
		RU.Type_Enter_Role_Description("Mumbai");
		RU.Select_Role_Type("C");
		RU.Click_On_Update_btn();
		 Thread.sleep(2000);
	     Assert.assertTrue(RU.is_AlertPresent());
	     RU.close_Alert();
		
	
	}
@Test(priority=3)
	public void Click_On_RolesDelete_Button() throws InterruptedException
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);
		RHP.Click_On_Login();     
		Thread.sleep(3000);
		AdminHome AH= new AdminHome(driver);
		AH.Click_On_Roles_info();
		Roles roles= new Roles(driver);
        roles.Click_On_Delete_btn();
        Assert.assertTrue(roles.is_AlertPresent());
        roles.close_Alert();
        roles.close_Alert();
	}

@Test(priority=4)
	public void Click_On_UsersUpdate_Button() throws InterruptedException
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);
		RHP.Click_On_Login();     
		Thread.sleep(3000);
		AdminHome AH= new AdminHome(driver);
		AH.Click_On_Users_info();
		Users users= new Users(driver);
		users.Click_On_Edit_btn();
		User_Updation UU= new User_Updation(driver);
		UU.Type_Enter_UserName("jklmn");
		UU.Type_Enter_Password("admin");
		UU.Type_Enter_Transaction_Password("shekarVarma");
		UU.Click_On_Update_btn();
		Assert.assertTrue(UU.is_AlertPresent());
		UU.close_Alert();
	
	}

@Test(priority=5)
	public void Click_On_UsersDelete_Button() throws InterruptedException
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);
		RHP.Click_On_Login();     
		Thread.sleep(3000);
		AdminHome AH= new AdminHome(driver);
		AH.Click_On_Users_info();
		Users users= new Users(driver);
        users.Click_On_Delete_btn();
        Assert.assertTrue(users.is_AlertPresent());
        users.close_Alert();
        users.close_Alert();
	
	}

@Test(priority=6)
	public void Click_On_EmployeeUpdate_Button() throws InterruptedException
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);
		RHP.Click_On_Login();     
		Thread.sleep(3000);
		AdminHome AH= new AdminHome(driver);
	    AH.Click_On_Employee_info();
	    Employees emp= new Employees(driver);
	    emp.Click_On_Edit_btn();
	    Employee_Updation EU=new Employee_Updation(driver);
	    EU.Type_Employee_Name("subhashini");
	    Thread.sleep(2000);
	    EU.Select_Role_Name("Chandra");
	    Thread.sleep(2000);
	    EU.Select_Branch("HayathNagar");
	    Thread.sleep(2000);
	    EU.Click_On_Update_btn();
	    Assert.assertTrue(EU.is_AlertPresent());
	    EU.close_Alert();
	}
	
	
	@Test(priority=7)
	public void Click_On_EmployeeDelete_Button() throws InterruptedException
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);
		RHP.Click_On_Login();     
		Thread.sleep(3000);
		AdminHome AH= new AdminHome(driver);
	    AH.Click_On_Employee_info();
	    Employees emp= new Employees(driver);
	    emp.Click_On_Delete_btn();
	    Assert.assertTrue(emp.is_AlertPresent());
	    emp.close_Alert();
	    Thread.sleep(3000);
	    emp.close_Alert();
	    emp.close_Alert();
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