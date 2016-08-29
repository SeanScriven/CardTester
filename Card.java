public class Card {
	
	int rank;
	String suit;

	public Card(int r, String s){
		rank = r;
		suit = s;
	}
	
	public boolean higher(Card c) {
        return rank > c.rank;
    }
    
    public boolean lower(Card c) {
        return rank < c.rank;
    }
    
    public String toString() {
        return rank + " of " + suit;
    }
}
