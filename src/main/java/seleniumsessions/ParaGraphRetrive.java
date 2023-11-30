package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaGraphRetrive {

	
		static WebDriver driver;

		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://classic.crmpro.com/");
			
		List <WebElement> paraText= driver.findElements(By.tagName("p"));
		
		int paraCount= paraText.size();
		System.out.println(paraCount);
		
//		int count =0;
//		for(int i=0; i<paraCount; i++) {
//		String text =	paraText.get(i).getText();
//		System.out.println(count +":"+text);
//		System.out.println("-------------------");
//		count++;
//		}
		
		int count =0;
		for(WebElement e: paraText) {
			String text= e.getText();
			System.out.println(count+":"+text);
			System.out.println("--------------------");
			count++;
		}
		
		

	}

}
