package lghlgh;

import java.util.ArrayList;
import java.util.Scanner;

//
//In this question, your task is implementing a card guessing game. There are four card type
//such as “spade”, “heart”, “diamond” and “club”. Each card can have value 1 to 13. The
//program chooses a card from deck and asks player card type and value. The program informs
//player about whether his/her guess is correct or wrong. Program runs until player guess is
//correct.
public class CardGuessingGame {
	public static void main(String args[]){
		//your code starts here
		ArrayList<Card> deck = generateCardDeck();
		int index = RandomTest.randomIntegerMath(1, 52);
		System.out.println(deck.get(index).getCardType() + deck.get(index).getValue());

		
		
		//generates a card deck and picks a random card from the deck.		
		
		System.out.println("Welcome to the card guessing game!\n");
		
		//Takes cardType and value inputs from the user and creates a card from inputs then checks if user has guessed the card correct or wrong.		
		//Program asks new inputs from the user until the user guesses correct.
		Scanner input = new Scanner(System.in);

		while(true){
			
			System.out.println("Kart tipini girin: ");
			String cType = input.next(); 
			
			System.out.println("Kart değerini girin: ");
			int cValue = input.nextInt();
			
			Card card1 = new Card(cType, cValue);
			
			if(card1.equals(deck.get(index))) {
				System.out.println("Kazandınız! ");
				break;
			}
			else
				System.out.println("Yeniden deneyin. ");

			


		}
		//Your code ends here
		
	}
	
	/*
	 * Generates card deck which is an arrayList that holds all cards with all types and values.
	 * there must be 52 cards in deck with types "spade", "club", "diamond", "heart" and values between 1-13
	 * */
	public static ArrayList<Card> generateCardDeck(){
		ArrayList<Card> deck = new ArrayList<Card>();
		for(int i = 0; i < 13; i++) { //String[] types = String[]{"spade", "heart" ... }
			deck.add(new Card("spade", i + 1));
		}
		for(int i = 0; i < 13; i++) {
			deck.add(new Card("heart", i + 1));
		}
		for(int i = 0; i < 13; i++) {
			deck.add(new Card("diamond", i + 1));
		}
		for(int i = 0; i < 13; i++) {
			deck.add(new Card("club", i + 1));
		}
		
		return deck;
		
	}
	

}
