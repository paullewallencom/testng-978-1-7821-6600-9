package test.factory;

import org.testng.annotations.Factory;
import test.classes.DependencyTest;

public class DependencyFactory {
	@Factory
	public Object[] factoryMethod(){
		return new Object[]{
			new DependencyTest(1),
			new DependencyTest(2)
		};
	}

}
