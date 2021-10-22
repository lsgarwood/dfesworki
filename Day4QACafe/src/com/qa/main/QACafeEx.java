package com.qa.main;

import java.util.ArrayList;

public class QACafeEx {
	
	//Exercise - You are running a succesful cafe called QA-Cafe. 
	//With a list of orders, create methods with paramaters that can do the following:
	//2 ArrayLists, one doneOrders and orders

	//-Add a new order to an orders array
	//-Move an existing order to a 'Done orders array'
	//-Return the name of an order
	//-Modify the order by index with a new name
	//-Remove the order from either arrays
	//-Print the length of either arrays
	
	//Small Espresso
	//Large Cold Brew
	//Medium Cappucinok
	//Medium Flat White
	//Large Choc Cookie Frappe
	//Small Caramel Iced Latte
	//Small Americano
	//Large Cafe Au Lait
	//Medium Strawberry Iced Tea
	
	public static ArrayList<String> doneOrders = new ArrayList<>();
	
	public static ArrayList<String> orders = new ArrayList<>();
	
	
 	public static void addCoffee(String order) {
 		orders.add(order);
 	}
 	
 	public static void addCoffeeDone(String order) {
 		doneOrders.add(order);
 	}
	
	public static void moveOrderToDone(int index) {
 		doneOrders.add(orders.get(index)); 
 		orders.remove(index);
 	}

 	public static void removeCoffeeDone(int index) {
 		doneOrders.remove(index); 
 	}
 	
 	public static void removeCoffeeOrders(int index) {
 		orders.remove(index); 
 	}
 		
 	public static void updateCoffee(int index, String order) {
 		orders.set(index, order);
 	}
 	
 	public static void getOrder(int index) {
 		System.out.println(orders.get(index));
 	}

 	public static void clearAllCoffee() {
 		doneOrders.clear();
 	}
 	
 	public static void howManyOrders() {
 		System.out.println("There are " + (orders.size()) + " orders in the queue");
 	}
 	
 	public static void howManyDoneOrders() {
 		System.out.println("There are " + (doneOrders.size()) + " orders you have completed");
 	}
 	
	public static void printAllOrders() {
 		System.out.println(orders);
 	}
 	
 	public static void printAllDoneOrder() {
 		System.out.println(doneOrders);
 	}
}
