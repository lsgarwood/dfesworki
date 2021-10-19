package com.qa.main;

public class Main {

	public static void main(String[] args) {
		
	Turtle stripeyFlippers = new Turtle("Brown", true, 10.5f, 35, 15, 23);
	Turtle speedyBoy = new Turtle("Green", true, 11.6f, 70, 25, 38);
	
	System.out.println(stripeyFlippers.toString());
	System.out.println(speedyBoy.toString());
	System.out.println(speedyBoy.offspring);
	}
}
