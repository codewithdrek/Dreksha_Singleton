package com.test.singleton;

public class LazyTest {

	public static void main(String[] args) {
   
		LazyInitilization initilizationObj1 = LazyInitilization.getLazyInitilization();
		LazyInitilization initilizationObj2 = LazyInitilization.getLazyInitilization();
		
		System.out.println(initilizationObj1.toString());
		System.out.println(initilizationObj2.toString());
	}

}
