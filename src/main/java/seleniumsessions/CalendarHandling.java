package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();

//		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		System.out.println(actMonthYear);
//
//		while (!actMonthYear.equalsIgnoreCase("March 2025")) {
//
//			// click on next button
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//			System.out.println(actMonthYear);

		

		// driver.findElement(By.xpath("//a[text()='13']")).click();

	//	selectDate("25");

		// selectCalendarDate("15");
		
		selectFutureDate("February 2024", "15");

	}
	// generic method
	public static void selectFutureDate(String expMonthYear, String day) {
		
		if(expMonthYear.contains("February")&& Integer.parseInt(day)>29){
			System.out.println("you have pass the wrong date..please pass the right date for the month of February.."+day);
			return;
		}
		
		if(Integer.parseInt(day)>31) {
			System.out.println("you have pass the wrong date..please pass the right date.."+day);
			return;
		}
		
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthYear);

		while (!actMonthYear.equalsIgnoreCase(expMonthYear)) {

			// click on next button
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthYear);

		}

		selectDate(day);

	}

	public static void selectCalendarDate(String day) {
		List<WebElement> dayList = driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(dayList.size());

		for (WebElement e : dayList) {
			String text = e.getText();
			if (text.equals(day)) {
				e.click();
				break;
			}
		}
	}

	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
		
		// website : https://www.goibibo.com/
		
		//div.DayPicker-Month div.DayPicker-Day--disabled:not(.DayPicker-Day--outside) //all the disabled except blank
		//  div.DayPicker-Day--selected  //current date
		//  div.DayPicker-Day:not(.DayPicker-Day--outside)  //dates from both the months
		//  div.DayPicker-Day:not(.DayPicker-Day--outside):not(.DayPicker-Day--disabled) // all the active date

	}

}
