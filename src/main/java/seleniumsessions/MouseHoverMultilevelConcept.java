package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMultilevelConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bclm:']")).click();
//		
//		Thread.sleep(3000);
//		WebElement bevarage=driver.findElement(By.linkText("Beverages"));
//		Thread.sleep(3000);
//		Actions act = new Actions(driver);
//		act.moveToElement(bevarage).build().perform();
//		
//		Thread.sleep(3000);
//		
//		WebElement tea= driver.findElement(By.linkText("Tea"));
//		act.moveToElement(tea).build().perform();
//		Thread.sleep(2000);
//		
//		
//		
//		WebElement teaBags= driver.findElement(By.linkText("Tea Bags"));
//		teaBags.click();
		
		selectProductLevel4Handling("Beverages", "Tea", "Tea Bags");
	}

	public static void selectProductLevel4Handling(String level2, String level3, String level4) throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bclm:']")).click();
		
		Thread.sleep(3000);
		WebElement bevarage=driver.findElement(By.linkText(level2));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(bevarage).build().perform();
		
		Thread.sleep(3000);
		
		WebElement tea= driver.findElement(By.linkText(level3));
		act.moveToElement(tea).build().perform();
		Thread.sleep(2000);
		
		
		
		WebElement teaBags= driver.findElement(By.linkText(level4));
	
		teaBags.click();
	}
	

}
