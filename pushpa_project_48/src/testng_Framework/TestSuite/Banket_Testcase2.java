package testng_Framework.TestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import keywords.Repository;
import web_pages.RanfordHome;
import web_pages.Banker.Banker_Homepage;
import web_pages.Banker.Payments;
import web_pages.Banker.Receipts_and_Payments;


public class Banket_Testcase2 extends Repository
{	
	public Banket_Testcase2(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@Test(priority=0)
	public void banker_login(String BranchName,String username,String password)
	{
		
		RanfordHome RHP=new RanfordHome(driver);
		Select_Dropdown(RHP.Branch_Name, BranchName);
		Type_text(RHP.Admin_Banker_username, username);
		Type_text(RHP.Admin_Banker_password, password);
		click_element(RHP.Login);
		
	}
	 @Test
	  
		public void Receipts_verify_DDDeposit(String AccountNumber, String Amount, String Cheque_CCNumber, String Transactiontype)
		{
			
			Banker_Homepage BH=new Banker_Homepage(driver);
			click_element(BH.Receipts);
			Receipts_and_Payments RandP=new Receipts_and_Payments(driver);
			Type_text(RandP.Account_Number, AccountNumber);
			Select_Dropdown(RandP.Transaction_Type, Transactiontype);
			Type_text(RandP.Cheque_DD_CreditCardNumber, Cheque_CCNumber);
			 Type_text(RandP.Amount, Amount);
			click_element(RandP.Submit_btn);
			is_AlertPresent();
			close_Alert();
			Type_text(RandP.Account_Number, AccountNumber);
			Select_Dropdown(RandP.Transaction_Type, Transactiontype);
		   
		}
	  public void Receipts_verify_CashDeposit(String AccountNumber, String Amount, String Transaction_Type2)
	  
		{
		  
		  Banker_Homepage BH=new Banker_Homepage(driver);
			click_element(BH.Receipts);
			Receipts_and_Payments RandP=new Receipts_and_Payments(driver);
			Type_text(RandP.Account_Number, AccountNumber);
			Select_Dropdown(RandP.Transaction_Type, Transaction_Type2);
			 Type_text(RandP.Amount, Amount);
			click_element(RandP.Submit_btn);
			is_AlertPresent();
			close_Alert();
			Type_text(RandP.Account_Number, AccountNumber);
			Select_Dropdown(RandP.Transaction_Type, Transaction_Type2);
		}
	  public void Receipts_verify_ChequeDeposit(String AccountNumber, String Amount, String Transaction_Type1)
		{
			
			Banker_Homepage BH=new Banker_Homepage(driver);
			click_element(BH.Receipts);
			Receipts_and_Payments RandP=new Receipts_and_Payments(driver);
			Type_text(RandP.Account_Number, AccountNumber);
			Select_Dropdown(RandP.Transaction_Type, Transaction_Type1);
			 Type_text(RandP.Amount, Amount);
			click_element(RandP.Submit_btn);
			is_AlertPresent();
			close_Alert();
			Type_text(RandP.Account_Number, AccountNumber);
			Select_Dropdown(RandP.Transaction_Type, Transaction_Type1);
	 	}


 @Test(priority=1)
  public void Payments_DD_Withdraw(String AccountNumber, String Transaction_Type3, String Cheque_CCNumber, String Amount)
  
  {
  
	  Banker_Homepage BH=new Banker_Homepage(driver);
		click_element(BH.Payments);
		Payments payments= new Payments(driver);
		Type_text(payments.Account_Number, AccountNumber);
		Select_Dropdown(payments.Transaction_Type, Transaction_Type3);
		Type_text(payments.Cheque_DD_CreditCardNumber, Cheque_CCNumber);
		 Type_text(payments.Amount, Amount);
		click_element(payments.Submit_btn);
		is_AlertPresent();
		close_Alert();
		Type_text(payments.Account_Number, AccountNumber);
		Select_Dropdown(payments.Transaction_Type, Transaction_Type3);
			
		
}
 @Test(priority=2)
 public void Payments_Cash_Withdraw(String AccountNumber, String Transaction_Type4, String Amount)
 {
	  Banker_Homepage BH=new Banker_Homepage(driver);
			click_element(BH.Payments);
			Payments payments= new Payments(driver);
			Type_text(payments.Account_Number, AccountNumber);
			Select_Dropdown(payments.Transaction_Type, Transaction_Type4);
			 Type_text(payments.Amount, Amount);
			click_element(payments.Submit_btn);
			is_AlertPresent();
			close_Alert();
			Type_text(payments.Account_Number, AccountNumber);
			Select_Dropdown(payments.Transaction_Type, Transaction_Type4);
				
 }
 @Test(priority=3)
 public void Payments_Cheque_Withdraw(String AccountNumber, String Transaction_Type5, String Cheque_CCNumber, String Amount)
 
 {
 
	  Banker_Homepage BH=new Banker_Homepage(driver);
		click_element(BH.Payments);
		Payments payments= new Payments(driver);
		Type_text(payments.Account_Number, AccountNumber);
		Select_Dropdown(payments.Transaction_Type, Transaction_Type5);
		Type_text(payments.Cheque_DD_CreditCardNumber, Cheque_CCNumber);
		 Type_text(payments.Amount, Amount);
		click_element(payments.Submit_btn);
		is_AlertPresent();
		close_Alert();
		Type_text(payments.Account_Number, AccountNumber);
		Select_Dropdown(payments.Transaction_Type, Transaction_Type5);
			
		
}
}