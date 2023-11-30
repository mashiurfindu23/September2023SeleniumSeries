package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationDataTest {
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
	driver= new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
}
	
	public void doRegistration(String fn, String ln, String email, String phone, String password, String conPassword){
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(fn);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(ln);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(conPassword);
		
		
		
	}
	
	@DataProvider
	public Object[][]getRegData() {
		return new Object[][] {
			{"Sameer", "Kumar", "sameer@gmail.com", "9090909090", "test@123","test@123"},
			{"Punam", "Nag", "punam@gmail.com", "8090909080", "test@234","test@234"},
			{"sarif", "Alam", "sarif@gmail.com", "7090909070", "test@345", "test@345"},
			{"Goutam", "Poddar", "goutam@gmail.com", "5090909050", "test@456", "test@456"},
			
		};
		
	}
	
	@Test(dataProvider="getRegData")
	public void registerTest(String fn, String ln, String email, String phone, String password, String conPassword) {
		doRegistration(fn, ln, email, phone, password, conPassword);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
