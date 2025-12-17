package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {
	public void selectByVisibleText(WebElement element,String visibleText) {
		Select select =new Select(element);
		select.selectByVisibleText(visibleText);		
	}
	public void selectByValue(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByValue(value);		
	}
	public void selectByIndex(WebElement element,int index) {
		Select select =new Select(element);
		select.selectByIndex(index);		
	}
	//action class
			public void dragAndDrop(WebDriver driver, WebElement element1, WebElement element2) {
				Actions actions = new Actions(driver);
				actions.dragAndDrop(element1, element2).perform();
			}
			public void mouseHover(WebDriver driver, WebElement element) {
				Actions actions = new Actions(driver);
				actions.moveToElement(element).perform();
			}
			public void rightClick(WebDriver driver, WebElement element) {
				Actions actions = new Actions(driver); 
				actions.contextClick(element).perform();
			}
			public void doubleClick(WebDriver driver, WebElement element) {
				Actions actions = new Actions(driver);
				actions.doubleClick(element).perform();
			}
			public void click(WebDriver driver, WebElement element) {
				Actions actions = new Actions(driver);
				actions.click(element).perform();
			}
			
			//java script executor
			public void scrollToElement(WebDriver driver, WebElement element) {
			    JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
			public void scrollByPixel(WebDriver driver, int x, int y) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(arguments[0],arguments[1]);", x, y);
			}
			public void scrollToBottom(WebDriver driver) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			}
			public void sendMessage(WebDriver driver, WebElement element, String message) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].value = 'value';", element);
			}
}
