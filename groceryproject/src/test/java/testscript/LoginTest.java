package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {
		//String username="admin";
		//String password="admin";
		String username=ExcelUtilities.getStringData(1, 0, "loginpage");
		String password=ExcelUtilities.getStringData(1, 1, "loginpage");		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignIn();
		boolean homepage=loginpage.isHomePageDisplayed();
		Assert.assertTrue(homepage);
	}
	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class)
	public void verifyBothWrongCredentials() throws IOException {
		String username=ExcelUtilities.getStringData(2, 0, "loginpage");
		String password=ExcelUtilities.getStringData(2, 1, "loginpage");		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignIn();
		boolean loginwrong=loginpage.isBothWrongAlertDisplayed();
		Assert.assertTrue(loginwrong);
	}
	@Test
	public void verifyUsernameWrong() throws IOException {
		String username=ExcelUtilities.getStringData(3, 0, "loginpage");
		String password=ExcelUtilities.getStringData(3, 1, "loginpage");		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignIn();
		boolean usernamewrong=loginpage.isUsernameWrongAlertDisplayed();
		Assert.assertTrue(usernamewrong);
	}
	@Test
	public void verifyPasswordWrong() throws IOException {
		String username=ExcelUtilities.getStringData(4, 0, "loginpage");
		String password=ExcelUtilities.getStringData(4, 1, "loginpage");		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignIn();
		boolean passwordwrong=loginpage.isPasswordWrongAlertDisplayed();
		Assert.assertTrue(passwordwrong);
	}
	
}
