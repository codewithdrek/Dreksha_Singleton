package com.test.singleton;
// we can call this As thread safe Singleton

public class DoubleCheck {

	private static DoubleCheck test;

	private DoubleCheck() {
	}

	
	// imporve Perfomance By Double check Lock see Double Check Code Test class

	public static DoubleCheck getDoubleCheck() {

		//Double check or Race condition
		if (test == null) {
			synchronized (DoubleCheck.class) {

				if (test == null) {
					test = new DoubleCheck();
				}
			}
		}

		return test;

	}

	
	
}
///we can call this As thread safe Singleton : solves multi threaded singleton problum
//Main focus of lazy is to create object when it is needed then only make
//Hashcode ka matlab hota hai memory me ek hi location(Address) per data rakhana 
//above code is dangaser in multithreaded enviroment 
//to avoid that we use Syncronized 
//if we put public synchronized static LazyInitilization getLazyInitilization()
//at method level again it lock method so put synchronized inside the getLazyInitilization() methid so that
//lock only one few lines 
//See above Double check lock
