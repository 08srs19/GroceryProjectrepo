package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtilities;
import utilities.PageUtilities;
import utilities.WaitUtilities;

public class ManageCategoryPage {
	@FindBy (xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement moreinfo;
	@FindBy (xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")WebElement newadd;
	@FindBy (xpath="//input[@placeholder='Enter the Category']")WebElement entercategory;
	@FindBy (xpath="//div[@id='ms-grp_id']")WebElement selectgroups;
	@FindBy (xpath="//li[@id='134-selectable']")WebElement discount;
	@FindBy (xpath="//input[@id='main_img']")WebElement image;
	@FindBy(xpath = "//button[text()='Save']")WebElement save;
	@FindBy (xpath="//button[@data-dismiss='alert']")WebElement successalert;
	public WebDriver driver;
	public ManageCategoryPage(WebDriver driver) {
		//assigning instance to local variable
		this.driver=driver;
		//to initialize web elements
		PageFactory.initElements(driver, this);
	}
	 public void clickMoreInfo() {
		 moreinfo.click();
	}
	 public void clickNewAdd() {
		 newadd.click();
	 }
	 public void enterCategory(String name) {
		 entercategory.sendKeys(name);
	 }
	 public void selectDiscount() {
		 selectgroups.click();
		 discount.click();
	 }
	 public void clickChooseFile() {
		FileUploadUtilities choose=new FileUploadUtilities();
		choose.fileUploadUsingSendKeys(image, Constant.IMAGEFILE);
	 }
	 public void clickSave() {
		 PageUtilities change= new PageUtilities();
		 //WaitUtilities waitUtil = new WaitUtilities();
		// ✅ Wait until element is present & clickable
		    //waitUtil.waitForElementToBeClickable(driver, save);
		 //to scroll below for clicking save
		 change.scrollToBottom(driver);
		 //click save
		 change.click(driver, save);
	 }
	 public boolean isSuccessAlertDisplayed() {
			return successalert.isDisplayed();
	}

}
