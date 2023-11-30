package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//implicitly wait will applied all the elements and automatically for 10 seconds
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("roxy_mohsin@yahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
		
		
		

	}

}
