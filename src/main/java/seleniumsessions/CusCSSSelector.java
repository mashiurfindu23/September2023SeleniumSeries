package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CusCSSSelector {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		int importentFieldCount= driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,button#ssoBtn")).size();
		System.out.println(importentFieldCount);
		if(importentFieldCount==4) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
	}

}
