package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithClickAndReady {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By freeTrial = By.linkText("Free trial");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(freeTrial)).click();
		
		doClickWithActionsAndWait(10, freeTrial);

	}

	/**
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 * 
	 * @param timeOut
	 * @param locator
	 */
	public static void waitForElementClickWhenReady(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public static WebElement waitForElementToBeClickable(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));

	}
	
	public static void doClickWithActionsAndWait(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(locator));
		Actions act = new Actions(driver);
		act.click(ele).build().perform();
		
		
	}
	
}
