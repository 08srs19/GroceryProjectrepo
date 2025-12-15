package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtilities;

public class ManageCategoryTest extends Base{
	@Test(description ="To verify user is able to enter category informations")
	public void verifyUserCanAddNewCategory() throws IOException {

        //LOGIN
        LoginPage login = new LoginPage(driver);
        //login.enterTheUserName("admin");
        //login.enterThePassword("admin");
        String username=ExcelUtilities.getStringData(1, 0, "loginpage");
		String password=ExcelUtilities.getStringData(1, 1, "loginpage");
		login.enterTheUserName(username);
		login.enterThePassword(password);
        login.clickTheSignIn();
        
        //ADDNEWCATEGORY
        ManageCategoryPage category = new ManageCategoryPage(driver);
        category.clickMoreInfo();
        category.clickNewAdd();
        category.selectDiscount();
        String name = ExcelUtilities.getStringData(2, 0, "category");
        category.enterCategory(name);
        category.clickChooseFile();
        category.clickSave();
        boolean alert=category.isSuccessAlertDisplayed();
		Assert.assertTrue(alert,Constant.ALERTDISPLAYEDFORMANAGECATEGORY);
	}

}
