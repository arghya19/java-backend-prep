package com.kodewala.strings2;

public class Driver1 {

	public static void main(String[] args) {
		String s = "Kodewala";//SCP
		//In case I want to change s
		
		s = s.concat(" Academy"); //trying to change the object
								//Object created in heap with content Kodewala Academy
		System.out.println(s);

	}

}
