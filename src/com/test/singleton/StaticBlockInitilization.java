package com.test.singleton;

public class StaticBlockInitilization {

	private static StaticBlockInitilization test;

	private StaticBlockInitilization() {

	}
// by using static block we cant make 2 obj
	static {
		try {
			test = new StaticBlockInitilization();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
	
	public static StaticBlockInitilization getBlockInitilization(){
		return test;
	}

}
