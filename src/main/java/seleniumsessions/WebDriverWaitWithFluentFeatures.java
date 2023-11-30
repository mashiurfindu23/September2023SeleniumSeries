package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithFluentFeatures {
	
	static WebDriver driver;

	public static void main(String[] args) {
		//WebDriverWait ----> FluentWait---->Wait
		driver= new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By freeTrial = By.linkText("Free trial");
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.pollingEvery(Duration.ofSeconds(10));
//		wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
//		wait.withMessage("---Ele Not Found----");
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial)).click();
//		
		
		// pulling time with WebDriverWait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(freeTrial)).click();
		

	}

}
