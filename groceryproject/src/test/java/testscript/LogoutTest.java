package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtilities;

public class LogoutTest extends Base{
	LogoutPage logout;
	HomePage homepage;
	@Test(description = "Used to verify user is able to logout")
	 public void verifyLogout() throws IOException {
		//LOGIN
	        LoginPage login = new LoginPage(driver);
	        //login.enterTheUserName("admin");
	        //login.enterThePassword("admin");
	        String username=ExcelUtilities.getStringData(1, 0, "loginpage");
			String password=ExcelUtilities.getStringData(1, 1, "loginpage");
			login.enterTheUserName(username).enterThePassword(password);
	        homepage=login.clickTheSignIn();
	        
	    //LOGOUT
	        LogoutPage logout = new LogoutPage(driver);
	        logout.clickTheProfile();
	        logout.clickTheLogout();
	        boolean page=logout.isLoginPageDisplayed();
			Assert.assertTrue(page,Constant.LOGOUTFROMTHEAPPLICATION);      
	 }

}
