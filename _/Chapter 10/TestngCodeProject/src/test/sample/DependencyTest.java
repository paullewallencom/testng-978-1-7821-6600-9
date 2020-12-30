package test.sample;

import org.testng.annotations.Test;

public class DependencyTest {
	@Test(groups={"group-one"})
	public void testMethodOne(){
		System.out.println("Test method one of group-one");
	}
	
	@Test(groups={"group-one"})
	public void testMethodTwo(){
		System.out.println("Test method two of group-one");
	}
	
	@Test(groups={"group-one"})
	public void testMethodThree(){
		System.out.println("Test method three of group-one");
	}
	
	@Test(groups={"group-two"})
	public void testMethodFour(){
		System.out.println("Test method Four of group-two");
	}
	
	@Test(groups={"group-two"})
	public void testMethodFive(){
		System.out.println("Test method Five of group-two");
	}

}
