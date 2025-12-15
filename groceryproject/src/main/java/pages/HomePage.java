package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='active nav-link']" ) WebElement ManageNewsMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement AdminUserMoreinfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='small-box-footer']") WebElement ManageCategoryMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class=' nav-link']") WebElement ManageContactMoreIsnfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']") WebElement ManageFooterTextMoreInfo;
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public ManageNewsPage clickOnManageNewsMoreInfo()
	{
		ManageNewsMoreInfo.click();
		return new ManageNewsPage(driver) ;
	}

	public AdminUsersPage clickOnAdminUserMoreinfo()
	{
		AdminUserMoreinfo.click();
		return new AdminUsersPage(driver);
	}
	public ManageCategoryPage clickOnManageCategoryMoreInfo()
	{
		ManageCategoryMoreInfo.click();
		return new ManageCategoryPage(driver);
	}
	public ManageContactPage clickOnManageContactMoreIsnfo()
	{
		ManageContactMoreIsnfo.click();
		return new ManageContactPage(driver);
	}
	public ManageFooterTextPage clickOnManageFooterTextMoreInfo()
	{
		ManageFooterTextMoreInfo.click();
		return new ManageFooterTextPage(driver);
	}

}
