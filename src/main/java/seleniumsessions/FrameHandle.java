package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
	//	driver.switchTo().frame("main");
	//	or
//		String title=driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")).getText());
		String title= driver.findElement(By.tagName("h2")).getText();
	//	String title= driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		System.out.println(title);
		driver.switchTo().defaultContent();

	}

}
