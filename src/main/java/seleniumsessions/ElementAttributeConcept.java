package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String ph= driver.findElement(By.name("firstname")).getAttribute("placeholder");
	//	String srcVal	= driver.findElement(By.className("img-responsive")).getAttribute("src");
//		System.out.println(ph);
		
		By fn = By.name("firstname");
		By logo= By.className("img-responsive");
		
		String ph= getElementAttribute(fn, "placeholder");
		String srcVal=getElementAttribute(logo, "src");
		System.out.println(ph);
		System.out.println(srcVal);
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getElementAttribute(By locator, String atrrName) {
		return getElement(locator).getAttribute(atrrName);
		
	}

}
