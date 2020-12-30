package test.parallelism;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTestClassTwo {
	@BeforeClass
	public void beforeClass(){
		long id = Thread.currentThread().getId();
		System.out.println("Before test-class SampleTestClassTwo. Thread id is: "+id);		
	}
	
	@Test
	public void testMethodOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Sample test-method One SampleTestClassTwo. Thread id is: "+id);
	}

	@Test
	public void testMethodTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Sample test-method Two SampleTestClassTwo. Thread id is: "+id);
	}
	
	@AfterClass
	public void afterClass(){
		long id = Thread.currentThread().getId();
		System.out.println("After test-method SampleTestClassTwo. Thread id is: "+id);		
	}
}
