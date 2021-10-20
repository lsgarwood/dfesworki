package com.qa.main;

public class Coins1 {

	//Given a cost and an amount, work out the change given in specific coinage.
		//For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:
		//1 £10 note
		//1 £5 note
		//2 20p's
		//1 2p
		
		public static void changeMethod(float price, float amountPaid) {

	 		float change = amountPaid - price;
	 		System.out.println("Total change £" + change);

	 		//Money types
	 		float twenty = 0;
	 		float tenner = 0;
	 		float fiver = 0;
	 		float twoPound = 0;
	 		float onePound = 0;
	 		float fiftyP = 0;
	 		float twentyP = 0;
	 		float tenP = 0;
	 		float fiveP = 0;
	 		float twoP = 0;
	 		float oneP = 0;

	 		while (change >= 20) {
	 			change -= 20;
	 			twenty ++;
	 		}
	 		if (twenty > 0) {
	 			System.out.println("Twenty Pound notes x " + twenty);
	 		}

	 		while (change >= 10) {
	 			change -= 10;
	 			tenner ++;
	 		}
	 		if (tenner > 0) {
	 			System.out.println("Ten Pound notes x " + tenner);
	 		}

	 		while (change >= 5) {
	 			change -= 5;
	 			fiver ++;
	 		}
	 		if (fiver > 0) {
	 			System.out.println("Five Pound notes x " + fiver);
	 		}

	 		while (change >= 2) {
	 			change -= 2;
	 			twoPound ++;
	 		}
	 		if (twoPound > 0) {
	 			System.out.println("Two Pound coins x " + twoPound);
	 		}

	 		while (change >= 1) {
	 			change -= 1;
	 			onePound ++;
	 		}
	 		if (onePound > 0) {
	 			System.out.println("One Pound coin x " + onePound);
	 		}
	 		
	 		while (change >= 0.5) {
	 			change -= 0.5;
	 			fiftyP ++;
	 		}
	 		if (fiftyP > 0) {
	 			System.out.println("50p coins x " + fiftyP);
	 		}
	 		
	 		while (change >= 0.2) {
	 			change -= 0.2;
	 			twentyP ++;
	 		}
	 		if (twentyP > 0) {
	 			System.out.println("20p coins x " + twentyP);
	 		}
	 		
	 		while (change >= 0.1) {
	 	 	 	change -= 0.1;
	 	 	 	tenP ++;
	 	 	}
	 		if (tenP > 0) {
	 			System.out.println("10p coins x " + tenP);
	 		}
	 		
	 		while (change >= 0.05) {
	 	 	 	change -= 0.05;
	 	 	 	fiveP ++;
	 		}
	 		if (fiveP >0) {
	 			System.out.println("5p coins x " + fiveP);
	 		}
	 		
	 		while (change >= 0.02) {
	 	 	 	change -= 0.02;
	 	 	 	twoP ++;
	 	 	}
	 		if (twoP > 0) {
	 			System.out.println("2p coins x " + twoP);
	 		}
	 		
	 		while (change >= 0.01) {
	 	 	 	change -= 0.01;
	 	 	 	oneP ++;
	 	 	}
	 		if (oneP > 0) {
	 			System.out.println("1p coins x " + oneP);
	 		}

	 	}
}
	
