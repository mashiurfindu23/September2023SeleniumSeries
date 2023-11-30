package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionWithFindElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.get("https://www.freshworks.com/");
//		
//		List<WebElement>footerLinkList= driver.findElements(By.xpath("//*[@id=\"__next\"]/footer/div/div[2]/nav/div[1]/ul/li"));
//		
//		for(WebElement e:footerLinkList) {
//			String text= e.getText();
//			System.out.println();
//		
//		}
//		
//		for(int i=0; i<footerLinkList.size();i++) {
//			footerLinkList.get(i).click(); //v1 DOM
//			Thread.sleep(3000);
//			// v2 DOM will come in this case I will get StaleElementException becase DOM is refreshing
//			//solution again we have to create list of element
//			footerLinkList= driver.findElements(By.xpath("//*[@id=\"__next\"]/footer/div/div[2]/nav/div[1]/ul/li"));
//		}
		
		List<WebElement> navAutFooterLink=driver.findElements(By.xpath("//footer//a"));
		
		for(int i=0;i<navAutFooterLink.size();i++) {
			navAutFooterLink.get(i).click();
			driver.navigate().back();   // I may get StaleElementException
			//solution:
			Thread.sleep(2000);
			navAutFooterLink=driver.findElements(By.xpath("//footer//a"));
		}
		
	}

}
