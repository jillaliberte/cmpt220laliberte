import java.util.Random;
public class Card {
	
	private String suit, number;
	
	 private static final String [] suits = {"Dimonds", "Hearts", "Clubs", "Spades"};
	 private static final String [] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	  
	 public Card () {
		 Random random = new Random ();
		 int randomSuit = random.nextInt(suits.length);
		 int randomNumber = random.nextInt(numbers.length);
		 suit = suits[randomSuit];
		 number = numbers[randomNumber];
	 }

	public String getSuit() {
		return suit;
	}
	public String getNumber() {
		return number; 
	}
}
