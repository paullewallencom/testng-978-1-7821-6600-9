package test.code;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class IncludeExcludeGroupCode {

	public void includeExcludeTest(){
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		List<XmlClass> classes = new ArrayList<XmlClass>();
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Include Exclude Group suite");
		
		XmlTest test = new XmlTest(suite);
		test.setName("Include Exclude Group test");
		XmlClass clz = new XmlClass("test.sample.IncludeExcludeGroupTest");
		classes.add(clz);
		test.setXmlClasses(classes);
		
		//Including and excluding groups
		test.addIncludedGroup("group-one");
		test.addExcludedGroup("group-two");
		
		suites.add(suite);
		
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.run();		
	}
	
	public static void main(String[] args){
		IncludeExcludeGroupCode testConfig= new IncludeExcludeGroupCode();
		testConfig.includeExcludeTest();
	}
}
