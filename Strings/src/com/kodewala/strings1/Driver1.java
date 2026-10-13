package com.kodewala.strings1;
class User{
	String name;
	User(String _name){
		this.name = _name;
	}
}

public class Driver1 {

	public static void main(String[] args) {
		String city1 = "Bangalore";
		
		String city2 = "Bangalore";
		
		String city3 = "Bangalore";
		
		String city4 = "Bangalore";
		
		String city5 = "Bangalore";
		
		// System.out.println(city1 == city2) -> true
		
		User user1 = new User("kodewala");
		User user2 = new User("kodedala");
		
		System.out.println(user1.equals(user2));

	}

}
