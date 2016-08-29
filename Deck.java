import java.util.Random;
public class Deck {
	private Card[] deck;
	private int indexOfLastCard;
	public Card card;
	String[] suits = {"Diamonds", "Clubs", "Spades", "Shamrocks"};
	
	public Deck(){
		deck = new Card[52];
		int indexOfNextCard = 0;
		for (int i = 0; i < suits.length; i++){
			for (int j = 1; j < 14; j++){
				deck[indexOfNextCard] = new Card(j, suits[i]);
				indexOfNextCard += 1;	
			}
		}
		indexOfLastCard = 51;
	}
	
	public void shuffle(){
		int newi;
		Card temp;
		Random index = new Random();
		
		for (int i = 0; i < indexOfLastCard + 1; i++){
			newi = index.nextInt(deck.length);
			
			temp = deck[i];
			deck[i] = deck[newi];
			deck[newi] = temp;
			
		}
	}
	
	public Card deal(){
		card = deck[indexOfLastCard];
		indexOfLastCard = indexOfLastCard - 1;
		return card;
}
}
