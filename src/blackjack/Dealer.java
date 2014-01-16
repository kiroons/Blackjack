package blackjack;

import blackjack.Card.Rank;
import blackjack.Card.Suit;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author kclark
 */
public class Dealer {
    
    private Stack<Card> deck;
    
    /**
     * Default constructor.
     */
    public Dealer() {
        
        // initialize deck of cards
        deck = new Stack<Card>();
        
        // add cards to deck
        for (Suit s : Card.Suit.values()) {
            for (Rank r : Card.Rank.values()) {
                Card newCard = new Card(s, r);
                deck.push(newCard);
            }
        }
        
        // <testing>
        //printDeck();
        // </testing>
        
        // shuffle cards
        shuffle(deck);
        
        // <testing>
        //printDeck();
        // </testing>
    }

    public Stack<Card> getDeck() {
        return deck;
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }
    
    public Card dealCard() {
        //TODO: implement
        return null;
    }
    
    public final void shuffle(List<Card> deck) {
        Collections.shuffle(deck);
       
    }
    
    public void getOutcome() {
        //TODO: Implement
    }
    
    // helper function - can remove after finished testing
    public void printDeck() {
        for (Card c : deck) {
            System.out.print(c + " ");
        }
        System.out.println("");
    }
}
