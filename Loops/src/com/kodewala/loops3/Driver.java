package com.kodewala.loops3;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		//between 0 to 100
		Scanner sc = new Scanner(System.in);
		int luckyNumber = 99;
		int userEntered = 0;
		
		while(luckyNumber != userEntered) {
			System.out.print("Please enter a number: ");
			userEntered = Integer.parseInt(sc.next());
			
			if(luckyNumber == userEntered) {
				System.out.println("You won!!!");
				break;
			}else {
				System.err.println("Please try again...\n");
			}
		}
		sc.close();
		
	}

}
