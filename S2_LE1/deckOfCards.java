package S2_LE1;
//fig 7.12 deckOfCards
/*
Luke Bray
B00100787
22/10/2018
 */
import java.security.SecureRandom; //importing random
public class deckOfCards {
    private Card[] deck; //declare deck array
    private int currentCard; //index of card to be dealt. it is 0 at this point in execution
    private static final int NUMBER_OF_CARDS = 52; //constant # of cards. UPPERCASE indicates a constant
    //rand number gen
    private static final SecureRandom randomNumbers = new SecureRandom();

    //constructor fills deck of cards
    public deckOfCards() { //no constructor in this method
        //2 arrays each containing faces and suits
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; //this creates an array of 52 card objects using card class
        currentCard = 0; //first card dealt will be deck[0]

        //populate deck with cards
        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]); //for each card give face and suit
        }
    }

        //shuffle deck with one-pass algorithm
        public void shuffle() {
            //next call to method dealCard should start at deck[0] again
        currentCard = 0;

        //for each card pick another random card and swap them
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS); //declares a randomly selected 2nd card

            //swap current card with randomly selected card
            Card temp = deck[first]; //holding place
            deck[first] = deck[second]; //first = second
            deck[second] = temp; //reassign 2nd (old 1st) to temp
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
