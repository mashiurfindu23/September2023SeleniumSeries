package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		
	Thread.sleep(3000);
	
//	By SugLocator= By.xpath("//div[@class='wM6W7d']/span");
		
		
//	List<WebElement> sugList= driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//	
//	System.out.println((sugList.size()));
//	
//	for(WebElement e: sugList) {
//		String text = e.getText();
//		System.out.println(text);
//		if(text.equals("naveen automation labs api testing")) {
//			e.click();
//			break;
//		}
//	}
		
	By googleSugListLocator= By.xpath("//div[@class='wM6W7d']/span");
	doSearch(googleSugListLocator, "naveen automation labs api testing");
	}
	
	
	public static void doSearch(By locator, String sugName ) {
		List<WebElement> sugList= driver.findElements(locator);
		System.out.println(sugList.size());
		for(WebElement e: sugList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(sugName)) {
				e.click();
			break;
		}
	}
			
		
	}

}
