package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
public void selectdropDown(WebElement element, String visibleString ) {
		
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleString);
	}

//Generating Random Method

public int randomGenerator() {
	Random rnd = new Random();
	int rndNum = rnd.nextInt(999);
	return rndNum;
}
}
