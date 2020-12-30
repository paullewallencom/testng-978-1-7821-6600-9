package test.depends.groups;

import org.testng.annotations.Test;

public class DifferentClassDependency {
	@Test(dependsOnGroups={"test-group","same-class"})
	public void testOne(){
		System.out.println("Different class test method one");
	}
	
	@Test(groups={"same-class"})
	public void testTwo(){
		System.out.println("Different class test method two");
	}
	
	@Test(groups={"same-class"})
	public void testThree(){
		System.out.println("Different class test method three");
	}
}
