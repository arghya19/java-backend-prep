package com.kodewala.control.flow2;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nymber between 1-7: ");
		int day = Integer.parseInt(sc.next());
		sc.close();
		
		new Driver().identifyDay(day);
	}
	
	public void identifyDay(int day) {
		switch(day) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUES");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("TH");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 7:
			System.out.println("SUN");
			break;
		default:
			System.out.println("Invalid Input! Please enter the value between 1-7.");
		}
		
		
	}
}
