
public class Card {
	private int suit;
	private int denomination;
	
	public Card(int denomination, int suit) {
		this.denomination = denomination;
		this.suit = suit;
	}
	
	public int getDenomination() {
		return this.denomination;
	}
	
	public int getSuit() {
		return this.suit;
	}
	
	public int compareTo(Card other) {
		if(this.denomination > other.denomination) {
			return 1;
		}
		if(this.suit > other.suit) {
			return 1;
		}
		if(this.denomination < other.denomination) {
			return -1;
		}
		if(this.suit < other.suit) {
			return -1;
		}
		return 0;
		
	}
	
	public boolean equals(Card other) {
		return this.suit == other.suit &&  this.denomination == other.denomination;
	}
	
	public String toString() {
		String[] denominations = {"Ace" ,"2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suits = {"Club", "Diamond", "Heart", "Spade"};
		
		return denominations[this.denomination] + " of " + suits[this.suit] + "s\n"; 
	}
	
	
}
