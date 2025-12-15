package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Page Factory 
		@FindBy(name="username")WebElement firstname;
		@FindBy(name="password")WebElement firstpassword;
		@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
		@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
		@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
		//global variable declaration
		public WebDriver driver;
		public LoginPage(WebDriver driver) {
			//assigning instance to local variable
			this.driver=driver;
			//to initialize web elements
			PageFactory.initElements(driver, this);
		}
		public LoginPage enterTheUserName(String username) {
			firstname.sendKeys(username);
			return this;
		}
		public LoginPage enterThePassword(String password) {
			firstpassword.sendKeys(password);
			return this;
		}
		public HomePage clickTheSignIn() {
			signin.click();
			return new HomePage(driver);
		}
		public boolean isHomePageDisplayed() {
			return dashboard.isDisplayed();
		}
		public boolean isBothWrongAlertDisplayed() {
			return alert.isDisplayed();
		}
		public boolean isUsernameWrongAlertDisplayed() {
			return alert.isDisplayed();
		}
		public boolean isPasswordWrongAlertDisplayed() {
			return alert.isDisplayed();
		}

}
