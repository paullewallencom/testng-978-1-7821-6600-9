package test.classes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExampleTest {
	private String param="";
	
	public ExampleTest(String param){
		this.param=param;
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before class executed.");
	}
	
	@Test
	public void testMethod(){
		System.out.println("The the parameter value is: "+param);
	}

}
