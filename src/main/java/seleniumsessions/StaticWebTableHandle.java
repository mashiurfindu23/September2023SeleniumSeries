package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		
		////table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int row= 2; row<=7;row++) {
			String xpath = beforeXpath + row + afterXpath;
		//	System.out.println(xpath);
			String value= driver.findElement(By.xpath(xpath)).getText();
			
			System.out.println(value);
		}
	}
//	int thCount= 	driver.findElements(By.xpath("//table[@id='customers']//th")).size();
//	System.out.println(thCount);
//	int hederCount= 	getTableHeaderCount();
//	System.out.println(hederCount);
//	
//	int tableRowCount= getRowCount();
//	System.out.println(tableRowCount);
	
//	List<String> rowText= getRowText();
//	System.out.println(rowText);
//	}
	
	public static int getTableHeaderCount() {
		return  driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		
	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	}
	public static int getColumnCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	}
	
	public static List<String> getRowText() {
		List<WebElement> tableRowtext= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<String> tableRowTextList = new ArrayList<String>();
		for(WebElement e: tableRowtext) {
		String text= e.getText();
		tableRowTextList.add(text);
		}
		return tableRowTextList;
	}

}
