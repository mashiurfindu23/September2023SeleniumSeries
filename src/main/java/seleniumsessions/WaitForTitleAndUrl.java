package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndUrl {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.linkText("Forgotten Password")).click();
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.titleContains("Password?"));
//
//		System.out.println(driver.getTitle());
		String title= waitForTitleContainsAndFetch(10, "Forgot Your Password?");
		if(title.contains("Password?")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}

	}
	
	public static String waitForTitleContainsAndFetch(int timeOut, String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();
		
	}
	
	public static String waitForTitleIsAndFetch(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();
		
	}
	
	public static String waitForUrlContainsAndFetch(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlContains(urlFractionValue));
		return driver.getCurrentUrl();
	}
	public static String waitForUrlAndFetch(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlToBe(urlValue));
		return driver.getCurrentUrl();
	}
	public static Boolean waitForURLContains(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(urlFractionValue));
	}
	

}
