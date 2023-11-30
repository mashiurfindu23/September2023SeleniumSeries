package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationWebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// single selection

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='Denmark']")).size() > 0) {
				selectCountry("Denmark");
//				if (driver.findElements(By.xpath("//td[text()='Dhaka']")).size() > 0) {
//					selectCountry("Dhaka");   //try to select when country is not available
				break;

			}

			else {
				// pagination logic

				WebElement next = driver.findElement(By.linkText("Next"));
				
				if(next.getAttribute("class").contains("disabled")) { //this logic is for when country will not be available on the table
					
					System.out.println("pagination is over ...country is not found");
					break;
				}
				next.click();
				Thread.sleep(2000);
			}

		}
	}

	private static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}

}
