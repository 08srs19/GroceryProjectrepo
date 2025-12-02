package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.PageUtilities;

public class AdminUsersPage {
	@FindBy (xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement moreinfo;
	@FindBy (xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy (xpath="//input[@id='username']")WebElement enterusername;
	@FindBy (xpath="//input[@id='password']")WebElement enterpassword;
	@FindBy (xpath="//select[@id='user_type']")WebElement selectusertype;
	@FindBy (xpath="//button[@name='Create']")WebElement savebutton;
	@FindBy (xpath="//button[@data-dismiss='alert']")WebElement successalert;
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
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
	public void enterUsername(String newusername) {
		enterusername.sendKeys(newusername);
	}
	public void enterPassword(String newpassword) {
		enterpassword.sendKeys(newpassword);
	}
	public void selectUserType(String userType) {
        //Select select = new Select(selectusertype);
        //select.selectByVisibleText(userType);
		PageUtilities pageUtils = new PageUtilities();
		pageUtils.selectByVisibleText(selectusertype, userType);
    }
	public void clickTheSave() {
		savebutton.click();
	}
	public boolean isSuccessAlertDisplayed() {
		return successalert.isDisplayed();
	}

}
