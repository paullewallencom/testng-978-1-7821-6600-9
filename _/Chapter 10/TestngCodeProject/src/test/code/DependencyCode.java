package test.code;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class DependencyCode {

	public void dependencyTest(){
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		List<XmlClass> classes = new ArrayList<XmlClass>();
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Dependency suite");
		
		XmlTest test = new XmlTest(suite);
		test.setName("Dependency test");
		XmlClass clz = new XmlClass("test.sample.DependencyTest");
		classes.add(clz);
		test.setXmlClasses(classes);
		
		//Defining an xml dependency where "group-one" depends on "group-two" 
		test.addXmlDependencyGroup("group-one", "group-two");
		
		suites.add(suite);
		
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();		
	}
	
	public static void main(String[] args){
		DependencyCode testConfig= new DependencyCode();
		testConfig.dependencyTest();
	}
}
