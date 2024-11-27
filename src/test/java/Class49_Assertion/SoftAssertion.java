package Class49_Assertion;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	// call assertAll at end always
	
		@Test
		public void test1()
		{
			System.out.println("Start");
			
			SoftAssert softAssert=new SoftAssert();
			
			AssertJUnit.assertEquals(12, 13);
			
			AssertJUnit.assertEquals(12.2, 13.2);
			
			AssertJUnit.assertEquals("Mukesh", "mukesh");
			
			AssertJUnit.assertTrue(false);
			
			AssertJUnit.assertFalse(true);
		
			System.out.println("End");
			
			softAssert.assertAll();
			
		}


}
