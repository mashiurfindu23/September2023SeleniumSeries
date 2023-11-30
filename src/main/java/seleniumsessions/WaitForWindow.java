package seleniumsessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By twetter = By.xpath("//a[contains(@href, 'twitter.com')]");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.waitForElementClickWhenReady(10, twetter);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();

		String parentWindowId = iterator.next();
		System.out.println("parent window Id is :" + parentWindowId);

		String childWindowId = iterator.next();
		System.out.println("Child window Id is :" + childWindowId);
		
		//Switching the window

		 driver.switchTo().window(childWindowId);
		 System.out.println("Child window url is:"+driver.getCurrentUrl());
		 
		 driver.close();
		 driver.switchTo().window(parentWindowId);
		 System.out.println("Parent window url is:"+driver.getCurrentUrl());



	}

}
