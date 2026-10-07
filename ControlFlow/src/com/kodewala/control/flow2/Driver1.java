package com.kodewala.control.flow2;

public class Driver1 {

	public static void main(String[] args) {
		String name = args[0];
		String type = args[1];
		double totalBill = Double.parseDouble(args[2]);
		Ecommerce cs1 = new Ecommerce(name, type, totalBill);
		
		new Ecommerce().calculateFinalBill(cs1.totalBill, cs1.customerType);

	}

}
