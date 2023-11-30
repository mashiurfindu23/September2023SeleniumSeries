package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickSendKeys {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By contBtn = By.cssSelector("input[type='submit']");

//		WebElement fName = driver.findElement(fn);
//		WebElement lName = driver.findElement(ln);
//		WebElement btn = driver.findElement(contBtn);

//		Actions act = new Actions(driver);
//		act.sendKeys(fName, "Mashiur Automation").build().perform();
//		act.click(btn).build().perform();

		// Where to use Action sendkeys and action click
		// where ElementNotInterctibleException
		// Where ElementNotInterceptableException
		doActionsSendKeys(fn, "David");
		doActionsSendKeys(ln, "Automation");
		doActionsClick(contBtn);

	}

	// generic function

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}
