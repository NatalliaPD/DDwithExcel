package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	WebDriver driver;
	
	ExcelReader exlread = new ExcelReader("Data\\Data.xlsx");
	String userName = exlread.getCellData("LoginInfo", "UserName", 2);
	String password = exlread.getCellData("LoginInfo", "Password", 2);
	
		
	@Test	
	
	public void validUserAbleToLogin()	{
	  driver =	BrowserFactory.init();
	  
	  LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	  loginpage.EnterUserName(userName);
	  loginpage.EnterPassword(password);
	  loginpage.ClickSignInButton();
	  
	  DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
	  dashboard.validateDashBoardPage();
	  
	  
	  
	  BrowserFactory.tearDown();
	}
	}

