package testng_Framework.TestSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

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

import keywords.Repository;
import web_pages.RanfordHome;
import web_pages.Banker.Receipts_and_Payments;

public class Run_Banker_Testcase
{
	
	  String Driver_Path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\browser_drivers\\chromedriver.exe\\";
	  String screen_path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\screens\\";
	  String property_file_path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\src\\bankers_testcases\\input_properties\\";
	  FileInputStream fi;
	  Properties properties;
	  WebDriver driver;
	  Banker_Testcase banker;
	  
  
@Test(priority=0)
public void banker_login()
{
	String BranchName=properties.getProperty("BranchName");
	String username=properties.getProperty("username");
	String password=properties.getProperty("password");
     driver.get(properties.getProperty("banker_url"));
	  banker=new Banker_Testcase(driver);
	  banker.banker_login(BranchName, username, password);
}
@Test(priority=1)

public void Receipts_DD_Deposit_using_Valid_AccoutNumber()
{
	String AccountNumber= properties.getProperty("AccountNumber");
	String Transactiontype= properties.getProperty("Transactiontype");
	String Customer_Name=properties.getProperty("Customer_Name");
	String City= properties.getProperty("City");
	String Phone_Number=properties.getProperty("Phone_Number");
	driver.get(properties.getProperty("Receipts_url"));
    banker=new Banker_Testcase(driver);
    banker.Receipts_DD_Deposit_using_Valid_AccoutNumber(AccountNumber, City, Phone_Number, Customer_Name, Transactiontype);
    }
@Test(priority=2)

public void Receipts_DD_Deposit_using_InValid_AccoutNumber()
{
	String AccountNumber1=properties.getProperty("AccountNumber1");
	String Transactiontype=properties.getProperty("Transactiontype");
	driver.get(properties.getProperty("Receipts_url"));
	banker=new Banker_Testcase(driver);
	banker.Receipts_DD_Deposit_using_InValid_AccoutNumber(AccountNumber1, Transactiontype);
	}


@Test(priority=3)

public void Receipts_DD_Deposit_verify_creditcard_info_is_present()
{
	String AccountNumber=properties.getProperty("AccountNumber");
    String Transactiontype=properties.getProperty("Transactiontype");    
    driver.get(properties.getProperty("Receipts_url"));
    banker=new Banker_Testcase(driver);
    banker.Receipts_DD_Deposit_verify_creditcard_info_is_present(AccountNumber,Transactiontype);
}
@Test(priority=4)

public void Receipts_Cheque_Deposit_verify_creditcard_info_is_present()
{
	String AccountNumber=properties.getProperty("AccountNumber");
    String Transaction_Type1=properties.getProperty("Transaction_Type1");
    
    driver.get(properties.getProperty("Receipts_url"));
    banker=new Banker_Testcase(driver);
    banker.Receipts_Cheque_Deposit_verify_creditcard_info_is_present(AccountNumber,Transaction_Type1);
}
@Test(priority=5)

public void Receipts_Cash_Deposite_verify_creditcard_info_is_present()
{
	String AccountNumber=properties.getProperty("AccountNumber");
    String Transaction_Type2=properties.getProperty("Transaction_Type2");
    
    driver.get(properties.getProperty("Receipts_url"));
    banker=new Banker_Testcase(driver);
    banker.Receipts_Cash_Deposite_verify_creditcard_info_is_present(AccountNumber,Transaction_Type2);
        
}

@AfterMethod//Invoke every @Test annotation after.
public void afterMethod(Method method) throws Exception 
{
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(src, new File(screen_path+method.getName()+".png"));
}

@BeforeClass//Invoke once before execution of all @Test annotations
public void beforeClass() throws IOException 
{
	  System.setProperty("webdriver.chrome.driver", Driver_Path);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();  
	  
	  fi=new FileInputStream(property_file_path);
	  properties=new Properties();
	  properties.load(fi);
	 	 
}

@AfterClass //Invoke once after execution of all @Test annotations
public void afterClass() throws Exception 
{
	  Thread.sleep(5000);
	  driver.close();
}

}