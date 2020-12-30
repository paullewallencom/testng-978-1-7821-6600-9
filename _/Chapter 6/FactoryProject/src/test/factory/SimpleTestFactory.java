package test.factory;

import org.testng.annotations.Factory;

import test.classes.SimpleTest;

public class SimpleTestFactory {
	
	@Factory
	public Object[] factoryMethod(){
		return new Object[]{
				new SimpleTest(),
				new SimpleTest()
				};
	}

}
