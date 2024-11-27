package Class49_Assertion;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Dependancy {
	
	@Test
	
	public void login() {
		System.out.println(10/5);
		System.out.println("LOgin to application");
	}
	@Test
	public void makePayment() {
		System.out.println(10/0);
		
	}
	
	@Test(dependsOnMethods={"login","makePayment"})
	public void Logout() {
		
		System.out.println("logout from application");
	}
}
