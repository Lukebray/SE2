package S2_LE1;
//fig 7.12 deckOfCards

import java.security.SecureRandom;
public class deckOfCards {
    private Card[] deck; //declare deck array
    private int currentCard; //index of card to be dealt
    private static final int NUMBER_OF_CARDS = 52; //constant # of cards
    //rand number gen
    private static final SecureRandom randomNumbers = new SecureRandom();

    //constructor fills deck of cards
    public deckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; //create array of card objects
        currentCard = 0; //first card dealt will be deck[0]

        //populate deck with cards
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

        //shuffle deck with one-pass algorithm
        public void shuffle() {
            //next call to method dealCard should start at deck[0] again
        currentCard = 0;

        //for each card pick another random card and swap them
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //swap current card with randomly selected card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

        //deal a card
        public Card dealCard() {
            //determine if cards remain to be dealt
            if (currentCard < deck.length) {
                return deck[currentCard++]; //return current card in array
            }
            else {
                return null; //return null to indicate all cards were dealt
            }

    }
}
