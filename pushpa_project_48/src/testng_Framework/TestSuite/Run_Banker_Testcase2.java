package testng_Framework.TestSuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

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
import org.testng.annotations.AfterClass;

public class Run_Banker_Testcase2 {
	
	
	String Driver_Path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\browser_drivers\\chromedriver.exe\\";
	  String screen_path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\screens\\";
	  String property_file_path="C:\\Users\\my-pc\\git\\pushpa_ganji\\pushpa_project_48\\src\\bankers_testcases\\input_properties\\";
	  FileInputStream fi;
	  Properties properties;
	  WebDriver driver;
	  Banket_Testcase2 banker;
	  
	  @Test(priority=0)
	  public void banker_login()
	  {
	  	String BranchName=properties.getProperty("BranchName");
	  	String username=properties.getProperty("username");
	  	String password=properties.getProperty("password");
	  	  banker=new Banket_Testcase2(driver);
	  	  banker.banker_login(BranchName, username, password);
	  }
	  @Test(priority=1)
	  public void Receipts_verify_DDDeposit()
	  
		{
		    String AccountNumber=properties.getProperty("AccountNumber");
		    String Transactiontype=properties.getProperty("Transactiontype");
		    String Amount=properties.getProperty("Amount");
		    String Cheque_CCNumber=properties.getProperty("Cheque_CCNumber");
		    banker=new Banket_Testcase2(driver);
		    banker.Receipts_verify_DDDeposit(AccountNumber, Amount, Cheque_CCNumber, Transactiontype);
		    banker.close_Alert();  
		  
		    
		}
	  @Test(priority=2)
	  public void Receipts_verify_CashDeposit()
	  
		{
		    String AccountNumber=properties.getProperty("AccountNumber");
		    String Transaction_Type2=properties.getProperty("Transaction_Type2");
		    String Amount=properties.getProperty("Amount");
		    banker=new Banket_Testcase2(driver);
		    banker.Receipts_verify_CashDeposit(AccountNumber, Amount, Transaction_Type2);
		    banker.close_Alert();  
		}
	  @Test(priority=3)
	  public void Receipts_verify_ChequeDeposit() throws InterruptedException
	  
		{
		  String AccountNumber=properties.getProperty("AccountNumber");
		    String Transaction_Type1=properties.getProperty("Transaction_Type1");
		    String Amount=properties.getProperty("Amount");
		    banker=new Banket_Testcase2(driver);
		    banker.Receipts_verify_ChequeDeposit(AccountNumber, Amount, Transaction_Type1);
		    banker.close_Alert();  
		}
	  @Test(priority=4)
	  public void Payments_DD_Withdraw()
	  
	  {
		  String AccountNumber=properties.getProperty("AccountNumber");
		    String Transaction_Type3=properties.getProperty("Transaction_Type3");
		    String Cheque_CCNumber=properties.getProperty("Cheque_CCNumber");
		    String Amount=properties.getProperty("Amount");
		    banker=new Banket_Testcase2(driver);
		    banker.Payments_DD_Withdraw(AccountNumber, Transaction_Type3, Cheque_CCNumber, Amount);
	  }
	  @Test(priority=5)
	  public void Payments_Cash_Withdraw()
	  
	  {
		  String AccountNumber=properties.getProperty("AccountNumber");
		    String Transaction_Type4=properties.getProperty("Transaction_Type4");
		    String Amount=properties.getProperty("Amount");
		    banker=new Banket_Testcase2(driver);
		    banker.Payments_Cash_Withdraw(AccountNumber, Transaction_Type4, Amount);
	  }
	  @Test(priority=6)
	  public void Payments_Cheque_Withdraw()
	  
	  {
		  String AccountNumber=properties.getProperty("AccountNumber");
		    String Transaction_Type5=properties.getProperty("Transaction_Type5");
		    String Cheque_CCNumber=properties.getProperty("Cheque_CCNumber");
		    String Amount=properties.getProperty("Amount");
		    banker=new Banket_Testcase2(driver);
		    banker.Payments_Cheque_Withdraw(AccountNumber, Transaction_Type5, Cheque_CCNumber, Amount);
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
		