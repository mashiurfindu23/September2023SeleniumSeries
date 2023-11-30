package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextFieldEnterValueAndDisableButton {

	public static void main(String[] args) {
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		WebElement pwd= driver.findElement(By.id("pass"));
//		pwd.sendKeys("test@123");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		WebElement disableBtn= driver.findElement(By.id("submitButton"));
		String disable_btn_text=disableBtn.getAttribute("disabled");
		System.out.println(disable_btn_text);
		
		disableBtn.click();
		

	}

}
