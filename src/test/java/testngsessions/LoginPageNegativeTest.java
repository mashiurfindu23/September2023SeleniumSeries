package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	
	public WebDriver driver;
	
	public boolean doLogin(String userName, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errorMessage=
				driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMessage);
		
		if(errorMessage.contains("No match for E-Mail Address and/or Password.")) {
			return true;
		}
		return false;
		
	}
	@DataProvider
	public Object[][]getLoginNegativeData() {
		
		return new Object[][] {
			{"roxy_mohsinn@yahoo.com", "test111@gmail.com"},
			{"rty ", "test111@gmail.com"},
			{"roxy_mohsinn@yahoo.com", "xyz"},
			{"abc ", "tes@t456"},
		};
		
	}
	
	@Test(dataProvider="getLoginNegativeData")
	public void loginTest(String userName, String password) {
		boolean flag=doLogin(userName, password);
		Assert.assertTrue(flag);
		
		
	}
	
	
	
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
	
	

}
