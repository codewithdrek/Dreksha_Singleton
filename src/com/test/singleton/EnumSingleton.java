package com.test.singleton;


//Enum is thread safe 
// call by JVM itself
//fix reflection problum and serilization as well
public enum EnumSingleton {

	TEST;//mean object created and pointed to TEST Variable 
	
	void doSomething(){
		System.out.println("Do Something");
	}
}
