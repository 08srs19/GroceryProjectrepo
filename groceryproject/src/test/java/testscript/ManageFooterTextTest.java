package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtilities;

public class ManageFooterTextTest extends Base{
	ManageFooterTextPage managefootertextpage ;
	HomePage homepage;
	@Test(description = " To verify user is able to access FooterTextInformations")
	public void verifyUserCanUpdate() throws IOException {

        //LOGIN
        LoginPage login = new LoginPage(driver);
        //login.enterTheUserName("admin");
        //login.enterThePassword("admin");
        String username=ExcelUtilities.getStringData(1, 0, "loginpage");
		String password=ExcelUtilities.getStringData(1, 1, "loginpage");
		login.enterTheUserName(username).enterThePassword(password);
        homepage=login.clickTheSignIn();
        
        //MANAGEFOOTERTEXT
        //ManageFooterTextPage footer=new ManageFooterTextPage(driver);
        managefootertextpage = homepage.clickOnManageFooterTextMoreInfo();
        //footer.clickMoreInfo();
        //footer.clickAction();
        int phonenumber=ExcelUtilities.getIntegerData(1, 0, "contacts");
        String phonenum= String.valueOf(phonenumber);
        String emailid=ExcelUtilities.getStringData(1, 1, "contacts");
        String addressdetails=ExcelUtilities.getStringData(1, 2, "contacts");
        //footer.updateContact(phonenum, emailid, addressdetails);
        //footer.clickUpdate();
        managefootertextpage.clickAction().updateContact(phonenum, emailid, addressdetails).clickUpdate();
        boolean alert=managefootertextpage.isSuccessAlertDisplayed();
		Assert.assertTrue(alert,Constant.ALERTDISPLAYEDFORMANAGEFOOTERTEXT);
	}

}
