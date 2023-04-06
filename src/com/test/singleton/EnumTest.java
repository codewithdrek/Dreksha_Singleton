package com.test.singleton;

public class EnumTest {

	// private static final EnumTest test = new EnumTest();
	//this enum class can be made as seprate Enum outside 
	public enum EnumInitilization {
		// test; // Same /public static final EnumTest test = new EnumTest();
		TEST; // new karke obje not required ,JVM will create obj by itseld and assign in TEST variable 

		String NAME;

		public void setName(String name) {
			this.NAME = name;

		}

		public void getName() {
			System.out.println("hi I am Object" + NAME);
		}

	}

	public static void main(String[] args) {

		EnumInitilization enumTestObj1 = EnumInitilization.TEST;
		EnumInitilization enumTestObj2 = EnumInitilization.TEST;
		
		enumTestObj1.setName("DRE");
		enumTestObj2.setName("PPPP");
		enumTestObj1.getName();
		
		System.out.println(enumTestObj1.hashCode());
		System.out.println(enumTestObj2.hashCode());
		
	}

}
