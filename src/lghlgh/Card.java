package lghlgh;

/*
 * File: Card.java
 * -------------------
 * This file defines a simple class for representing a card 
 * with card type and card value
 */

public class Card {
	/* Private instance variables */
	private String cardType;
	private int value;
	
	/*
	 * Initializes intance with given card type and value
	 * */
	public Card(String cardType, int value){
		if(cardType.equals("spade") || cardType.equals("heart") || cardType.equals("diamond") || cardType.equals("club"))
			this.cardType = cardType;
		if(0 < value && value < 14)
			this.value = value;
	}
	
	/*
	 * Returns the type of card
	 * */
	public String getCardType(){
		return cardType;
	}
	
	/*
	 * Returns the value of card
	 * */
	public int getValue(){
		return value;
	}
	
	/*
	 * Checks given card equals current card
	 * If both cards are same type and have same value, this method must return true
	 * otherwise, this method must return false
	 * 
	 * */
	
	public boolean equals(Card other){
		if(other.getCardType().equals(cardType) && other.getValue() == value)
			return true;
		return false;
	}

}

