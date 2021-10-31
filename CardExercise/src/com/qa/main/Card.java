package com.qa.main;

 import java.util.Random;

 public class Card {


 	private final RANK rank; 
 	private final SUIT suit;
 	public Card() {

 		super();
 		this.rank = randomRank();
 		this.suit = randomSuit();
 	}


 	public RANK randomRank() {
 		RANK rank =  RANK.values()[new Random().nextInt(RANK.values().length)];
 		return rank;


 	}
 	public SUIT randomSuit() {
 		SUIT suit = SUIT.values()[new Random().nextInt(SUIT.values().length)];
 		return suit;
 	}

 	//to string 
 	@Override
 	public String toString() {
 		return "Card " + rank + " of " + suit;

 	}








 //	public Card(RANK rank, SUIT suit) {
 //		super();
 //		this.rank = randomRank();
 //		this.suit = randomSuit();
 //	}
 //
 //
 //
 //	public RANK randomRank() {
 //		RANK rank = RANK.values()[new Random().nextInt(RANK.values().length)];
 //		return rank;
 //	}
 //
 //	public SUIT randomSuit() {
 //		SUIT suit = SUIT.values()[new Random().nextInt(SUIT.values().length)];
 //		return suit;
 //	}

 //	public Card(RANK rank, SUIT suit) {
 //	super();
 //	this.rank = rank;
 //	this.suit = suit;
 //}
 //
 //
 //public RANK getRank() {
 //	return rank;
 //}
 //
 //
 //public SUIT getSuit() {
 //	return suit;
 //}


 }