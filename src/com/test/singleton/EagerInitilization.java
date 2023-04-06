package com.test.singleton;

public class EagerInitilization {

	// private object creation
	private static final EagerInitilization test = new EagerInitilization();

	// private Constructor
	private EagerInitilization() {

	}

	//public Factory method or we can the method which gives us one object to all resources 
	public static EagerInitilization getEagerInitilization() {

		return test;
	}

}
