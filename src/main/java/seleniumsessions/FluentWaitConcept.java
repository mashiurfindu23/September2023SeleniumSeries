package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");
		By freeTrial = By.linkText("Free trial");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("Element is not found on the page....");

		WebElement freeTrailEle = wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial));
		freeTrailEle.click();
	}

}
