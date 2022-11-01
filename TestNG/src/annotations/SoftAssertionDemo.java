package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	
	@Test
	public void AssertionFailure() {
		
		SoftAssert softAssertion = new SoftAssert();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Jar's\\browser drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		String actualTitle = "Google";
		
		String expectedTitle = driver.getTitle();
		String expectedText = driver.findElement(By.id("headingSubtext")).getText();
		
		/*Soft Assert*/
		softAssertion.assertEquals(actualTitle, expectedTitle,"Incorrect page tittle"); //test result failed beacause of this assertion
		softAssertion.assertEquals("to continue to Gmail", expectedText);	
		
		softAssertion.assertAll();
	}
	
	@Test
	public void print() {
		System.out.println("Soft Assertion is displayed");
	}

}
