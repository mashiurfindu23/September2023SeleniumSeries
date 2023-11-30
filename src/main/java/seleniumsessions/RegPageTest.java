package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		BrowserUtil brUtil	= new BrowserUtil();
	
		WebDriver driver =	brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageURL());
		
		By firstName= By.id("input-firstname");
		By lastName= By.id("input-lastname");
		By email= By.id("input-email");
		By telephone = By.id("input-telephone");
		By password= By.id("input-password");
		By confirmPassword= By.id("input-confirm");
		By PrivatePolicy = By.name("agree");
		By ctnButton= By.xpath("//input[@value='Continue']");
		By header= By.tagName("h1");
		
		
		ElementUtil eleUtil= new ElementUtil(driver);
		
		eleUtil.doSendKeys(firstName, "Mashiur");
		eleUtil.doSendKeys(lastName, "Rahman");
		eleUtil.doSendKeys(email, "test1022@gmail.com");
		eleUtil.doSendKeys(telephone, "123456789");
		eleUtil.doSendKeys(password, "admin123");
		eleUtil.doSendKeys(confirmPassword, "admin123");
		eleUtil.doClick(PrivatePolicy);
		eleUtil.doClick(ctnButton);
		String headertext= eleUtil.doGetText(header);
		System.out.println(headertext);
		if(headertext.equals("Your Account Has Been Created!")){
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		
		
	
		

	}

}
