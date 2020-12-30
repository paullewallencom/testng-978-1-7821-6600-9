package test.sample.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class JunitToTestngTest {
	@BeforeClass
	public static void beforeClassMethod(){
		System.out.println("Junit before class method");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Junit before method");
	}
	
	@Test
	public void testMethod(){
		System.out.println("Junit test method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Junit after method");
	}
	
	@AfterClass
	public static void afterClassMethod(){
		System.out.println("Junit after class method");
	}

}
