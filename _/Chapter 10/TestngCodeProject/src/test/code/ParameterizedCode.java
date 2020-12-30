package test.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class ParameterizedCode {

	public void parameterizedTest(){
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		List<XmlClass> classes = new ArrayList<XmlClass>();
		Map<String,String> suiteParams = new HashMap<String,String>();
		Map<String,String> testParams = new HashMap<String,String>();
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Parameterized suite");
		
		//Defining suite level params and their values
		suiteParams.put("suite-param-one", "Suite Param One");
		suiteParams.put("suite-param-two", "Suite Param Two");
		//Setting the params to the suite
		suite.setParameters(suiteParams);
		
		XmlTest test = new XmlTest(suite);
		test.setName("Parameterized test");
		
		//Defining test level params and their values
		testParams.put("test-param-one", "Test Param One");
		testParams.put("test-param-two", "Test Param Two");
		//Setting the test level params
		test.setParameters(testParams);
		
		XmlClass clz = new XmlClass("test.sample.ParametrizedTest");
		classes.add(clz);
		test.setXmlClasses(classes);
		
		
		suites.add(suite);
		
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();		
	}
	
	public static void main(String[] args){
		ParameterizedCode paramTst= new ParameterizedCode();
		paramTst.parameterizedTest();
	}
}
