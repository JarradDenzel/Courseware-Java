/******************************************************************************
 *  Compilation:  javac Deck.java
 *  Execution:    java Deck
 *
 *  Deal 52 cards uniformly at random.
 *
 *  % java Deck
 *  Ace of Clubs
 *  8 of Diamonds
 *  5 of Diamonds
 *  ...
 *  8 of Hearts
 *
 ******************************************************************************/

public class Deck {
	public static void main(String[] args) {
		// Multi-deck implementation, just add another set of suits and another set of ranks for each deck in the multiset
		// Otherwise just use the original 4 suits and 13 ranks
		String[] SUITS = {
			"Clubs", "Diamonds", "Hearts", "Spades", "Clubs", "Diamonds", "Hearts", "Spades"
		};

		String[] RANKS = {
			"2", "3", "4", "5", "6", "7", "8", "9", "10",
            		"Jack", "Queen", "King", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "Jack", "Queen", "King", "Ace"
		};
	
		// initialize deck
		int n = SUITS.length * RANKS.length; // 4 suits * 13 ranks = 52 cards
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}

		// shuffle deck
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n-i)); // get random card 
			String temp = deck[r]; 	// place random card into the index 
			deck[r] = deck[i];
			deck[i] = temp;
		} 

		// print shuffled deck
		for (int i = 0; i < n; i++) {
			System.out.println(deck[i]);
		}
	}
}
