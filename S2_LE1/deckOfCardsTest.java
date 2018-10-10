package S2_LE1;

//fig 7.13 deckOfCardsTest.java

public class deckOfCardsTest {
    //execute application
    public static void main(String[] args) {
        deckOfCards myDeckOfCards = new deckOfCards();
        myDeckOfCards.shuffle(); //place cards in random order

        //print all 52 cards in order dealt
        for (int i= 1; i <= 52; i++) {
            //deal and display card
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) { //output new line after every 4th card
                System.out.println();
            }
        }
    }
}
