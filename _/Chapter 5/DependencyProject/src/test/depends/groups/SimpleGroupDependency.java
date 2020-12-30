package test.depends.groups;

import org.testng.annotations.Test;

public class SimpleGroupDependency {
	@Test(dependsOnGroups={"test-group"})
	public void groupTestOne(){
		System.out.println("Group Test method one");
	}
	
	@Test(groups={"test-group"})
	public void groupTestTwo(){
		System.out.println("Group test method two");
	}
	
	@Test(groups={"test-group"})
	public void groupTestThree(){
		System.out.println("Group Test method three");
	}
}
