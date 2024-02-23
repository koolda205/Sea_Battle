import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        BattleShip[][] battleFieldPlayer2 = new BattleShip[10][10];
//        for (int x = 0; x < battleFieldPlayer2.length; x++) {
//            for (int y = 0; y < battleFieldPlayer2.length; y++) {
//                battleFieldPlayer2[x][y] = BattleShip.EMPTY;
//            }
//        }
        BattleShip[][] battleShipPlayer1 = {
                {BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP},
        };

        BattleShip[][] battleShipPlayer2 = {
                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
        };


        Player player1 = new Player(battleShipPlayer1, "Player1");
        Player player2 = new Player(battleShipPlayer2, "Player2");

        BattleBoard battleBoardPlayer1 = new BattleBoard(player1);
        BattleBoard battleBoardPlayer2 = new BattleBoard(player2);


        seaBattle(player1, player2, battleBoardPlayer1, battleBoardPlayer2);
    }

    public static void seaBattle(Player player1, Player player2, BattleBoard battleBoardPlayer1, BattleBoard battleBoardPlayer2) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Поле заполняет первый игрок :");
        battleBoardPlayer2.printEnemyBattleShip();

        while (player2.getEnemyShip() < 3) {

            String stringScaner = scanner.nextLine();
            String stringScaner2 = scanner.nextLine();

            battleBoardPlayer2.makeBattleShip(stringScaner, stringScaner2);

        }
        battleBoardPlayer2.printEnemyBattleShip();

        while (player1.getEnemyShip() < 3) {

            String stringScaner = scanner.nextLine();
            String stringScaner2 = scanner.nextLine();

            battleBoardPlayer1.makeBattleShip(stringScaner, stringScaner2);

        }

        battleBoardPlayer1.printEnemyBattleShip();


        boolean turnPlayer1 = true;

        while (player1.getEnemyShip() > 0 || player2.getEnemyShip() > 0) {

            if (turnPlayer1) {

                System.out.println("Стреляет " + player1.getName());
                battleBoardPlayer1.printBattleField();

                String stringScaner = scanner.nextLine();
                String stringScaner2 = scanner.nextLine();

                if (stringScaner.equals("выход")) {
                    break;
                } else if (stringScaner.equals("жизни")) {
                    System.out.println("У соперника осталось: " + player1.getEnemyShip());
                }

                boolean hitPlayer1 = battleBoardPlayer1.playerShoots(stringScaner, stringScaner2);

                if (!hitPlayer1) {
                    turnPlayer1 = false;
                }

            } else {
                System.out.println("Стреляет " + player2.getName());
                battleBoardPlayer2.printBattleField();

                String stringScaner = scanner.nextLine();
                String stringScaner2 = scanner.nextLine();

                if (stringScaner.equals("выход")) {
                    break;
                } else if (stringScaner.equals("жизни")) {
                    System.out.println("У соперника осталось: " + player2.getEnemyShip());
                }

                boolean hitPlayer2 = battleBoardPlayer2.playerShoots(stringScaner, stringScaner2);

                if (player2.getEnemyShip() == 0) {
                    break;
                }

                if (!hitPlayer2) {
                    turnPlayer1 = true;
                }
            }
        }
        System.out.println((player1.getEnemyShip() < player2.getEnemyShip()) ?
                ("Победил " + player1.getName() + "!") :
                ("Победил " + player2.getName() + "!"));

    }

    static void exitGame() {
        return;
    }


}
