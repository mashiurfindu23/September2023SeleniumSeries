package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
	
		WebElement srcElement=driver.findElement(By.id("draggable"));
		WebElement targetEle=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
	//	act.click(srcElement).moveToElement(targetEle).release().build().perform();
		act.dragAndDrop(srcElement, targetEle).build().perform();
		
		
		
		

	}

}
