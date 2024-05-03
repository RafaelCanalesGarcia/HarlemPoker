package Poker.main;


import Poker.dominio.Crupier;
import Poker.dominio.Deck;
import Poker.dominio.Player;
import Poker.dominio.PokerTable;

import static Poker.dominio.Player.getPlayers;
import static Poker.dominio.gameMethods.crupierMenu;

public class Main {

    public static void main(String[] args) {
        Deck poker = new Deck();
        Crupier Crupier = new Crupier("Crupier");
        Player.createPlayers();

        boolean salir = false;
        do {
            salir = crupierMenu(Crupier);
        } while (!salir);


        System.out.println("_________________________________________________");
        System.out.println(getPlayers());
        poker.showDeck();
        System.out.println(PokerTable.getTableCards());



        /*poker.shuffle();
        poker.dealCards(Player1);
        poker.dealCards(Player2);
        poker.drawcards(3);
        System.out.println(tableCards);
        poker.drawcards(1);
        System.out.println(tableCards);
        poker.drawcards(1);
        System.out.println(tableCards);

        gameMethods.betMenu(Player1);
        System.out.println("maxBet: " + PokerTable.getMaxBet()); //100
        System.out.println("pot: " + PokerTable.getPot()); // 100
        System.out.println("________________");
        System.out.println("DOUBLE");
        gameMethods.betMenu(Player2);
        System.out.println("maxBet: " + PokerTable.getMaxBet()); // 200
        System.out.println("pot: " + PokerTable.getPot());  // 300
        System.out.println("________________");
        System.out.println("DOUBLE");
        gameMethods.betMenu(Player1);
        System.out.println("maxBet: " + PokerTable.getMaxBet()); //400
        System.out.println("pot: " + PokerTable.getPot()); // 600
        System.out.println("________________");
        System.out.println("DOUBLE");
        gameMethods.betMenu(Player2);
        System.out.println("maxBet: " + PokerTable.getMaxBet()); //800
        System.out.println("pot: " + PokerTable.getPot()); // 1200
        System.out.println("________________");
        System.out.println("DOUBLE");
        gameMethods.betMenu(Player1);
        System.out.println("maxBet: " + PokerTable.getMaxBet()); //1600
        System.out.println("pot: " + PokerTable.getPot()); // 2400
        System.out.println("________________");
        System.out.println("DOUBLE");
        gameMethods.betMenu(Player2);
        System.out.println(Player2.getName() + " tiene " + Player2.getMoney() + " monedas.");
        System.out.println("Su mano: " + Player2.getHand());
        System.out.println("Cartas en mesa: " + PokerTable.getTableCards());
        System.out.println("maxBet: " + PokerTable.getMaxBet()); //1600
        System.out.println("pot: " + PokerTable.getPot()); // 3200
        System.out.println("________________");
        System.out.println("ALL_IN");
        gameMethods.betMenu(Player1);
        System.out.println(Player1.getName() + " tiene " + Player1.getMoney() + " monedas.");
        System.out.println("Su mano: " + Player1.getHand());
        System.out.println("Cartas en mesa: " + PokerTable.getTableCards());
        System.out.println("maxBet: " + PokerTable.getMaxBet()); //10000
        System.out.println("pot: " + PokerTable.getPot()); // 11600
*/
    }


}