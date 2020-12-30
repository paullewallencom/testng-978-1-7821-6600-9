package test.sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTest {
	@Parameters({"suite-param-one","test-param-one"})
	@Test
	public void paramTestOne(String suiteParam,String testParam){
		System.out.println("Test One.");
		System.out.println("Suite param is: "+suiteParam);
		System.out.println("Test param is: "+testParam);
	}
	
	@Parameters({"suite-param-two","test-param-two"})
	@Test
	public void paramTestTwo(String suiteParam,String testParam){
		System.out.println("Test Two.");
		System.out.println("Suite param is: "+suiteParam);
		System.out.println("Test param is: "+testParam);
	}

}
