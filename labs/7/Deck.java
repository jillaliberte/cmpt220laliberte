
public class Deck {
	private Card[] deck;
	
	public Deck () {
	deck = new Card [52];
	int index = 0;
	for (int suit = 0; suit <=3; suit++) {
		for (int number = 1; number <+ 13; number++) {
			deck[index] = new Card ();
			index++;
			}
		}
	}
	public void print() {
	 System.out.println("the deck is:");
	 //for (Card deck: this)
		 System.out.println(" "+ deck);	 
	}
}

