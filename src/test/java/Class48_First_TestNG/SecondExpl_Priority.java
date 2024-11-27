package Class48_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SecondExpl_Priority {
	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("login");
	}
	
	@Test(priority = 2)
	public void makePayment() {
		
		System.out.println("makePayment");
	}
	
	@Test(priority = 3)
	public void getReceipt() {
		
		System.out.println("getReceipt");
	}
	
	@Test(priority = 4)
	public void logout() {
		
		System.out.println("logout");
	}

}
