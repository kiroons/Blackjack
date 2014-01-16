
package blackjack;

/**
 *
 * @author kclark
 */
public class Card {
    
    private Suit suit;
    private Rank rank;
    
    /**
     * Constructor
     * @param s the suit of the card (e.g., Heart, Diamond)
     * @param r the rank of the card (e.g., Ace, 5, Queen)
     */
    public Card(Suit s, Rank r) {
        suit = s;
        rank = r;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    
    
    public enum Suit {

        HEART,
        SPADE,
        CLUB,
        DIAMOND
    }

    public enum Rank {

        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }
    
    @Override
    public String toString() {
        return "[" + suit + ", " + rank +"]";
    }
}
