package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		WebElement element= driver.findElement(By.name("q"));
		
		Actions act = new Actions(driver);
		act.keyDown(element, Keys.SHIFT).sendKeys("naveen automation labs").build().perform();

	}

}
