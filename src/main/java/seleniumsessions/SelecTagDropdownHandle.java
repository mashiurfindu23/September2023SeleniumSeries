package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelecTagDropdownHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
//		By country =	By.id("Form_getForm_Country");
	
//	WebElement country_ele= driver.findElement(country);
//	
//	Select select = new Select(country_ele);
//	//select by index
//	select.selectByIndex(10);
//	//select by value
//	select.selectByValue("Pakistan");
//	//select by visible text 
//	
//	select.selectByVisibleText("Bangladesh");
//	
		
		By country =By.id("Form_getForm_Country");
		
		doSelectDropDownByIndex(country, 5);
		doSelectDropDownByValue(country, "Bangladesh");
		doSelectDropDownByVisibleText(country, "Afghanistan");
		
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		
	}
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}