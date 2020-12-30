package test.factory;

import org.testng.annotations.Factory;

import test.classes.ParameterTest;

public class ParameterFactory {
	
	@Factory
	public Object[] paramFactory(){
		return new Object[]{
				new ParameterTest(0),
				new ParameterTest(1)
				};
	}
}
