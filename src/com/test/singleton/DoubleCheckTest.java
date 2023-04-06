package com.test.singleton;

public class DoubleCheckTest {

	public static void main(String[] args) {

		DoubleCheck doubleCheckObj1 = DoubleCheck.getDoubleCheck();
		DoubleCheck doubleCheckObj2 = DoubleCheck.getDoubleCheck();
		System.out.println(doubleCheckObj1);
		System.out.println(doubleCheckObj2);
	}

}
