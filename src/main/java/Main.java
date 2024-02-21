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
                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BUSY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.WOUND},

                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.DEAD},

                {BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY}
        };

        BattleShip[][] battleShipPlayer2 = {
                {BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.WOUND},

                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.EMPTY},

                {BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP, BattleShip.EMPTY, BattleShip.DEAD},

                {BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.BATTLE_SHIP,
                        BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY}
        };

        Player player1 = new Player(battleShipPlayer1, "Player1", 20);
        Player player2 = new Player(battleShipPlayer2, "Player2", 20);

        BattleBoard battleBoardPlayer1 = new BattleBoard(battleFieldPlayer1, player1);
        BattleBoard battleBoardPlayer2 = new BattleBoard(battleFieldPlayer2, player2);

        seaBattle(player1, player2, battleBoardPlayer1, battleBoardPlayer2);
    }

    public static void seaBattle(Player player1, Player player2, BattleBoard battleBoardPlayer1, BattleBoard battleBoardPlayer2) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (player1.getLive() > 0 || player2.getLive() > 0) {
            try {
                if (flag) {
                    System.out.println("Стреляет " + player1.getName());

                    String stringY = scanner.nextLine();
                    String stringX = scanner.nextLine();

                    if (stringX.equalsIgnoreCase("stop") ||
                            stringY.equalsIgnoreCase("stop") ||
                            stringX.equalsIgnoreCase("стоп") ||
                            stringY.equalsIgnoreCase("стоп")) {
                        break;
                    }

                    int y = Integer.parseInt(stringY) - 1;
                    int x = Integer.parseInt(stringX) - 1;

                    boolean hitPlayer1 = battleBoardPlayer1.printBattleField(y, x);

                    if (!hitPlayer1) {
                        System.out.println("Вы промахнулись, стреляет " + player2.getName());
                        flag = false;
                    } else {
                        System.out.println("Вы попали! Продолжает стрелять " + player1.getName());
                    }

                } else {
                    System.out.println("Стреляет " + player2.getName());

                    String stringW = scanner.nextLine();
                    String stringZ = scanner.nextLine();

                    int w = Integer.parseInt(stringW) - 1;
                    int z = Integer.parseInt(stringZ) - 1;

                    boolean hitPlayer2 = battleBoardPlayer2.printBattleField(w, z);

                    if (!hitPlayer2) {
                        System.out.println("Вы промахнулись, стреляет " + player1.getName());
                        flag = true;
                    } else {
                        System.out.println("Вы попали! Продолжает стрелять " + player2.getName());
                    }
                }
            } catch (Exception e) {
                System.err.println("Введите число от 1 до 10");
            }
        }
        System.out.println("Game over!");
    }
}
