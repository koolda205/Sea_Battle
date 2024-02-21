import java.util.Scanner;

/**
 *
 */

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

//        battleField[6 - 1][10 - 1] = BattleShip.BUSY;
//        battleBoardPlayer1.printBattleField();
//        battleBoardPlayer1.printPlayerBattleShip();
        battleBoardPlayer2.printPlayerBattleShip();

//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//
//            String stringY = scanner.nextLine();
//            String stringX = scanner.nextLine();
//
//            if (stringX.equalsIgnoreCase("stop") ||
//                    stringY.equalsIgnoreCase("stop") ||
//                    stringX.equalsIgnoreCase("стоп") ||
//                    stringY.equalsIgnoreCase("стоп")) {
//                break;
//            }
//
//            try {
//                int x = Integer.parseInt(stringX) - 1;
//                int y = Integer.parseInt(stringY) - 1;
//
//                battleField[x][y] = BattleFieldP1.BUSY;
//                dk.print(x, y);
//
//            } catch (Exception e) {
//                System.err.println("Введите число");
//            }
//        }
    }
}
