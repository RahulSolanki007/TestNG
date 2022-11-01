package testNgParallelExample;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestsExample extends Helperclass {
	
	@Test
	public void invalidLoginTes() {
		System.out.println("Test case 1 with thread ID : "+Thread.currentThread().getId());
		
		
		getDriver().findElement(By.name("username")).sendKeys("admin123123");
		getDriver().findElement(By.name("password")).sendKeys("adm");
		getDriver().findElement(By.xpath("//*[@type=\"submit\"]")).click();
		String expectedError = getDriver().findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
		Assert.assertTrue(expectedError.contains("Invalid credentials"));
	}
	
	@Test
	public void verifylinkedIn() {
        System.out.println("Test case 2 with thread ID : "+Thread.currentThread().getId());
		
		
		Boolean linkedinIcon = getDriver().findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]/svg")).isEnabled();
		System.out.println("Actual linkedIn Text : "+linkedinIcon);
		assertTrue(linkedinIcon);
	}
	
	@Test
	public void validloginTest() {
		 System.out.println("Test case 3 with thread ID : "+Thread.currentThread().getId());
			
		
			getDriver().findElement(By.name("username")).sendKeys("Admin");
			getDriver().findElement(By.name("password")).sendKeys("admin123");
			getDriver().findElement(By.xpath("//*[@type=\"submit\"]")).click();
			String expectedText = getDriver().findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a/span")).getText();
			Assert.assertTrue(expectedText.contains("Dashboard"));
	}
	
	@Test
	public void forgotLinkText() {
		 System.out.println("Test case 4 with thread ID : "+Thread.currentThread().getId());
			
		
	        String expectedLink = getDriver()
	        		.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).getText();
	        Assert.assertTrue(expectedLink.contains("Forgot your password?"));
	}

}
