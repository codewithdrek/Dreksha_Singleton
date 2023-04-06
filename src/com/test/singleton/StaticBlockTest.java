package com.test.singleton;

public class StaticBlockTest {

	public static void main(String[] args) {
		StaticBlockInitilization blockInitilizationObj1 = StaticBlockInitilization.getBlockInitilization();
		StaticBlockInitilization blockInitilizationObj2 = StaticBlockInitilization.getBlockInitilization();
		
		System.out.println(blockInitilizationObj1.hashCode());
		System.out.println(blockInitilizationObj2.hashCode());
	}
}
