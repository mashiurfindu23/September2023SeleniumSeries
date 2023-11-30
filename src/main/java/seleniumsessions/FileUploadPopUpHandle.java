package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Mashiur\\Documents\\ExceptionHierachi.jpg");
		// type="file" attribute must be there in tag if not need to ask developer
		

	}

}
