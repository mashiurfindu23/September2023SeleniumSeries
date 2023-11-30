package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
	
	

	public static void main(String[] args) throws Exception {
		
		String browserName = "chrome";
		BrowserUtil brUtil	= new BrowserUtil();
	
		WebDriver driver =	brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageURL());
	
	
	
	
	
	ElementUtil eleUtil= new ElementUtil(driver);
	By email=By.id("input-email");
	By pwd= By.id("input-password");
	By linktext= By.partialLinkText("Recurring ");
	
	eleUtil.doSendKeys(email, "roxy_mohsin@yahoo.com");
	eleUtil.doSendKeys(pwd, "test@12345");
	String val= eleUtil.doGetText(linktext);
	System.out.println(val);
	

	}

}
