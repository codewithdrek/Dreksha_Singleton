/**
 * 
 */
package com.test.singleton;

/**
 * @author saanvi
 *
 */
public class EagerTest {

	public static void main(String[] args) {

		EagerInitilization testEager1 = EagerInitilization.getEagerInitilization();
		EagerInitilization testEager2 = EagerInitilization.getEagerInitilization();

		System.out.println(testEager1.toString());
		System.out.println(testEager2.toString());
	}

}
