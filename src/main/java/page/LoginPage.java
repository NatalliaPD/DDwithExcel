package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Element Library
	
	//This way isn't proper to use here
	WebElement user_name_locator_webelement = driver.findElement(By.xpath("//*[@id='username']"));
	// Another way which also doesn't work here
	By user_name_field_locator = By.xpath("//*[@id='username']");
	
	@FindBy(how = How.XPATH, using ="//*[@id='username']")WebElement user_name_locator; 
	@FindBy (how = How.XPATH, using = "//[*@id=\"password\"]")WebElement password_locator;
	@FindBy (how = How.NAME, using = "login")WebElement signin_button_locator;
	
	//Interactive Methods
	public void EnterUserName(String userName) {
		user_name_locator.sendKeys(userName);
	}
	public void EnterPassword(String password) {
		password_locator.sendKeys(password);
}
	public void ClickSignInButton() {
		signin_button_locator.click();
}
}
