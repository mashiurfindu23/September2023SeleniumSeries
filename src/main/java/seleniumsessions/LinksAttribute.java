package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
	
//		List<WebElement> linksList= getElemnts(links);
//		int linkSize= linksList.size();
//		System.out.println(linkSize);
//		
////		int count=0;
////		for(int i= 0; i<linkSize; i++) {
////			String hrefValue= linksList.get(i).getAttribute("href");
////			System.out.println(count+":"+hrefValue);
////			count++;
////		}
//		int count = 0;
//		for(WebElement e: linksList) {
//			String hrefValue = e.getAttribute("href");
//			String text= e.getText();
//			if(text.length()>0) {
//			System.out.println(text);
//			System.out.println(count+":"+hrefValue);
//			count++;
	//	}
		
//		List<WebElement>imgVal= getElemnts(images);
//		System.out.println(imgVal.size());
//		for(WebElement e: imgVal) {
//		String srcVal=	e.getAttribute("src");
//		System.out.println(srcVal);
//		}
//		
//	}
		By links= By.tagName("a");
		By images= By.tagName("img");

		getElementAttributes(images, "src");
		if(getTotalElementCount(links)>250) {
			System.out.println("Pass");
		}
	}
		
	public static void getElementAttributes(By locator, String atrrName) {
		List<WebElement> eleList=getElemnts(locator);
		
		for(WebElement e: eleList) {
			String atrrValue = e.getAttribute(atrrName);
			System.out.println(atrrValue);
		}
	}
	
	public static int getTotalElementCount(By locator) {
		int eleCount=  getElemnts(locator).size();
		System.out.println("total elents are:" +eleCount);
		return eleCount;
	}
	
	
	public static List<WebElement> getElemnts(By locator) {
		return driver.findElements(locator);
	}
	
	

}
