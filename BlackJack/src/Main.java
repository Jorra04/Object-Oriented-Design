import java.util.*;

public class Main {
	public static void main(String[] args) {
//		DeckOfCards doc = new DeckOfCards();
//		System.out.println(doc.toString());
//		
//		System.out.println("=========== After Shuffle =============");
//		
//		doc.shuffleDeck();
//		
//		System.out.println(doc.toString());
		
		
//		System.out.println(game.deal());
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = in.nextLine();
		BlackJackGame game = new BlackJackGame(name);
		int val = 10;
		while(val > 0) {
			System.out.println("Enter a positive Integer to Deal Card");
			val = in.nextInt();
			Card dealt = game.deal();
			if(game.getPlayerScore() == 21 ) {
				System.out.println("Your Card: " + dealt.toString()
				+"\nYou've Won");
				val = -1;
			}
			else if(game.getPlayerScore() > 21 ) {
				System.out.println("Your Card: " + dealt.toString()
				+"\nBust! You have gone over 21!");
				val = -1;
			}
			else {
				System.out.println("Your Card: " + dealt.toString() 
				+ "\nCurrent Player Score: " + game.getPlayerScore());
			}
			
			
		}
	}
	
}
