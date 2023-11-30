package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemntsFromSection {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// List<WebElement> sectionLinks =
		// driver.findElements(By.cssSelector("#column-right a"));
	//	By sectionLinks = By.cssSelector("#column-right a");
//		List<WebElement> sectionLinksList = driver.findElements(sectionLinks);
//		System.out.println(sectionLinksList.size());
//
//		for (WebElement e : sectionLinksList) {
//			String text = e.getText();
//
//			System.out.println(text);
//		}
	//	By sectionLinks = By.cssSelector("#column-right a");
		By footerLinks = By.xpath("/html/body/footer/div/div");
		
		
	//	List<String> rightPanelList= getElementsTextList(sectionLinks);
		List<String> footerLinkList= getElementsTextList(footerLinks);
		System.out.println(footerLinkList);
//		System.out.println(rightPanelList.contains("Login"));
//		System.out.println(rightPanelList.contains("My Account"));
//		System.out.println(rightPanelList.contains("Newsletter"));
		
		

	}

	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>(); //created empty list
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text); // adding value to the list
			
		}
		return eleTextList;

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
