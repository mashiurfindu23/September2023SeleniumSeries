package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		List <WebElement> secList= driver.findElements(By.xpath("//h5[text()='Information']/following-sibling::ul/li"));
//		System.out.println(secList.size());
//		
//		for(WebElement e:secList ) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		List<String> infoList= getFooterSectionList("Extras");
		System.out.println(infoList);
	}
	
	public static List<String> getFooterSectionList(String secName) {
		
		
		List <WebElement> secList= driver.findElements(By.xpath("//h5[text()='"+secName+"']/following-sibling::ul/li"));
		System.out.println(secList.size());
		List<String> secListText = new ArrayList<String>();
		for(WebElement e:secList ) {
			String text = e.getText();
			secListText.add(text);
		}
		return secListText;
		
	}

}
