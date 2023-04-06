package com.test.singleton;

public class BillPewTest {

	public static void main(String[] args) {

		BillPew billPewObj1 = BillPew.getBillPew();
		BillPew billPewObj2 = BillPew.getBillPew();
	System.out.println(billPewObj1);
	System.out.println(billPewObj2);
	}

}
