package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtilities;

public class ManageFooterTextTest extends Base{
	@Test(description = " To verify user is able to access FooterTextInformations")
	public void verifyUserCanUpdate() throws IOException {

        //LOGIN
        LoginPage login = new LoginPage(driver);
        //login.enterTheUserName("admin");
        //login.enterThePassword("admin");
        String username=ExcelUtilities.getStringData(1, 0, "loginpage");
		String password=ExcelUtilities.getStringData(1, 1, "loginpage");
		login.enterTheUserName(username);
		login.enterThePassword(password);
        login.clickTheSignIn();
        
        //MANAGEFOOTERTEXT
        ManageFooterTextPage footer=new ManageFooterTextPage(driver);
        footer.clickMoreInfo();
        footer.clickAction();
        int phonenumber=ExcelUtilities.getIntegerData(1, 0, "contacts");
        String phonenum= String.valueOf(phonenumber);
        String emailid=ExcelUtilities.getStringData(1, 1, "contacts");
        String addressdetails=ExcelUtilities.getStringData(1, 2, "contacts");
        footer.updateContact(phonenum, emailid, addressdetails);
        footer.clickUpdate();
        boolean alert=footer.isSuccessAlertDisplayed();
		Assert.assertTrue(alert,Constant.ALERTDISPLAYEDFORMANAGEFOOTERTEXT);
	}

}
