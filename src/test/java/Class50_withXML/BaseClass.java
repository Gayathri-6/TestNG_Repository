package Class50_withXML;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	@BeforeMethod
	public void login() {
		
	System.out.println("@BeforeMethod");	
	}

	@AfterMethod
	public void logout() {
		
	System.out.println("@AfterMethod");	
	}
	@BeforeClass
	public void test5() {
		
	System.out.println("@BeforeClass");	
	}
	
	@AfterClass
	public void test6() {
		
	System.out.println("@AfterClass");	
	}
	@BeforeTest
	public void test1() {
		
	System.out.println("@BeforeTest");	
	}
	
	@AfterTest
	public void test2() {
		
	System.out.println("@AfterTest");	
	}
	

	@BeforeSuite
	public void test7() {
		
	System.out.println("@BeforeSuite");	
	}
	
	@AfterSuite
	public void test8() {
		
	System.out.println("@AfterSuite");	
	}
	
	@Test
	public void test9() {
		
	System.out.println("inside Base Method");	
	}
}
