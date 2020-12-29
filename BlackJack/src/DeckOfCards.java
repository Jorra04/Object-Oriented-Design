import java.util.*;
public class DeckOfCards {
	private List<Card> deck;
	private static final int DECK_SIZE = 52;
	public int topOfDeck;
	
	public DeckOfCards() {
		this.topOfDeck = 0;
		this.deck = new ArrayList();
		this.fillDeck();
	}
	
	private void fillDeck() {
		for(int rank = 0; rank < 13; rank ++) {
			for(int suit = 0; suit < 4; suit ++) {
				this.deck.add(new Card(rank,suit));
			}
		}
	}
	
	public void shuffleDeck() {
		Random rand = new Random();
		Card tmp;
		int r;
		for(int i = 0; i < DeckOfCards.DECK_SIZE; i ++) {
			r = i + rand.nextInt(DeckOfCards.DECK_SIZE - i);
			tmp = deck.get(r);
			deck.set(r, deck.get(i));
			deck.set(i, tmp);
		}
	}
	
	public List<Card> getDeck(){
		return this.deck;
	}
	
	public String toString() {
		return this.deck.toString();
	}
	
}
