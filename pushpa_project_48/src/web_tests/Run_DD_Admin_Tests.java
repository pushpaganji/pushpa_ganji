package web_tests;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import keywords.Excel_Keywords;

public class Run_DD_Admin_Tests 
{
	 String Driver_Path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\browser_drivers\\chromedriver.exe";
	  String screen_path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\screens\\";
	  String property_file_path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\src\\Resources\\InputData.xls";
	  FileInputStream fi;
	  Properties properties;
	  WebDriver driver;
	  
	  DD_Admin_Tests AdminTest;
	  
	  @Test(priority=0)
	  public void Create_A_Branch() throws InterruptedException
	  {
		  AdminTest=new DD_Admin_Tests(driver);        
		  AdminTest.Create_A_Branch();
		  

		  
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
