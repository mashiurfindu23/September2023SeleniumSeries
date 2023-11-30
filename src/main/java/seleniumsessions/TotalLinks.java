package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By linkList = By.tagName("a");
		List<WebElement> taotalList = driver.findElements(linkList);
		int listCount= taotalList.size();
		System.out.println(listCount);
		
//		for(int i =0; i<listCount; i++) {
//			String text = taotalList.get(i).getText();
//		//	if(text.length()<=0) { //for blank list
//				if(text.length()>0) {
//			System.out.println(i +":"+text);
//			}
//		}
		
		// for each
		int i= 0;
		for(WebElement e: taotalList) {
			String text= e.getText();
			if(text.length()>0) {
			System.out.println(i +":"+text);
			
			}
			i++;
		}

	}
}
