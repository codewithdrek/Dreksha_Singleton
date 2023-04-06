package com.test.singleton;

import com.test.singleton.EnumTest.EnumInitilization;

public class EnumOutsideTest {

	public static void main(String[] args) {
		EnumInitilization enumTestObj = EnumInitilization.TEST;
		enumTestObj.setName("VCBVCB");
		enumTestObj.getName();
		EnumInitilization enumTestObj2 = EnumInitilization.TEST;
		enumTestObj2.setName("<<<<");
		//enumTestObj.getName();//test by enumTestObj DOT or enumTestObj2 result will be same
	}
}
