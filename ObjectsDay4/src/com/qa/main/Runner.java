package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		//With your main method, create an object and syso the values and run the method
			
		House dreamHouse = new House();
		
		System.out.println(dreamHouse.bedrooms);
		
		dreamHouse.viewHouse();
		
		System.out.println(dreamHouse);
		
		
		
	}
}

	//CakeTin is the data type 
	// gfSpongeCake is the name of the object
	// Equal to new CakeTin (The method we're using)
	//CakeTin gfSpongeCake = new CakeTin();
	//System.out.println(gfSpongeCake.flavour);
	//gfSpongeCake.eatCake();

	// Static methods belong to classes 
	// non static belong to objects