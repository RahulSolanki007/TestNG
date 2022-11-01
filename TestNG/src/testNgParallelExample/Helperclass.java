package testNgParallelExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helperclass {
	
	private static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void setDriver() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Jar's\\browser drivers\\chromedriver.exe");
		
		driver.set(new ChromeDriver());
		driver.get().manage().window().maximize();
		driver.get().get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Before Method Thread id: "+ Thread.currentThread().getId());
	}
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("After Method Thread ID: "+Thread.currentThread().getId());
		driver.get().quit();
		driver.remove();
	}

}
