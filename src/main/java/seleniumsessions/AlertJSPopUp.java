package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//js alert- simple alert, prompt,confirm
		//auth pop up
		//browser window pop up/adv pop up
		//file upload pop up
		
		driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Alert alert= driver.switchTo().alert();
		// org.openqa.selenium.NoAlertPresentException in case of no alert 
		
//		String text= alert.getText();
//		System.out.println(text);
//		alert.accept();
		//alert.dismiss();
		
		
		//for Confirmation pop up
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert alert= driver.switchTo().alert();
//		String text=alert.getText();
//		System.out.println(text);
//		alert.accept();
	//	alert.dismiss();
		
		//for Prompt pop up
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert= driver.switchTo().alert();
		String text= alert.getText();
		System.out.println(text);
		alert.sendKeys("Mashiur");
		alert.accept();
		
//		driver.findElement(By.xpath("//input[@name='proceed']")).click();
//		Alert alert= driver.switchTo().alert();
//		alert.accept();
//		
		
		

	}

}
