package com.kodewala.sb.query;

public class QueryGenerator {
	public StringBuilder generateQuery(int salary, String empID) {
		StringBuilder query = new StringBuilder("select * from employee ");//created sb object
		
		if(salary > 0) {
			query.append(" where salary = "+ salary +";");
		}else if(empID != null) {
			query.append(" where empID = "+ empID + ";");
		}else {
			query.append(";");//Modifying existing object
		}
		return query;
	}

	public static void main(String[] args) {
		

	}

}
