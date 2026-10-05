package com.kodewala.arrays1;

public class Driver2 {

	public static void main(String[] args) {
		CustomersSBI c1 = new CustomersSBI("Arghya", "5000", "876239487");
		CustomersSBI c2 = new CustomersSBI("Raj", "10000", "8756834756");
		CustomersSBI c3 = new CustomersSBI("Debrup", "500", "31785983725");
		CustomersSBI c4 = new CustomersSBI("Jishu", "300", "3462056345");
		CustomersSBI c5 = new CustomersSBI("Soham", "60", "760534650");
		
		CustomersSBI cs[] = new CustomersSBI[5];
		cs[0] = c1;
		cs[1] = c2;
		cs[2] = c3;
		cs[3] = c4;
		cs[4] = c5;
		
		CustomersSBI c = new CustomersSBI();
		c.calculateLowBalance(cs);


	}

}
