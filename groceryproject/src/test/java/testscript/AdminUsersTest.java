package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class AdminUsersTest extends Base {
	@Test(description = "Used to verify whether the user is able to enter admin user informations")
	public void verifyUserCanAddNewUsers() throws IOException {

        //LOGIN
        LoginPage login = new LoginPage(driver);
        //login.enterTheUserName("admin");
        //login.enterThePassword("admin");
        String username=ExcelUtilities.getStringData(1, 0, "loginpage");
		String password=ExcelUtilities.getStringData(1, 1, "loginpage");
		login.enterTheUserName(username);
		login.enterThePassword(password);
        login.clickTheSignIn();

		//ADMIN USERS
		AdminUsersPage users = new AdminUsersPage(driver);
        users.clickTheMoreInfo();
        users.clickTheNew();
        //String newsmatter=ExcelUtilities.getStringData(0, 0, "addnews");
        //String newsmatter=ExcelUtilities.getStringData(1, 0, "addnews");
        String newusername=ExcelUtilities.getStringData(3, 0, "adminusers");
        users.enterUsername(newusername);
        String newpassword=ExcelUtilities.getStringData(3, 1, "adminusers");
        users.enterPassword(newpassword);
        String userType=ExcelUtilities.getStringData(3, 2, "adminusers");
        users.selectUserType(userType);
        users.clickTheSave();
        boolean alert=users.isSuccessAlertDisplayed();
		Assert.assertTrue(alert,Constant.ALERTDISPLAYFORADMINUSER);
	}

}
