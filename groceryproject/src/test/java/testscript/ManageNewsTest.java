package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base{
	@Test(groups = {"Regression"},description = "To Verify User is able to enter the ManageNews")
	public void verifyUserCanAddNews() throws IOException {

        //LOGIN
        LoginPage login = new LoginPage(driver);
        //login.enterTheUserName("admin");
        //login.enterThePassword("admin");
        String username=ExcelUtilities.getStringData(1, 0, "loginpage");
		String password=ExcelUtilities.getStringData(1, 1, "loginpage");
		login.enterTheUserName(username);
		login.enterThePassword(password);
        login.clickTheSignIn();

        //MANAGE NEWS
        ManageNewsPage news = new ManageNewsPage(driver);
        news.clickTheMoreInfo();
        news.clickTheNew();
        //String newsmatter=ExcelUtilities.getStringData(0, 0, "addnews");
        //String newsmatter=ExcelUtilities.getStringData(1, 0, "addnews");
        String newsmatter=ExcelUtilities.getStringData(2, 0, "addnews");
        news.enterTheNews(newsmatter);
        news.clickTheSave();
        boolean alert=news.isSuccessAlertDisplayed();
		Assert.assertTrue(alert,Constant.ALERTDISPLAYEDFORMANAGENEWS);
	}
}
