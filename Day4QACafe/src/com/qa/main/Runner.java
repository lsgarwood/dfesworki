package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("----------------");
		System.out.println("Add orders to both arrays:");
		
		QACafeEx.addCoffee("Small Espresso");
		QACafeEx.addCoffee("Large Cold Brew");
		QACafeEx.addCoffee("Medium Cappuccino");
		QACafeEx.addCoffee("Medium Flat White");
		QACafeEx.addCoffee("Large Choc Cookie Frappe");
		QACafeEx.addCoffee("Small Caramel Iced Latte");
		
		QACafeEx.addCoffeeDone("Small Americano");
		QACafeEx.addCoffeeDone("Large Cafe Au Lait");
		QACafeEx.addCoffeeDone("Medium Strawberry Iced Tea");
		
		
		QACafeEx.howManyOrders();
		QACafeEx.printAllOrders();
		QACafeEx.howManyDoneOrders();
		QACafeEx.printAllDoneOrder();
		
		System.out.println("----------------");
		System.out.println("Move existing order to Done array:");
		
		QACafeEx.moveOrderToDone(2);
		
		QACafeEx.howManyOrders();
		QACafeEx.printAllOrders();
		QACafeEx.howManyDoneOrders();
		QACafeEx.printAllDoneOrder();
		
		System.out.println("----------------");
		System.out.println("Return the name of an order:");
		
		QACafeEx.getOrder(4);
		
		System.out.println("----------------");
		System.out.println("Modify the order by index with a new name:");

		QACafeEx.updateCoffee(0, "White Americano");
		
		QACafeEx.howManyOrders();
		QACafeEx.printAllOrders();
		
		System.out.println("----------------");
		System.out.println("Remove the order from either arrays:");
		
		QACafeEx.removeCoffeeDone(3);
		
		QACafeEx.howManyDoneOrders();
		QACafeEx.printAllDoneOrder();
		
		System.out.println("----------------");
		System.out.println("Print the length of either arrays:");
		
		QACafeEx.howManyOrders();
		QACafeEx.printAllOrders();
	}

}

	//Orders - Small Espresso
	//Orders - Large Cold Brew
	//Orders (moved across?) - Medium Cappuccino
	//Orders - Medium Flat White
	//Orders - Large Choc Cookie Frappe
	//Orders - Small Caramel Iced Latte
	//Done - Small Americano
	//Done - Large Cafe Au Lait
	//Done - Medium Strawberry Iced Tea

	//ArrayLists.setupArray();
	//ArrayLists.addPizza();
	//System.out.println(ArrayLists.getPizza(1));
	//ArrayLists.removePizza(1);
	//ArrayLists.getPizza(1);
	//ArrayLists.updatePizza(1);
	//System.out.println(ArrayLists.getPizza(1));
	//ArrayLists.forLoopArrayList();