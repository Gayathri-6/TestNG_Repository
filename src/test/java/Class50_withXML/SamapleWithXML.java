package Class50_withXML;

import org.testng.annotations.Test;

public class SamapleWithXML {
	@Test(groups="SWED")
	public void test1() {
		
		System.out.println("hello sweden");
		
	}
	
	@Test(groups={"IND","SL"})
	public void test2() {
		
		System.out.println("hello india");
		
	}
	
	@Test(groups="SL")
	public void test3() {
		
		System.out.println("hello sri lanka");
		
	}
	
	@Test(groups="PKST")
	public void test4() {
		
		System.out.println("hello pakistan");
		
	}

}
