package S2_LE1;
//fig 7.11 Card
public class Card {
    private final String face; //face of card
    private final String suit; //suit of card

    //two arg constructor to initialise face and suit
    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    //return string representation of card
    public String toString() {
        return face + " of " + suit;
    }
}
