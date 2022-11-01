package annotations;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNgPriorityDemo {
	
	/* with out priority all the @Test will run in alphabetical order */
	
	@Test(priority = 3)
	public void FirstTest() {
		System.out.println("This is test case 1");
	}
	
	@Test(priority = 4)
	public void SecoundTest() {
		System.out.println("This is test case 2");
	}
	
	/* To disable a test case in TestNg we can use this annotation enabled */
	@Test(priority = 3,enabled = false)
	public void ThirdTest() {
		System.out.println("This is test case 3");
	}
	/* another way to disable test case */
    /* this annotation we can also used at class level,
     *  all the test in that class is ignored when we run multiple classes using xml */
	@Ignore
	@Test(priority = 1)
	public void FourthTest() {
		System.out.println("This is test case 4");
	}

}
