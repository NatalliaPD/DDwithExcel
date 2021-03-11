package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{

WebDriver driver;
	
	public void AddCustomer(WebDriver driver) {
    this.driver = driver;
	}
	//Element Library
	
	@FindBy(how = How.XPATH, using ="//*[@id =\"side-menu\"]/li[3]/a")
	WebElement customer_field_locator; 
	@FindBy(how = How.XPATH, using ="//*[@id = \"side=menu\"]/li[3]/ul/li[1]/a")
	WebElement add_customer_field_locator;
	@FindBy(how = How.XPATH, using ="//*[@id = \"account\"]")
	WebElement fullname_field_locator; 
	@FindBy(how = How.XPATH, using ="//*[@id = \"cid\"]")
	WebElement company_field_locator; 
	@FindBy(how = How.XPATH, using ="//*[@id = \"email\"]")
	WebElement email_field_locator; 
	@FindBy(how = How.XPATH, using ="//*[@id = \"phone\"]")
	WebElement phone_field_locator; 
	@FindBy(how = How.XPATH, using ="//*[@id = \"address\"]")
	WebElement address_field_locator; 
	@FindBy(how = How.XPATH, using ="//*[@id = \"city\"]")
	WebElement city_field_locator;
	@FindBy(how = How.XPATH, using ="//*[@id = \"state\"]")
	WebElement state_field_locator; 
	@FindBy(how = How.XPATH, using ="//*[@id = \"zip\"]")
	WebElement zipcode_field_locator; 
	@FindBy(how = How.XPATH, using ="//*[@id = \"country\"]")
	WebElement country_field_locator;
	@FindBy (how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement save_button_locator;
	
	//Interactive Methods
	
	public void clickOnCustomerButton() {
	customer_field_locator.click();
	}

	public void clickOnAddCustomerButton () {
		waitForElement(driver,3, add_customer_field_locator);
		add_customer_field_locator.click();
	}
	
	public void enterFullName(String fullName) {
		String typedName = fullName + randomGenerator ();
		fullname_field_locator.sendKeys(typedName);
		
	}


	public void enterCompanyName(String company) {
		selectdropDown(company_field_locator, company);
	}
	
		public void selectdropDown(WebElement element, String visibleString ) {
		
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleString);
	}
	
		//Random Generator
	public void enterEmailAddress(String email) {
		String emailAddress = randomGenerator() + email;
		email_field_locator.sendKeys(emailAddress);
	}
	
	//Random Generator
	public void enterPhoneNumber(String phone) {
		String typedPhoneNum = randomGenerator() + phone;
		email_field_locator.sendKeys(typedPhoneNum);
		
	}
	public void enterAddress(String address) {
		address_field_locator.sendKeys(address);
	}

		public void enterCity(String city) {
			city_field_locator.sendKeys(city);
		}

		public void enterZipCode(String zipcode) {
			zipcode_field_locator.sendKeys(zipcode);
		}
		

		public void enterState(String state) {
			state_field_locator.sendKeys(state);
		}
		
	public void enterCountryName(String country) {
		selectdropDown(country_field_locator, country);
	}
	
	public void ClickSaveButton() {
		save_button_locator.click();
	}
    
}


