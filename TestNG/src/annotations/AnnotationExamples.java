package annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationExamples {
	
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("----------------------BeforeTest----------------");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("----------------------AfterTest----------------");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("########################## Before Method ###########################");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("########################## After Method ###########################");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("********************* Before Class ************************");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("********************* After Class ************************");
	  }
	  
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("This will execute before suit");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("This will execute After suit");
	  }
	  
  @Test
  public void logout() {
	  System.out.println("logout the application");
  }
  @Test
  public void login() {
	  System.out.println("login the application");
  }
  

 

  

  

}
