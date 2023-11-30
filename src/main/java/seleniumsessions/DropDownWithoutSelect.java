package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownWithoutSelect {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		//without select class
		
		By cuntOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		List<String> expCntList = new ArrayList<String>();
		List <WebElement> optionsList= driver.findElements(cuntOptions);
		
		System.out.println(optionsList.size()-1);
		
		for(WebElement e: optionsList) {
			String text= e.getText();
			System.out.println(text);
			
			if(text.equals("Norway")) {
				e.click();
				break;
			}
			
			
		}
		
		
		

	}

}
