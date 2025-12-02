package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtilities {
	public void fileUploadUsingRobotclass(WebElement element,String path) throws AWTException {
		StringSelection s=new StringSelection(path);//StringSelection is a class to give the file path.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);//copy path to Clipboard
		Robot r=new Robot();//paste the path;robot class is used to perform keyboard events.
		r.delay(2500);//time to copy paste
		r.keyPress(KeyEvent.VK_CONTROL);//paste-cntrl+v;press ctrl
		r.keyPress(KeyEvent.VK_V);//press v
		r.keyRelease(KeyEvent.VK_CONTROL);//release ctrl
		r.keyRelease(KeyEvent.VK_V);//release v
		r.keyPress(KeyEvent.VK_ENTER);//press enter
		r.keyRelease(KeyEvent.VK_ENTER);//release enter
	}
	public void fileUploadUsingSendKeys(WebElement element,String path) {
		element.sendKeys(path);
	}

}
