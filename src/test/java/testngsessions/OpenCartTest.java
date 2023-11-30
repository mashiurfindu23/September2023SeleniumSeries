package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {
	
	
	@Test(priority=1)
	public void getTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Your Store");
	}
	@Test(priority=2)
	public void isSearchExistTest() {
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	

}
