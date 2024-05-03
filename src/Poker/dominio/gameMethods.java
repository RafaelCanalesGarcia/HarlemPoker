package Poker.dominio;

import java.util.Scanner;

public class gameMethods {

    public static boolean crupierMenu(Crupier c){
        System.out.println("HOLA CRUPIER!!!");
        System.out.println("ELIGE TU ACCIÓN");
        System.out.println("1. Barajar");
        System.out.println("2. Repartir");
        System.out.println("3. Saca 3 cartas");
        System.out.println("4. Saca 1 carta");
        System.out.println("5. Acabar");

        Scanner in = new Scanner(System.in);

        int action = pideInt("Elige una acción: ");

        switch (action) {
            case 1:
                c.shuffle();
                System.out.println("_________________________________________________");
                System.out.println("Has barajado!");
                System.out.println("_________________________________________________");
                return false;
            case 2:
                c.deal();
                System.out.println("_________________________________________________");
                System.out.println("Has repartido!");
                System.out.println("_________________________________________________");
                return false;
            case 3:
                c.drawcards(3);
                System.out.println("_________________________________________________");
                System.out.println("Has sacado 3 cartas al tablero!");
                System.out.println("_________________________________________________");
                return false;
            case 4:
                c.drawcards(1);
                System.out.println("_________________________________________________");
                System.out.println("Has sacado 1 carta más al tablero!");
                System.out.println("_________________________________________________");
                return false;
            case 5:
                return true;
            default:
                System.out.println("Opción elegida incorrecta");
                return false;
        }

    }
    public static boolean betMenu(Player p) {
        System.out.println("ELIGE TU APUESTA");
        System.out.println("1. MATCH");
        System.out.println("2. DOUBLE");
        System.out.println("3. ALL_IN");
        System.out.println("4. LEAVE");
        System.out.println("5. SHOW TABLE");
        System.out.println("6. SHOW PERSONAL INFO");

        Scanner in = new Scanner(System.in);

        int opcion = pideInt("Elige una opción: ");

        switch (opcion) {
            case 1:
                p.bet(BetType.MATCH);
                System.out.println("Has hecho MATCH!");
                return true;
            case 2:
                p.bet(BetType.DOUBLE);
                System.out.println("Has hecho DOUBLE!");
                return true;
            case 3:
                System.out.println("Has hecho ALL_IN!");
                p.bet(BetType.ALL_IN);
                return true;
            case 4:
                p.bet(BetType.LEAVE);
                System.out.println("Te has retirado!");
                return true;
            case 5:
                System.out.println(PokerTable.getTableCards());
                return false;
            case 6:
                System.out.println("Mano: " + p.getHand());
                System.out.println("Dinero actual: " + p.getMoney());
                System.out.println("Dinero apostado: " + p.getCurrentBet());
                System.out.println("Apuesta máxima: " + PokerTable.getMaxBet());
                System.out.println("Bote: " + PokerTable.getPot());
                System.out.println("Dinero para igualar: " + (PokerTable.getMaxBet() - p.getCurrentBet()));
                return false;
            default:
                System.out.println("Opción elegida incorrecta");
                return false;
        }
    }


    public static int pideInt(String mensaje){

        while(true) {
            try {
                System.out.print(mensaje);
                Scanner in = new Scanner(System.in);
                int valor = in.nextInt();
                //in.nextLine();
                return valor;
            } catch (Exception e) {
                System.out.println("No has elegido una opción viable. Vuelve a intentarlo.");
            }
        }
    }
}
