package seleniumsessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick= driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClick).build().perform();
		
		List<WebElement> options= driver.findElements(By.xpath("//ul[contains(@class, 'context-menu-list')]/li/span"));
		System.out.println("right click option  :"+options.size());
		for(WebElement e: options) {
			String text= e.getText();
			System.out.println(text);
			
			if(text.equals("Paste")) {
				e.click();
				Alert alert= driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				break;
			}
			
		}
		
		

	}

}
