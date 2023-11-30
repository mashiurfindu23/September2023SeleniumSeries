package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrameElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		waitForFrameAndSwitchToITByIdOrName(10, "main");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
//		
//		String header=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
	//	driver.switchTo().defaultContent(); to come back the main page this will remain same

	}
	
	public static void waitForFrameAndSwitchToITByIdOrName(int timeOut, String idOrName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public static void waitForFrameAndSwitchToITByIndex(int timeOut, int frameIndex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
		
	}
	
	public static void waitForFrameAndSwitchToITByFrameElement(int timeOut, WebElement frameElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
	
	public static void waitForFrameAndSwitchToITByFrameLocator(int timeOut, By frameLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	

}
