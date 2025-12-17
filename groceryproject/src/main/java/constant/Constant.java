package constant;

public class Constant {
	public static final String TESTDATAFILE=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata.xlsx";
	public static final String CONFIGFILE=System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
	public static final String IMAGEFILE=System.getProperty("user.dir")+"\\src\\test\\resources\\images\\sun.jpg";
	public static final String LOGINUSINGINCORRECTUSERNAMEANDPASSWORD = "Homepage is loaded with incorrect username and incorrect password";
	public static final String LOGINUSINGCORRECTUSERNAMEANDCORRECTPASSWORD ="Homepage is not loaded after giving correct username and password";
	public static final String LOGINIUSINGINCORRECTUSERNAMEANDPASSWORD ="Homepage is loaded with incorrect username and incorrect password";
	public static final String LOGINUSINGCORRECTUSERNAMEANDINCORRECTPASSWORD ="Homepage is loaded with correct username and incorrect password";
	public static final String LOGOUTFROMTHEAPPLICATION = "Signin Page is not loaded after clicking logout from homepage";
	public static final String ALERTDISPLAYFORADMINUSER = "Alert message displayed in admin user page";
	public static final String ALERTDISPLAYEDFORMANAGECATEGORY = "Alert message displayed for managecategory page";
	public static final String ALERTDISPLAYEDFORMANAGECONTACT = "Alert message displayed for Manage contact page";
	public static final String ALERTDISPLAYEDFORMANAGEFOOTERTEXT = "Alert message displayed for manage footer text";
	public static final String ALERTDISPLAYEDFORMANAGENEWS = "Alert message displayed for manage news page";
	public static final String ALERTDISPLAYEDFORHOMEPAGE ="Home page is NOT displayed after login";
}
