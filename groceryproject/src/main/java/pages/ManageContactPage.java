package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;


public class ManageContactPage {
	//@FindBy (xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']")WebElement moreinfo;
	@FindBy (xpath="//i[@class='fas fa-edit']")WebElement action;
	@FindBy (xpath="//input[@id='phone']")WebElement phone;
	@FindBy (xpath="//input[@id='email']")WebElement email;
	@FindBy (xpath="//textarea[@placeholder='Enter the Address']")WebElement address;
	@FindBy (xpath="//textarea[@placeholder='Enter Delivery Time']")WebElement deliverytime;
	@FindBy (xpath="//input[@id='del_limit']")WebElement deliverylimit;
	@FindBy(xpath = "//button[@type='submit']")WebElement update;
	@FindBy (xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successalert;
	public WebDriver driver;
	public ManageContactPage(WebDriver driver) {
		//assigning instance to local variable
		this.driver=driver;
		//to initialize web elements
		PageFactory.initElements(driver, this);
	}
	 /*public void clickMoreInfo() {
		 moreinfo.click();
		 
	}*/
	 public ManageContactPage clickAction() {
		 action.click();
		 return this;
	 }
	 public ManageContactPage updateContact(String phonenum, String emailid, String addressdetails, String time, String charge) {
	        phone.clear();
	        phone.sendKeys(phonenum);
	        
	        email.clear();
	        email.sendKeys(emailid);
	        
	        address.clear();
	        address.sendKeys(addressdetails);

	        deliverytime.clear();
	        deliverytime.sendKeys(time);

	        deliverylimit.clear();
	        deliverylimit.sendKeys(charge);
	        return this;
	    }
	 public ManageContactPage clickUpdate() {
		 PageUtilities change= new PageUtilities();
		 //WaitUtilities waitUtil = new WaitUtilities();
		// ✅ Wait until element is present & clickable
		   //waitUtil.waitForElementToBeClickable(driver, update);
		 //to scroll below for clicking update
		 change.scrollToBottom(driver);
		 //click update
		 change.click(driver, update);
		 //update.click();
		 return this;
	}
	 public boolean isSuccessAlertDisplayed() {
			return successalert.isDisplayed();
	}
}
