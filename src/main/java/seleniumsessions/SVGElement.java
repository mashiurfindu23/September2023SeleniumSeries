package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");

		WebElement frame_xpath = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(frame_xpath);

		String map_xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		List<WebElement> stateList =driver.findElements(By.xpath(map_xpath));
		System.out.println(stateList.size());

		for (WebElement e : stateList) {
			String stateName = e.getAttribute("name");   // importent video : 20 
			System.out.println(stateName);
			
//			if(stateName.equals("Maryland")) {
//				e.click();
//				break;
//			}
			
			
		}

	}

}
