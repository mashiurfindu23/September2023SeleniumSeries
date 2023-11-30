package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		// By country= By.id("Form_getForm_Country");

//		WebElement countryList= driver.findElement(country);
//	
//		
//		Select select =  new Select(countryList);
//		
//		List<WebElement> countryListCount= select.getOptions();
//		System.out.println(countryListCount.size()-1);
//		
//		for(WebElement e: countryListCount) {
//			String text= e.getText();
//			System.out.println(text);
//			if(text.equals("Sudan")) {
//				e.click();
//				break;
//			}
//			
//		}
		By country = By.id("Form_getForm_Country");

//		int size= getTotalDropDownOptions(country);
//		System.out.println(size-1);

		// validation

		if (getTotalDropDownOptions(country) - 1 == 232) {
			System.out.println("country drop down optins is correct...");
		}

		if (getDropDownOptionsTextList(country).contains("Bangladesh")) {
			System.out.println("Bangladesh is present");
		}

		List<String> expCountryList = Arrays.asList("Bangladesh", "India", "Brazil");
		if (getDropDownOptionsTextList(country).containsAll(expCountryList)) {
			System.out.println("Pass");

		}
		
		selectDropDownValue(country, "Bermuda");
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();

	}

	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}

	public static void selectDropDownValue(By locator, String expValue) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}

	public static int getTotalDropDownOptions(By locator) {
		int optinsCount = getDropDownOptionsList(locator).size();
		System.out.println("optins count is ===>" + optinsCount);
		return optinsCount;
	}

}
