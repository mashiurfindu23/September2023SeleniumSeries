package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowID = driver.getWindowHandle();

		Thread.sleep(3000);

		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement youEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));

		liEle.click();
		fbEle.click();
		twEle.click();
		youEle.click();
		

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(3000);
			
			if (!windowId.equals(parentWindowID)) {
				driver.close();
			}

		}
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window id is:"+ driver.getCurrentUrl());

	}

}
