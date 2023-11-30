package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com/"); //munia25, test@123
		
		driver.findElement(By.name("username")).sendKeys("munia25");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
	//	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		
		
	}

}
