package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

	
	WebDriver driver;
	

	ExcelReader exlread = new ExcelReader("\\Data\\Data.xlsx");
	String userName = exlread.getCellData("LoginInfo", "UserName", 2);
	String password = exlread.getCellData("LoginInfo", "Password", 2);
	String fullName = exlread.getCellData("AddContactInfo", "FullName",2);
	String companyName = exlread.getCellData("AddContactInfo", "CompanyName", 2);
	String email = exlread.getCellData("AddContactInfo", "Email", 2);
	String phone = exlread.getCellData("AddContactInfo", "Phone",2);
	String address = exlread.getCellData("AddContactInfo", "Address", 2);
	String city = exlread.getCellData("AddContactInfo", "City", 2);
	String state = exlread.getCellData("AddContactInfo", "State", 2);
	String zip = exlread.getCellData("AddContactInfo", "Zip", 2);
	String country = exlread.getCellData("AddContactInfo", "Country", 2);
	

	@Test
	public void validUsershouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.EnterUserName("userName");
		loginpage.EnterPassword("password");
		loginpage.ClickSignInButton();
		
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.validateDashBoardPage();
		
		AddCustomerPage addcustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addcustomer.clickOnCustomerButton();
		addcustomer.clickOnAddCustomerButton();
		addcustomer.enterFullName("FullName");
		addcustomer.enterCompanyName("CompanyName");
		addcustomer.enterEmailAddress("Email");
		addcustomer.enterPhoneNumber("Phone");
		addcustomer.enterAddress("Address");
		addcustomer.enterCity("City");
		addcustomer.enterState("State");
		addcustomer.enterZipCode("76244");
		
		addcustomer.enterCountryName("United States");
		addcustomer.ClickSaveButton();
		
		
		//BrowserFactory.tearDown();
	}
}
