package com.google.sample;

class Hello {

    int x;

    static void display(Hello obj) {
        System.out.println(obj.x);
    }
    
    public static void main(String[] args) {
		display(new Hello());
	}
}
