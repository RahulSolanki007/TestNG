package annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertionDemo {
	
	
  @Test
  public void testAssertion() {
	  String str1 = new String("TestNG");
	  String str2 = new String("TestNG");
	  String str3 = null;
	  String str4 = "TestNG";
	  String str5 = "TestNG";
	  String str6 = new String("Not_TestNG");
	  
	  int val1 = 5;
	  int val2 = 6;
	  
	  Assert.assertEquals(str1, str2);
	  System.out.println("Equals Assertion is successfull");
	  
	  Assert.assertNotEquals(str1, str6);
	  System.out.println("Notequals assertion is successfull ");
	  
	  Assert.assertTrue(val1 < val2);
	  System.out.println("True assertion is successfull");
	  
	  Assert.assertFalse(val1 > val2);
	  System.out.println("False assertion is successfull");
	  
	  Assert.assertNotNull(str1);
	  System.out.println("not null assertion successfull");
	  
	  Assert.assertNull(str3);
	  System.out.println("Null assertion is successfull");
	  
	  Assert.assertSame(str4, str5);
	  System.out.println("Same assertion is successfull");
	  
	  Assert.assertNotSame(str1, str3);
	  System.out.println("Not same assertion is successfull");
  }
  
  
}
