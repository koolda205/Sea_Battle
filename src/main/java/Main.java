import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BattleShip[][] battleFieldPlayer1 = new BattleShip[10][10];
        for (int x = 0; x < battleFieldPlayer1.length; x++) {
            for (int y = 0; y < battleFieldPlayer1.length; y++) {
                battleFieldPlayer1[x][y] = BattleShip.EMPTY;
            }
        }

        BattleShip[][] battleFieldPlayer2 = new BattleShip[10][10];
        for (int x = 0; x < battleFieldPlayer2.length; x++) {
            for (int y = 0; y < battleFieldPlayer2.length; y++) {
                battleFieldPlayer2[x][y] = BattleShip.EMPTY;
            }
        }
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


        Player player1 = new Player(battleShipPlayer1, "Player1", 3);
        Player player2 = new Player(battleShipPlayer2, "Player2", 3);

        BattleBoard battleBoardPlayer1 = new BattleBoard(battleFieldPlayer1, player1);
        BattleBoard battleBoardPlayer2 = new BattleBoard(battleFieldPlayer2, player2);


        seaBattle(player1, player2, battleBoardPlayer1, battleBoardPlayer2);
    }

    public static void seaBattle(Player player1, Player player2, BattleBoard battleBoardPlayer1, BattleBoard battleBoardPlayer2) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (player1.getEnemyShip() > 0 || player2.getEnemyShip() > 0) {
            try {
                if (flag) {
                    System.out.println("Стреляет " + player1.getName());
                    battleBoardPlayer1.printBattleField(11, 11);

                    String stringY = scanner.nextLine();
                    String stringX = scanner.nextLine();

                    if (stringX.equalsIgnoreCase("stop") ||
                            stringY.equalsIgnoreCase("stop") ||
                            stringX.equalsIgnoreCase("стоп") ||
                            stringY.equalsIgnoreCase("стоп")) {
                        break;
                    } else if (stringX.equalsIgnoreCase("сколько осталось жить первому") ||
                            stringY.equalsIgnoreCase("сколько осталось жить первому")) {
                        player2.getEnemyShip();
                    } else if (stringX.equalsIgnoreCase("сколько осталось жить второму") ||
                            stringY.equalsIgnoreCase("сколько осталось жить второму")) {
                        player2.getEnemyShip();
                    }

                    int y = Integer.parseInt(stringY) - 1;
                    int x = Integer.parseInt(stringX) - 1;

                    boolean hitPlayer1 = battleBoardPlayer1.printBattleField(y, x);

                    if (!hitPlayer1) {
                        flag = false;
                    }

                } else {
                    System.out.println("Стреляет " + player2.getName());
                    battleBoardPlayer2.printBattleField(11, 11);
                    System.out.println();

                    String stringW = scanner.nextLine();
                    String stringZ = scanner.nextLine();

                    int w = Integer.parseInt(stringW) - 1;
                    int z = Integer.parseInt(stringZ) - 1;

                    boolean hitPlayer2 = battleBoardPlayer2.printBattleField(w, z);

                    if (player2.getEnemyShip() == 0) {
                        break;
                    }

                    if (!hitPlayer2) {
                        flag = true;
                    }
                }
            } catch (Exception e) {
                System.err.println("Введите число от 1 до 10");
            }
        }
        String winner = (player1.getEnemyShip() == 0) ?
                "Победил " + player1.getName() + "!" :
                "Победил " + player2.getName() + "!";

        System.out.println(winner);
    }
}
