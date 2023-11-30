package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/icc-cricket-world-cup-2023-24-1367856/england-vs-new-zealand-1st-match-1384392/full-scorecard");
		String text= driver.findElement(By.xpath("(//span[text()='Joe Root']/ancestor::td/following-sibling::td//span)[2]")).getText();
		System.out.println(text);
		
		
		
	}

}
