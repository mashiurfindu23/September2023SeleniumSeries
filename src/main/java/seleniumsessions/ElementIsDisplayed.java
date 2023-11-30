package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		boolean flag= driver.findElement(By.className("img-responsive")).isDisplayed();
//		if(flag=true) {
//			System.out.println("Pass");
//		}
//		
//		else {
//			System.out.println("Fail");
//		}
//		
//		boolean flagSearch= driver.findElement(By.name("search")).isDisplayed();
//		if(flagSearch) {
//			System.out.println("Pass");
//			driver.findElement(By.name("search")).sendKeys("macbook");
		
		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		By searchIcon = By.className("btn-default");
		
			if(doElementIsDisplayed(logoImage)) {
				System.out.println("logo is presnt --- pass");
			}
			if(doElementIsDisplayed(search)) {
				System.out.println("search is present");
				doSendKeys(search, "macbook");
				doClick(searchIcon);
			}
			
			
			
			
		
		}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public static String doGetText(By locator) {
		return getElement(locator).getText();
		

	}

	public static void doClick(By locator) {
		getElement(locator).click();
		

	}
	
	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
		
		
	}


