package testng_Framework.TestSuite;

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

import web_pages.RanfordHome;

public class Test_Branches {
	WebDriver driver;
	String Driver_Path="browser_drivers\\chromedriver.exe";
	String screen_path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\screens";
	
	@Test(priority=0)
	public void Tc001_Admin_login_Invalid_Password() throws InterruptedException 
  {
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username(RHP.Username);
		Thread.sleep(2000);
		RHP.Type_Admin_Banker_password(RHP.password);
		RHP.Click_On_Login();
		
		Assert.assertTrue(RHP.is_AlertPresent());
		RHP.close_Alert();
 }
	@Test(priority=1)
	public void Tc001_Admin_login_Invalid_Username() throws InterruptedException
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("dfjfj");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);

		RHP.Click_On_Login();
        Assert.assertTrue(RHP.is_AlertPresent());
        RHP.close_Alert();
	}

	@Test(priority=2)
	public void Tc001_Admin_login() throws InterruptedException
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);
		RHP.Click_On_Login();
	}
	@Test(priority=3)
	public void Tc002_Admin_login_Invalid_Username() throws InterruptedException
	{
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("abc");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);

		RHP.Click_On_Login();
	    Assert.assertTrue(RHP.is_AlertPresent());
	    RHP.close_Alert();
	    Thread.sleep(5000);
	}
	@Test(priority=4)
	 public void Tc002_Admin_login_valid_username() throws InterruptedException
	 {
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("abc");
		Thread.sleep(2000);

		RHP.Click_On_Login();
	    Assert.assertTrue(RHP.is_AlertPresent());
	    RHP.close_Alert();
	    Thread.sleep(5000);
	 }
	
	@Test(priority=5)
	 public void Tc002_admin_login_valid_password() throws InterruptedException
	 {
		 RanfordHome RHP=new RanfordHome(driver);
			Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
			RHP.Type_Admin_Banker_username("abc");
			RHP.Type_Admin_Banker_password("M1ndq");
			Thread.sleep(2000);
			RHP.Click_On_Login();
	        Assert.assertTrue(RHP.is_AlertPresent());
	        RHP.close_Alert();
	        Thread.sleep(5000);
	 
	 }
	 @Test(priority=6)
	 public void Tc002_Admin_login() throws InterruptedException
		{
			RanfordHome RHP=new RanfordHome(driver);
			Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
			RHP.Type_Admin_Banker_username("Admin");
			RHP.Type_Admin_Banker_password("M1ndq");
			Thread.sleep(2000);
			RHP.Click_On_Login();
	        Thread.sleep(5000);
		}
	 @Test(priority=7)
	   public void Tc003_Admin_login_valid_username() throws InterruptedException
	   {
	    	 RanfordHome RHP=new RanfordHome(driver);
	    		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
	    		RHP.Type_Admin_Banker_username("Admin");
	    		RHP.Type_Admin_Banker_password("abc");
	    		Thread.sleep(2000);
	    		RHP.Click_On_Login();
	            Assert.assertTrue(RHP.is_AlertPresent());
	            RHP.close_Alert();
	            Thread.sleep(5000);
	   }
	 @Test(priority=8)
	 public void Tc003_admin_login_valid_password() throws InterruptedException
	 {
		 RanfordHome RHP=new RanfordHome(driver);
			Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
			RHP.Type_Admin_Banker_username("abc");
			RHP.Type_Admin_Banker_password("Mindq");
			Thread.sleep(2000);

			RHP.Click_On_Login();
	        Assert.assertTrue(RHP.is_AlertPresent());
	        RHP.close_Alert();
	        Thread.sleep(5000);
}
    @Test(priority=9)
	 public void Tc003_admin_login() throws InterruptedException

    {
		RanfordHome RHP=new RanfordHome(driver);
		Assert.assertTrue(RHP.Is_Ranford_Homepage_Opened());
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		Thread.sleep(2000);

		RHP.Click_On_Login();
       
        Thread.sleep(5000);

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