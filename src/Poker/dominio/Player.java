package Poker.dominio;

import java.util.ArrayList;
import java.util.Scanner;

import static Poker.dominio.PokerTable.*;


public class Player {
    // Variables
    private ArrayList<Card> hand;

    private static ArrayList<Player> Players = new ArrayList<>();
    private String name;
    private  int money;

    private  int currentBet = 0;
    private  int toBet = 0;
    private static boolean inGame;


    // Getters y Setters

    public static ArrayList<Player> getPlayers() {
        return Players;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }


    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getCurrentBet() {
        return currentBet;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCurrentBet(int currentBet) {
        this.currentBet = currentBet;
    }

    public int getToBet() {
        return toBet;
    }

    public void setToBet(int toBet) {
        this.toBet = toBet;
    }

    public boolean isInGame() {
        return inGame;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }


    // Constructors
    public Player(String playerName, int money) {
        this.name = playerName;
        this.money = money;
        this.hand = new ArrayList<>();
        this.inGame = true;
        // getPlayers().add(this);
    }

    // Methods
    public void bet(BetType type) {
        switch (type) {
            case MATCH:
                toBet = PokerTable.getMaxBet() - currentBet;
                currentBet = currentBet + toBet;
                inGame = true;
                break;
            case DOUBLE:
                toBet = (PokerTable.getMaxBet() * 2) - currentBet;
                currentBet = currentBet + toBet;
                inGame = true;
                break;
            case ALL_IN:
                toBet = money;
                currentBet = currentBet + toBet;
                inGame = true;
                break;
            case LEAVE:
                inGame = false;
                break;
        }
        PokerTable.setMaxBet(currentBet);
        setPot(getPot()+toBet);
        money = money - toBet;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    @Override
    public String toString() {
        return name + " have " + money + " and their hand: " + hand;
    }

    public static void createPlayers() {
        Scanner inputPlayer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de jugadores: ");
        int quantityPlayers = inputPlayer.nextInt(); // indica cuantos jugadores

        for (int i = 0; i < quantityPlayers; i++) {
            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
            String playerName = inputPlayer.next(); // nombre del jugador
            Players.add(i, new Player(playerName, 10000));
        }
    }
}