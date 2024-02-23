import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        BattleShip[][] battleFieldPlayer2 = new BattleShip[10][10];
//        for (int x = 0; x < battleFieldPlayer2.length; x++) {
//            for (int y = 0; y < battleFieldPlayer2.length; y++) {
//                battleFieldPlayer2[x][y] = BattleShip.EMPTY;
//            }
//        }
//        BattleShip[][] battleShipPlayer2 = {
//                {BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP},
//        };

//        BattleShip[][] battleShipPlayer1 = {
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
//                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//        };
//
//
//        Player player1 = new Player(battleShipPlayer2, "Player1");
//        Player player2 = new Player(battleShipPlayer1, "Player2");
//
//        BattleBoard battleBoardPlayer1 = new BattleBoard(player1);
//        BattleBoard battleBoardPlayer2 = new BattleBoard(player2);
        BattleShip[][] battleShipPlayer1 = new BattleShip[10][10];
        BattleShip[][] battleShipPlayer2 = new BattleShip[10][10];

        fillBattleFieldsEmpty(battleShipPlayer1);
        fillBattleFieldsEmpty(battleShipPlayer2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Игра началась");
        printBattleField(battleShipPlayer2);

        System.out.println("Поле заполняет игрок 1");
        fillPlayerBattleField(scanner, battleShipPlayer1);

        System.out.println("Поле заполняет игрок 2");
        fillPlayerBattleField(scanner, battleShipPlayer2);


        System.out.println();
        System.out.println();
        System.out.println();

        Player player1 = new Player(battleShipPlayer2, "Player1");
        Player player2 = new Player(battleShipPlayer1, "Player2");

        BattleBoard battleBoardPlayer1 = new BattleBoard(player1);
        BattleBoard battleBoardPlayer2 = new BattleBoard(player2);

        startSeaBattle(scanner, player1, player2, battleBoardPlayer1, battleBoardPlayer2);
    }

    static void fillPlayerBattleField(Scanner scanner, BattleShip[][] battleShipPlayer) {

        int counter = 0;

        while (counter < 1) {
            int intScaner = 0;
            int intScaner2 = 0;
            try {
                System.out.println("Введите первое число от 1 до 10");
                intScaner = Integer.parseInt(scanner.nextLine());

                System.out.println("Введите второе число от 1 до 10");
                intScaner2 = Integer.parseInt(scanner.nextLine());

                battleShipPlayer[intScaner2 - 1][intScaner - 1] = BattleShip.BATTLE_SHIP;
                counter++;

                printBattleField(battleShipPlayer);

            } catch (Exception e) {
                System.out.println("Ошибка!");
            }
        }
    }

    static void fillBattleFieldsEmpty(BattleShip[][] battleShipPlayer) {
        for (int x = 0; x < battleShipPlayer.length; x++) {
            for (int y = 0; y < battleShipPlayer.length; y++) {
                battleShipPlayer[x][y] = BattleShip.EMPTY;
            }
        }
    }

    static void printBattleField(BattleShip[][] battleShipPlayer) {
        for (int x = 0; x < battleShipPlayer.length; x++) {
            for (int y = 0; y < battleShipPlayer.length; y++) {
                System.out.print(battleShipPlayer[x][y]);
            }
            System.out.println();
        }
    }

    public static void startSeaBattle(Scanner scanner, Player player1, Player player2, BattleBoard battleBoardPlayer1, BattleBoard battleBoardPlayer2) {

        boolean turnPlayer1 = true;

        while (player1.getEmountEnemyShip() != 0 || player2.getEmountEnemyShip() != 0) {

            if (turnPlayer1) {

                boolean hitPlayer1 = battleBoardPlayer1.shot(scanner);

                if (player1.getEmountEnemyShip() == 0) {
                    break;
                }

                if (!hitPlayer1) {
                    turnPlayer1 = false;
                }

            } else {

                boolean hitPlayer2 = battleBoardPlayer2.shot(scanner);

                if (player2.getEmountEnemyShip() == 0) {
                    break;
                }

                if (!hitPlayer2) {
                    turnPlayer1 = true;
                }
            }
        }
        if (player1.getEmountEnemyShip() < player2.getEmountEnemyShip()) {
            System.out.println("Победил " + player1.getName() + "!");
            battleBoardPlayer1.printBattleField();
        } else {
            System.out.println("Победил " + player2.getName() + "!");
            battleBoardPlayer2.printBattleField();
        }
    }

    static void exitGame() {
        return;
    }


}
