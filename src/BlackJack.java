import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Hand player = new Hand();
		Hand dealer = new Hand();
		dealersCards(cd, dealer);
		playerCards(cd, player);
		//------------------
		while(getUsersAnswer().equals("yes")){
			Card currentCard = cd.pop();
			player.addCard(currentCard);
			System.out.println("Player currently has a "+ player.hand);
		}
	}

	private static void playerCards(CardDeck cd, Hand player) {
		Card currentCard = cd.pop();
		player.addCard(currentCard);
		currentCard = cd.pop();
		player.addCard(currentCard);
		System.out.println("Player currently has a "+ player.hand);
	}

	private static void dealersCards(CardDeck cd, Hand dealer) {
		Card currentCard = cd.pop();
		dealer.addCard(currentCard);
		System.out.println("Dealer currently has a "+ currentCard);
		currentCard = cd.pop();
		dealer.addCard(currentCard);
	}
	
	public static String getUsersAnswer() {
		System.out.println("Do you want a new card?");
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
