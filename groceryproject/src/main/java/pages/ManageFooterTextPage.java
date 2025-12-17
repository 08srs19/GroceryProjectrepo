package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class ManageFooterTextPage {
	//@FindBy (xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement moreinfo;
	@FindBy (xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement action;
	@FindBy (xpath="//textarea[@placeholder='Enter the Address']")WebElement address;
	@FindBy (xpath="//input[@id='email']")WebElement email;
	@FindBy (xpath="//input[@id='phone']")WebElement phone;
	@FindBy (xpath="//button[@name='Update']")WebElement update;
	@FindBy (xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successalert;
	public WebDriver driver;
	public ManageFooterTextPage(WebDriver driver) {
		//assigning instance to local variable
		this.driver=driver;
		//to initialize web elements
		PageFactory.initElements(driver, this);
	}
	 /*public void clickMoreInfo() {
		 moreinfo.click();
	}*/
	 public ManageFooterTextPage clickAction() {
		 action.click();
		 return this;
	 }
	 public ManageFooterTextPage updateContact(String phonenum, String emailid, String addressdetails) {
	        phone.clear();
	        phone.sendKeys(phonenum);
	        
	        email.clear();
	        email.sendKeys(emailid);
	        
	        address.clear();
	        address.sendKeys(addressdetails);
	        return this;
	 }
	 public ManageFooterTextPage clickUpdate() {
		 PageUtilities change= new PageUtilities();
		 //click update
		 change.click(driver, update);
		 //update.click();
		 return this;
	}
	 public boolean isSuccessAlertDisplayed() {
			return successalert.isDisplayed();
	}

}
