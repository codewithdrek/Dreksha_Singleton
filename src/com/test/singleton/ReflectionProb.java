package com.test.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ReflectionProb {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
     exampleReflection();
	}

	private static void exampleReflection() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor[] constructors =  LazyInitilization.class.getDeclaredConstructors();
		
		Constructor constructor = constructors[0];
		
		constructor.setAccessible(true);//hence singleton break ,we have changed private const to public of LazyInitilization class
		
		
		LazyInitilization initilizationObj1 = (LazyInitilization)constructor.newInstance();
		
		LazyInitilization initilizationObj2 = LazyInitilization.getLazyInitilization();
		
		System.out.println(initilizationObj1.hashCode());
		System.out.println(initilizationObj2.hashCode());
		
		//hense we can see my accessing private const and made them to public we are able to make 2 new obj having diff hash code 
		//Now solution is use ENUM 
		
		
		//Solution 
		EnumSingleton.TEST.doSomething(); // After this as well HAsh code cmng Diff ,check with ASH
	}

}
