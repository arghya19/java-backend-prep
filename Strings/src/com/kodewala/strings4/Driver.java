package com.kodewala.strings4;

class AccountMgmt {// If I turn this class into final class by final keyword then we cannot extend
					// this class and make it parent
	final int UPI_LIMIT = 100000; // Constant in java

	public final void doSomething1() {
//		UPI_LIMIT =200000; //don't able to change the value
	}

	public void doSomething2() {
//		some func....
	}
}

class Account extends AccountMgmt {
	@Override
	public void doSomething2() {

	}
	
	public final void doSomething2(String s) {
//		some func....
	}
	
	public final void doSomething2(String s,int i) {
//		some func....
	}
}

public class Driver {

	public static void main(String[] args) {

	}

}
