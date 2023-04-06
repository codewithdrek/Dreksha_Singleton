package com.test.singleton;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DeserializtionReadResolve implements Serializable {

	private static  DeserializtionReadResolve test=null;
	private DeserializtionReadResolve() {
		
	}
	public static DeserializtionReadResolve getDeserializtionReadResolve() {
	  if(test ==null) {
		  test = new DeserializtionReadResolve();
	  }
		return test;
	}
	
	
	//This is the key which resolve the Singleton issue in File input and output or we can deserialztion 
	//At the time of deserialization JVM will call readResolve method automatically : here we arer simple returning Obj
	  protected Object readResolve() {
		  return test;
	  }
 
	// Solution for Making singleton class :protected class for making different obj in serializationFileOutIn.java  

}
