package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	@FindBy (xpath="//a[@class='nav-link' and @data-toggle='dropdown']")WebElement profile;
	@FindBy (xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']")WebElement logout;
	@FindBy (xpath="//div[contains(@class,'login-box')]")WebElement login;
	public WebDriver driver;
	public LogoutPage(WebDriver driver) {
		//assigning instance to local variable
		this.driver=driver;
		//to initialize web elements
		PageFactory.initElements(driver, this);
	}
	public void clickTheProfile() {
		profile.click();
	}
	public void clickTheLogout() {
		logout.click();
	}
	public boolean isLoginPageDisplayed() {
	    return login.isDisplayed();
	}
}
