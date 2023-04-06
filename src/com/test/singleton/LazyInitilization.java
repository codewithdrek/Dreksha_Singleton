package com.test.singleton;

import java.io.Serializable;

public class LazyInitilization  implements Serializable{

	private static  LazyInitilization test;

	private LazyInitilization() {
	}

	// Perfomance go low if synchronized keyord is at method level

	public synchronized static LazyInitilization getLazyInitilization() {

		if (test == null) {
			test = new LazyInitilization();
		}

		return test;

	}

	// imporve Perfomance By Double check Lock see Double Check Code Test class

}
//Main focus of lazy is to create object when it is needed then only make
//Hashcode ka matlab hota hai memory me ek hi location(Address) per data rakhana 
//above code is dangaser in multithreaded enviroment 
//to avoid that we use Syncronized 
//if we put public synchronized static LazyInitilization getLazyInitilization()
//at method level again it lock method so put synchronized inside the getLazyInitilization() methid so that
//lock only one few lines 
//See above Double check lock
