package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement twtEle = driver.findElement(By.xpath("//a[contains(@href,'twitter.com')]"));
		twtEle.click();
		

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();

		String parentWindowId = iterator.next();
		System.out.println("parent window Id is :" + parentWindowId);

		String childWindowId = iterator.next();
		System.out.println("Child window Id is :" + childWindowId);
		
		//Switching the window

		 driver.switchTo().window(childWindowId);
		 System.out.println("Child window url is:"+driver.getCurrentUrl());
		 
		 driver.close();
		 driver.switchTo().window(parentWindowId);
		 System.out.println("Parent window url is:"+driver.getCurrentUrl());
	//	 driver.quit();

	}

}
