package com.kodewala.control.flow;

public class Driver {

	public static void main(String[] args) {
		Booking book = new Booking();
		String pnr = book.doBooking("BLR", "CCU", 7);
		System.out.println(pnr);
	}

}
