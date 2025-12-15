package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	@Test(description="To verify whether user is able to login using valid credentials")
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
		Assert.assertTrue(homepage,Constant.LOGINUSINGCORRECTUSERNAMEANDCORRECTPASSWORD);
	}
	@Test(groups= {"regression"},retryAnalyzer=retry.Retry.class,description = "Used to verify the user with invalid credentials")
	public void verifyBothWrongCredentials() throws IOException {
		String username=ExcelUtilities.getStringData(2, 0, "loginpage");
		String password=ExcelUtilities.getStringData(2, 1, "loginpage");		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignIn();
		boolean loginwrong=loginpage.isBothWrongAlertDisplayed();
		Assert.assertTrue(loginwrong,Constant.LOGINUSINGINCORRECTUSERNAMEANDPASSWORD);
	}
	@Test(description = "Used to verify the user with incorrect username and correct password")
	public void verifyUsernameWrong() throws IOException {
		String username=ExcelUtilities.getStringData(3, 0, "loginpage");
		String password=ExcelUtilities.getStringData(3, 1, "loginpage");		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignIn();
		boolean usernamewrong=loginpage.isUsernameWrongAlertDisplayed();
		Assert.assertTrue(usernamewrong,Constant.LOGINUSINGCORRECTUSERNAMEANDCORRECTPASSWORD);
	}
	@Test(description = "Used to verify the user with correct username and incorrect password", dataProvider = "LoginProvider")
	public void verifyPasswordWrong(String username,String password) throws IOException {
		//String username=ExcelUtilities.getStringData(4, 0, "loginpage");
		//String password=ExcelUtilities.getStringData(4, 1, "loginpage");		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username).enterThePassword(password);
		loginpage.clickTheSignIn();
		boolean passwordwrong=loginpage.isPasswordWrongAlertDisplayed();
		Assert.assertTrue(passwordwrong,Constant.LOGINUSINGCORRECTUSERNAMEANDINCORRECTPASSWORD);
	}
	@DataProvider(name="LoginProvider")
	public Object[][] getDataFromTestData() throws IOException{
		return new Object[][] {{ExcelUtilities.getStringData(4, 0,"loginpage"),ExcelUtilities.getStringData(4,1,"loginpage")}};
	}
	
}
