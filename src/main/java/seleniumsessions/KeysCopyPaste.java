package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysCopyPaste {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/account/about/");
		
		WebElement element =driver.findElement(By.xpath("//a[@class='h-c-header__cta-li-link h-c-header__cta-li-link--secondary button-standard-mobile']"));
		element.click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement userName = driver.findElement(By.id("lastName"));
		
		firstName.sendKeys("Mashiur");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		userName.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		

	}

}
