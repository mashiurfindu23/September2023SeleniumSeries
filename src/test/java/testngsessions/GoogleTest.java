package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	
	@Test(priority=1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("google page title is :" + title);
		Assert.assertEquals(title, "Google");
	}

	@Test(priority=2)
	public void isSearchExistTest() {
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}

	
}
