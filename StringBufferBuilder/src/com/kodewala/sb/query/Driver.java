package com.kodewala.sb.query;

public class Driver {
	public static void main(String[] args) {
		StringBuilder result = new QueryGenerator().generateQuery(12000, null);
		System.out.println(result.toString());
		
		
	}
}
