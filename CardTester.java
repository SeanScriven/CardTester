public class CardTester {

	public static void main(String[] args) {
        
        System.out.println("the deck will print out a card");
        
        Deck deck = new Deck();
        deck.shuffle();
        Card card = deck.deal();
        System.out.println(card);
	}
}
