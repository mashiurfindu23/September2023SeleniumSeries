package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		// nested frame in this application f2 is inside f1 and f3 is inside the f2 frame
		// f1--ele       we can jump from f1 to f2 and f2 to f3 but not f1 to f3
			//f2--ele
				//f3--ele we can back from f3 to f2 by using parent but not f3 to f1
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("ABC");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("PQR");
		
		driver.switchTo().parentFrame();   // pointing to frame 1
		driver.findElement(By.id("inp_val")).sendKeys("ABC new come back");
		
//		driver.switchTo().frame("pact3");
//		driver.findElement(By.id("glaf")).sendKeys("I am in frame 3"); 
/*
 * currently driver is in pact1. So it is not possible to directly jump from pact1 to pact no 3. so first switch to pact2 then pact3
 */
		driver.switchTo().frame("pact2");
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("I am in frame 3");
		
	//	driver.switchTo().defaultContent(); direcctly it will not go to default conteny
	//	driver.findElement(By.id("inp_val")).sendKeys("ABC-defaul frame");
		//instead
		
		driver.switchTo().parentFrame(); //f2
		driver.switchTo().parentFrame(); //f1
		driver.findElement(By.id("inp_val")).clear();
		driver.findElement(By.id("inp_val")).sendKeys("ABC come back to frame 1");
		
		// finally main window
		driver.switchTo().defaultContent();
		
		//alternative
		driver.switchTo().frame("pact1").switchTo().frame("pact2").findElement(By.id("jex")).sendKeys("PQR");
		
		
	}

}
