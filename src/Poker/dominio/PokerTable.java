package Poker.dominio;

import java.util.ArrayList;


public class PokerTable {

    // Variables

    private static int pot = 0;

    private static int maxBet= 100;
    public static ArrayList<Card> tableCards = new ArrayList<>();
    // constructor

    public PokerTable(int pot) {
        this.pot = pot;
    }


    // Getters an Setters

    public static ArrayList<Card> getTableCards() {
        return tableCards;
    }

    public static int getPot() {
        return pot;
    }
    public static void setPot(int pot) {
        PokerTable.pot = pot;
    }

    public static int getMaxBet() {
        return maxBet;
    }

    public static void setMaxBet(int maxBet) {
        PokerTable.maxBet = maxBet;
    }

// Constructor

    // Methods
    public static void updateMaxBet(int bet) {
        if (bet > maxBet) {
            maxBet = bet;
        }
    }




}