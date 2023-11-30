package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("input-email")).sendKeys("roxy_mohsin@yahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("test@12345");
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

	}

}
