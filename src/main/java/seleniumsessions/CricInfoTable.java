package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-cricket-world-cup-2023-24-1367856/netherlands-vs-pakistan-2nd-match-1384393/full-scorecard");
//		String text= driver.findElement(By.xpath("//span[text()='Imam-ul-Haq']/ancestor::td/following-sibling::td//span/span")).getText();
//		System.out.println(text);
		
		//with bats man
//		List<WebElement> wktTakerInfo=driver.findElements(By.xpath("//span[text()='Imam-ul-Haq']/ancestor::td/following-sibling::td"));
//		for(WebElement e: wktTakerInfo) {
//			String text= e.getText();
//			System.out.println(text);
//		}
		
		//without bats man
		////span[text()='Imam-ul-Haq']/ancestor::td/following-sibling::td[contains(@class, 'ds-text-right')]
//		List<WebElement> wktTakerInfo=driver.findElements(By.xpath("//span[text()='Imam-ul-Haq']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
//		for(WebElement e: wktTakerInfo) {
//			String text= e.getText();
//			System.out.println(text);
//		}
		
//		String wktTakerName= getWicketTakerName("Imam-ul-Haq");
//		System.out.println(wktTakerName);
//		
//		String wktTakerName1= getWicketTakerName("Saud Shakeel");
//		System.out.println(wktTakerName1);
		List<String> ImamulHaqScore= getScoreCardList("Imam-ul-Haq");
		System.out.println(ImamulHaqScore);
		List<String>  RizwanScore= getScoreCardList("Mohammad Rizwan");
		System.out.println(RizwanScore);
		
	}
	
	public static String getWicketTakerName(String batsmanName) {
		return driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td//span/span")).getText();
	}
	
	public static List<String> getScoreCardList(String playerName) {
		List<String> scoreCardList = new ArrayList<String>();
		List<WebElement>	scoreCard= driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		for(WebElement e:scoreCard ) {
			String text= e.getText();
			scoreCardList.add(text);
		}
		return scoreCardList;
	}

}
