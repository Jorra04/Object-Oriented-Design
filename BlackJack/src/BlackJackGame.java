import java.util.*;
public class BlackJackGame {
	private DeckOfCards deck;
	private Player player;
	
	public BlackJackGame(String playerName) {
		this.deck = new DeckOfCards();
		this.player = new Player(playerName);
		
		this.deck.shuffleDeck();
	}
	
	
	public Card deal() {
		
		if(this.deck.topOfDeck >= 52) {
			throw new IllegalArgumentException("Deck is Empty");
		}
		Card card = this.deck.getDeck().get(this.deck.topOfDeck ++);
		this.player.addToScore(card);

		return card;
	}
	
	public int getPlayerScore() {
		return this.player.getScore();
	}
}
