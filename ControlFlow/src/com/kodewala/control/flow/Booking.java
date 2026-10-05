package com.kodewala.control.flow;
/*
 * This class is responsible for accepting booking from user.
 */
public class Booking {

	public String doBooking(String from, String to, int noOfPax) {
		String pnr = null;
		if(noOfPax > 6) {
			System.err.println("As per IRCTC guidelines, more than 6 pax is not allowed per pnr.");
		}else {
			pnr = "23423413";
			System.out.println("Booking Confirmed: "+pnr);
			System.out.println("Status: Confirmed");
			System.out.println("Seat: 23 A1");
		}
		return pnr;
	}
}
