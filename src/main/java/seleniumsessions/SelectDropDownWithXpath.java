package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithXpath {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://www.microchip.com/prochiplicensing");
		
		WebElement year= driver.findElement(By.xpath("//select[@id='productionYear']"));
		
		Select select = new Select(year);
		
		select.selectByVisibleText("2024");
		

	}

}
