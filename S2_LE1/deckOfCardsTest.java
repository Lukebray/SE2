package S2_LE1;

//fig 7.13 deckOfCardsTest.java
/*
Luke Bray
B00100787
22/10/2018
 */
public class deckOfCardsTest {
    //execute application
    public static void main(String[] args) {
        deckOfCards myDeckOfCards = new deckOfCards(); //create a new deck of cards
        myDeckOfCards.shuffle(); //shuffling the cards

        //print all 52 cards in order dealt
        for (int i= 1; i <= 52; i++) {
            //deal and display card
            System.out.printf("%-19s", myDeckOfCards.dealCard()); //

            if (i % 4 == 0) { //output new line after every 4th card
                System.out.println();
            }
        }
    }
}
