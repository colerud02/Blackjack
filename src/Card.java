
public class Card {
	String suit;
	int card;

	public Card(String suit, int card) {
		this.card = card;
		this.suit = suit;

	}

	public String toString() {
		String cardName;
		if (card == 11) {
			cardName = "Jack";
		} else if (card == 12) {
			cardName = "Queen";
		} else if (card == 13) {
			cardName = "King";
		} else {
			cardName = card + "";
		}

		return cardName + " of " + suit;

	}
	public int getValueForCount() {
		if(card <= 10){
			return card;
		}
		else{
			return 10;
		}
	}
	
	public boolean isAce(){
		return card ==1;
	}

}
