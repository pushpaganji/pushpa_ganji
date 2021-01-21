package testng_Framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import keywords.Repository;
import web_pages.RanfordHome;
import web_pages.Banker.Banker_Homepage;
import web_pages.Banker.Receipts_and_Payments;


public class Banker_Testcase extends Repository
{	
	public Banker_Testcase(WebDriver driver) {
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
	@Test(priority=1)
	public void Receipts_DD_Deposit_using_Valid_AccoutNumber(String AccountNumber, String City, String Phone_Number, String Customer_Name,  String Transactiontype)
	{
		Banker_Homepage BH=new Banker_Homepage(driver);
		click_element(BH.Receipts);
		Receipts_and_Payments RandP=new Receipts_and_Payments(driver);
		Type_text(RandP.Account_Number, AccountNumber);
		Select_Dropdown(RandP.Transaction_Type,  Transactiontype);
		Assert.assertTrue(wait_and_verify_element_visible(RandP.Customer_Name));
		Assert.assertTrue(Verify_input_Value(RandP.Customer_Name, Customer_Name));
		Verify_input_Value(RandP.City, City);
		Verify_input_Value(RandP.Phone_num, Phone_Number);
	
	}
	@Test(priority=2)
	public void Receipts_DD_Deposit_using_InValid_AccoutNumber(String AccountNumber1, String Transactiontype)
	{
		Banker_Homepage BH=new Banker_Homepage(driver);
		click_element(BH.Receipts);
		Receipts_and_Payments RandP=new Receipts_and_Payments(driver);
		Type_text(RandP.Account_Number, AccountNumber1);
		Select_Dropdown(RandP.Transaction_Type, Transactiontype);
		Verify_Alert_message("Give correct Account number");
		is_AlertPresent();
		close_Alert();
	}
@Test(priority=3)
	
	public void Receipts_DD_Deposit_verify_creditcard_info_is_present(String AccountNumber,String Transactiontype)
	{
	 Banker_Homepage BH=new Banker_Homepage(driver);
	click_element(BH.Receipts);
	Receipts_and_Payments RandP=new Receipts_and_Payments(driver);
	Type_text(RandP.Account_Number, AccountNumber);
	Select_Dropdown(RandP.Transaction_Type, Transactiontype);
	Assert.assertTrue(wait_and_verify_element_visible(RandP.Cheque_DD_CreditCardNumber));

	}


	@Test(priority=4)
	
public void Receipts_Cheque_Deposit_verify_creditcard_info_is_present(String AccountNumber,String Transaction_Type1)
	{
	 Banker_Homepage BH=new Banker_Homepage(driver);
	click_element(BH.Receipts);
	Receipts_and_Payments RandP=new Receipts_and_Payments(driver);
	Type_text(RandP.Account_Number, AccountNumber);
	Select_Dropdown(RandP.Transaction_Type, Transaction_Type1);
	Assert.assertTrue(wait_and_verify_element_visible(RandP.Cheque_DD_CreditCardNumber));

	}
	@Test(priority=5)
	public void Receipts_Cash_Deposite_verify_creditcard_info_is_present(String AccountNumber, String Transaction_Type2)
	{
	 Banker_Homepage BH=new Banker_Homepage(driver);
	click_element(BH.Receipts);
	Receipts_and_Payments RandP=new Receipts_and_Payments(driver);
	Type_text(RandP.Account_Number, AccountNumber);
	Select_Dropdown(RandP.Transaction_Type, Transaction_Type2);
	Assert.assertFalse(wait_and_verify_element_visible(RandP.Cheque_DD_CreditCardNumber));
    
	}
	
	
	
}
