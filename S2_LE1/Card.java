package S2_LE1;
//fig 7.11 Card
/*
Luke Bray
B00100787
22/10/2018
 */
public class Card {
    private final String face; //face of card
    private final String suit; //suit of card

    //two arg constructor to initialise face and suit
    //creates a single card with a face and a suit
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    //return string representation of card eg "ace of spades"
    public String toString() {
        return face + " of " + suit;
    }
}
