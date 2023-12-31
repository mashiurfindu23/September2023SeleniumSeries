package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresent {

	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		
		boolean flagImage= driver.findElement(logoImage).isDisplayed();
		System.out.println(flagImage);
		
	}
}
