package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;


public class HomeTest extends Base{
	LoginPage loginpage;
	HomePage homepage;
	
	@Test(description = "To verify user is able to logout")
	public void verifyUserIsInHomePage() throws IOException
	{
		String username = ExcelUtilities.getStringData(1, 0, "loginpage");
		String password = ExcelUtilities.getStringData(1, 1, "loginpage");
		homepage = loginpage.enterTheUserName(username).enterThePassword(password).clickTheSignIn();
        boolean alert=homepage.isHomePageDisplayed();        
		Assert.assertTrue(alert,Constant.ALERTDISPLAYEDFORHOMEPAGE);
	}

}
