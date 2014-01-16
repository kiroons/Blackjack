/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author kclark
 */
public class Card {
    
    private Suit suit;
    private Rank rank;

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
}
