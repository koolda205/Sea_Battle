import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BattleShip[][] battleField = new BattleShip[10][10];
        for (int x = 0; x < battleField.length; x++) {
            for (int y = 0; y < battleField.length; y++) {
                battleField[x][y] = BattleShip.EMPTY;
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

        BattleBoard battleBoardPlayer1 = new BattleBoard(battleField, player1);
        BattleBoard battleBoardPlayer2 = new BattleBoard(battleField, player2);

        seaBattle(player1, player2, battleBoardPlayer1, battleBoardPlayer2, battleField);
    }

    public static void seaBattle(Player player1, Player player2, BattleBoard battleBoardPlayer1, BattleBoard battleBoardPlayer2, BattleShip[][] battleField) {

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
                    battleField[y][x] = BattleShip.BUSY;

                    boolean missPlayer1 = battleBoardPlayer1.printBattleField();
                    System.out.println("Вы попали! Продолжает стрелять " + player1.getName());

                    if (missPlayer1) {
                        System.out.println("Вы промахнулись, стреляет " + player2.getName());
                        flag = false;
                    }

                } else {
                    System.out.println("Стреляет " + player2.getName());

                    String stringW = scanner.nextLine();
                    String stringZ = scanner.nextLine();

                    int w = Integer.parseInt(stringW) - 1;
                    int z = Integer.parseInt(stringZ) - 1;
                    battleField[w][z] = BattleShip.BUSY;

                    boolean missPlayer2 = battleBoardPlayer2.printBattleField();
                    System.out.println("Вы попали! Продолжает стрелять " + player2.getName());

                    if (missPlayer2) {
                        System.out.println("Вы промахнулись, стреляет " + player1.getName());
                        flag = true;
                    }
                }
            } catch (Exception e) {
                System.err.println("Введите число от 1 до 10");
            }
        }
        System.out.println("Game over!");
    }
}
