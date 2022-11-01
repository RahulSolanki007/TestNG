package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {

	@Test
	public void AssertionFailure() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Jar's\\browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		String actualTitle = "Google";
		
		String expectedTitle = driver.getTitle();
		String expectedText = driver.findElement(By.xpath("//*[@title=\"Google\"]")).getText();
		
		/*Hard Assert*/
		Assert.assertEquals(actualTitle, expectedTitle,"Incorrect page tittle");
		Assert.assertEquals("abc", expectedText);		
	}
	
	@Test
	public void print() {
		System.out.println("Hard Assertion is displayed");
	}
}
