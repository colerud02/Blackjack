import java.util.ArrayList;

public class Hand {
	ArrayList<Card> hand = new ArrayList<Card>();

	public void addCard(Card card) {
		hand.add(card);
	}

	public int getTotalValue() {
		int total = 0;
		for (Card card : hand) {
			total += card.getValueForCount();
		}
		return total;

	}

	public boolean hasAce() {
		boolean hasAce = false;
		for (Card card : hand) {
			if (card.isAce()) {
				hasAce = true;
			}
		}
		return hasAce;

	}
	public boolean isOver21(){
		return getTotalValue()>21;
		
	}
	public boolean isOver16(){
		return getTotalValue()>16;
	}
	public boolean canHit21(){
		int total = getTotalValue();
		if (total == 21) {
			return true;
		}
		else{
			if (hasAce()) {
				total +=10;
			}
			if (total == 21) {
				return true;
			}
		}
		return false;
		
	}
}
