package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement email= driver.findElement(By.id("input-email"));
		email.sendKeys("mashiur@gmail.com");
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		email= driver.findElement(By.id("input-email"));
		email.sendKeys("rahim@gmail.com");
		
		// will give " org.openqa.selenium.StaleElementReferenceException
		// Wait also can not solve it
		// when refresh the page the DOM also refreshed for that reason email.sendKeys("rahim@gmail.com") become stale 
		
		//Solution: we have to create new webelement after refresh
		

	}

}
