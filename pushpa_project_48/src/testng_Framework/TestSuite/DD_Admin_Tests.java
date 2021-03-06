package testng_Framework.TestSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import keywords.Excel_Keywords;
import keywords.Repository;
import web_pages.AdminHome;
import web_pages.Branches;
import web_pages.New_Branch_Creation;
import web_pages.RanfordHome;

public class DD_Admin_Tests extends Repository
{
	WebDriver driver;
	
	public DD_Admin_Tests(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
   @Test(priority=0)
	public void Create_A_Branch() throws InterruptedException
	{
		
		Excel_Keywords.get_workbook("InputData", "Sheet3");
		RanfordHome RHP=new RanfordHome(driver);
		RHP.Type_Admin_Banker_username("Admin");
		RHP.Type_Admin_Banker_password("M1ndq");
		RHP.Click_On_Login();
		AdminHome AH= new AdminHome(driver);
		AH.Click_On_Branches_info();
		Branches branches= new Branches(driver);
		branches.Click_On_New_Branch();
				New_Branch_Creation NB=new New_Branch_Creation(driver);
		Type_text(NB.Branch_Name, Excel_Keywords.get_cell_Data(1, 0));
		Type_text(NB.Address1, Excel_Keywords.get_cell_Data(1,1));
		Thread.sleep(4000);
		Type_text(NB.Zipcode, Excel_Keywords.get_cell_Data(1, 2));
		Select_Dropdown(NB.Select_Country_Name, Excel_Keywords.get_cell_Data(1,3));
		Select_Dropdown(NB.Select_State_Name, Excel_Keywords.get_cell_Data(1,4));
		Select_Dropdown(NB.Select_City, Excel_Keywords.get_cell_Data(1,5));
	}

}

