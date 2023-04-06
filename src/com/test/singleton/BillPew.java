package com.test.singleton;

public class BillPew {
//	private static BillPew test; // this line must be in one Static inner class 
	private BillPew() {};
	//static inner  class
	private static class  BillPewInner{
	     private static final BillPew test = new BillPew();
	}
	
	public static BillPew getBillPew() {
		return BillPewInner.test;
	}
	}
