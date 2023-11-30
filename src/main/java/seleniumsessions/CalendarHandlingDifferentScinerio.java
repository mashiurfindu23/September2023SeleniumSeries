package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandlingDifferentScinerio {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='sc-12foipm-22 cUvQPq fswDownArrow']")).click();
		
		// website : https://www.goibibo.com/
		
	// css			//div.DayPicker-Month div.DayPicker-Day--disabled:not(.DayPicker-Day--outside) //all the disabled except blank
	//css			//  div.DayPicker-Day--selected  //current date
	//css			//  div.DayPicker-Day:not(.DayPicker-Day--outside)  //dates from both the months
	//css			//  div.DayPicker-Day:not(.DayPicker-Day--outside):not(.DayPicker-Day--disabled) // all the active date

		//for disable date
	String disableDate= driver.findElement(By.cssSelector("div.DayPicker-Month div.DayPicker-Day--disabled:not(.DayPicker-Day--outside)")).getText();
	System.out.println(disableDate);
	// for current date
	String currDate= driver.findElement(By.cssSelector("div.DayPicker-Day--selected")).getText();
	System.out.println(currDate);
	
	// dates from both month
//	List<WebElement> bothMonthsDates=driver.findElements(By.cssSelector(" div.DayPicker-Day:not(.DayPicker-Day--outside)"));
	
//	for(WebElement e:bothMonthsDates) {
//		String text= e.getText();
//		System.out.println(text);
//	}
	// all the active dates from both month
	
	List<WebElement> actDates=  driver.findElements(By.cssSelector("div.DayPicker-Day:not(.DayPicker-Day--outside):not(.DayPicker-Day--disabled)"));
	
	for(WebElement e: actDates) {
		String text= e.getText();
		System.out.println(text);
	}
	
	}

}
