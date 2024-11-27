package Class51_CrossBrsTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleParam_1 {
	@Parameters({"Browser","Version"})
	@Test
	public void test1(String Browser, String Version) {
		
		System.out.println("Browser:-"+Browser+" Version:-"+Version);
	}

}
 