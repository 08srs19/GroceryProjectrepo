package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	//@FindBy (xpath="//p[text()='Manage News']")WebElement managenews;
		@FindBy (xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement moreinfo;
		@FindBy (xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
		@FindBy (xpath="//textarea[@id='news']")WebElement enternews;
		@FindBy (xpath="//button[text()='Save']")WebElement savebutton;
		@FindBy (xpath="//button[@data-dismiss='alert']")WebElement successalert;
		public WebDriver driver;
		public ManageNewsPage(WebDriver driver) {
			//assigning instance to local variable
			this.driver=driver;
			//to initialize web elements
			PageFactory.initElements(driver, this);
		}
		public void clickTheMoreInfo() {
			moreinfo.click();
		}
		public void clickTheNew() {
			newbutton.click();
		}
		public void enterTheNews(String newsmatter) {
			enternews.sendKeys(newsmatter);
		}
		public void clickTheSave() {
			savebutton.click();
		}
		public boolean isSuccessAlertDisplayed() {
			return successalert.isDisplayed();
		}

}
