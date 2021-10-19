package com.qa.main;

public class Stacks {
	
	public static void firstMethod() {
		System.out.println("called first method");
		secondLayer();
		System.out.println("I just called the second layer");
	}
	
	public static void secondMethod() {
		System.out.println("second method");
	}
	
	public static void secondLayer() {
		System.out.println("Called from the secondLayer");
	}
	
}
