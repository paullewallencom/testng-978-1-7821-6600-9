package test.factory;

import org.testng.annotations.Factory;

import test.classes.ExampleTest;

public class ExampleFactory {
	@Factory
	public Object[] factoryMethod(){
		return new Object[]{
			new ExampleTest("one"),
			new ExampleTest("two")
		};
	}

}
