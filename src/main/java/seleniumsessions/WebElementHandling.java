package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		By email= By.id("input-email");
//		By password= By.id("input-password");
//		
//		WebElement emailId= driver.findElement(email);
//		WebElement pwd=driver.findElement(password);
//		
//		emailId.sendKeys("roxy_mohsin@yahoo.com");
//		pwd.sendKeys("test@12345");
		
		By email= By.id("input-email");
		By password= By.id("input-password");
//		getElement(email).sendKeys("roxy_mohsin@yahoo.com");
//		getElement(password).sendKeys("test@12345");
//		doSendKeys(email, "roxy_mohsin@yahoo.com");
//		doSendKeys(password, "test@12345");
//		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendKeys(email, "roxy_mohsin@yahoo.com");
		eleUtil.doSendKeys(password, "test@12345");

	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
		
	}

}
