package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtilities {
	public static final int IMPLICITWAIT=5;
	public static final int EXPLICITWAIT=10;
	public void waitForElement(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITWAIT));
		wait.until(ExpectedConditions.visibilityOf(target));
	}
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(IMPLICITWAIT));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
