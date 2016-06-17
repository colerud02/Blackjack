import java.util.Collections;
import java.util.Stack;

public class CardDeck {
	Stack<Card> deck = new Stack<Card>();
	String[] suits = { "Hearts", "Dimonds", "Clubs", "Spades" };

	public CardDeck() {
		for (String suit : suits) {
			for (int i = 1; i < 14; i++) {
				deck.push(new Card(suit, i));
			}
		}
			Collections.shuffle(deck);
	}
	public Card pop(){
		return deck.pop();
	}

}
