package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Demo {
	
	public WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Jar's\\browser drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
  }
  
  @Test
  public void validation() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harddrive");
	  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
