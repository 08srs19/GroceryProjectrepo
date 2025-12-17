package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtilities;

public class ManageContactTest extends Base {
	ManageContactPage managecontactpage;
	HomePage homepage;
	@Test(description = " To verify user is able to access managecontactpage")
	public void verifyUserCanUpdate() throws IOException {

        //LOGIN
        LoginPage login = new LoginPage(driver);
        //login.enterTheUserName("admin");
        //login.enterThePassword("admin");
        String username=ExcelUtilities.getStringData(1, 0, "loginpage");
		String password=ExcelUtilities.getStringData(1, 1, "loginpage");
		login.enterTheUserName(username).enterThePassword(password);
        homepage=login.clickTheSignIn();
        
        //MANAGECONTACT
        //ManageContactPage contact = new ManageContactPage(driver);
        managecontactpage = homepage.clickOnManageContactMoreIsnfo();
        //contact.clickMoreInfo();
        //contact.clickAction();
        int phonenumber=ExcelUtilities.getIntegerData(2, 0, "contacts");
        String phonenum= String.valueOf(phonenumber);
        String emailid=ExcelUtilities.getStringData(2, 1, "contacts");
        String addressdetails=ExcelUtilities.getStringData(2, 2, "contacts");
        int deliverytime=ExcelUtilities.getIntegerData(2, 3, "contacts");
        String time= String.valueOf(deliverytime);
        int deliverycharge=ExcelUtilities.getIntegerData(2, 4, "contacts");
        String charge= String.valueOf(deliverycharge);
        //contact.updateContact(phonenum, emailid, addressdetails, time, charge);
        //contact.clickUpdate();
        managecontactpage.clickAction().updateContact(phonenum, emailid, addressdetails, time, charge).clickUpdate();
        boolean alert=managecontactpage.isSuccessAlertDisplayed();
		Assert.assertTrue(alert,Constant.ALERTDISPLAYEDFORMANAGECONTACT);
        
	}

}
