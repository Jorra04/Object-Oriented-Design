
public class Player {
	private String name;
	private int score;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public void addToScore(Card card) {
		/*
		 * for the ace, we have to deal with high and low denominations.
		 */
		if(card.getDenomination() == 0) { 
			if(this.score + 14 > 21) this.score += 1;
			
			else this.score += 14;
		}
		
		else {
			this.score += card.getDenomination() + 1;
		}
	}
	
	public int getScore() {
		return this.score;
	}
}
