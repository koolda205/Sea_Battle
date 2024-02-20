import java.util.Scanner;

/**
 *
 */

public class Main {
    public static void main(String[] args) {

//        BattleShip[][] bS = {
//                {BattleShip.ONE_WHITE,     BattleShip.ONE_WHITE,     BattleShip.THREE_BLACK,     BattleShip.FOUR_WHITE,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.TWO_BLACK, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.FOUR_BLACK,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.THREE_BLACK,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.TWO_WHITE,     BattleShip.THREE_WHITE,     BattleShip.EMPTY,     BattleShip.EMPTY,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.FOUR_WHITE, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.TWO_WHITE,     BattleShip.THREE_WHITE,     BattleShip.EMPTY,     BattleShip.EMPTY,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.FOUR_WHITE, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.TWO_WHITE,     BattleShip.THREE_WHITE,     BattleShip.EMPTY,     BattleShip.EMPTY,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.BUSY,     BattleShip.FOUR_WHITE, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.TWO_WHITE,     BattleShip.THREE_WHITE,     BattleShip.EMPTY,     BattleShip.EMPTY,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.FOUR_WHITE, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.TWO_WHITE,     BattleShip.THREE_WHITE,     BattleShip.EMPTY,     BattleShip.EMPTY,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.FOUR_WHITE, BattleShip.EMPTY, BattleShip.WOUND},
//
//                {BattleShip.TWO_WHITE,     BattleShip.THREE_WHITE,     BattleShip.EMPTY,     BattleShip.EMPTY,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.FOUR_WHITE, BattleShip.EMPTY, BattleShip.EMPTY},
//
//                {BattleShip.ONE_WHITE,     BattleShip.ONE_WHITE,     BattleShip.THREE_BLACK,     BattleShip.FOUR_WHITE,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.TWO_BLACK, BattleShip.EMPTY, BattleShip.DEAD},
//
//                {BattleShip.FOUR_BLACK,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.THREE_BLACK,
//                        BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY,     BattleShip.EMPTY, BattleShip.EMPTY, BattleShip.EMPTY}
//        };

//        BattleBoard battleBoard = new BattleBoard(bS);
//        battleBoard.print();

//        BattleShip[][] battleShip = new  BattleShip [10][10];
//        for (int i = 0; i < battleShip.length; i++) {
//            for (int j = 0; j < battleShip.length; j++) {
//                battleShip[i][j] =  BattleShip.EMPTY;
//            }
//        }
//        BattleBoard battleBoard2 = new BattleBoard(battleShip);
//        battleBoard2.print();


        BattleShip[][] battleShips = new  BattleShip [10][10];
        for (int i = 0; i < battleShips.length; i++) {
            for (int j = 0; j < battleShips.length; j++) {
                battleShips[i][j] =  BattleShip.EMPTY;
            }
        }
        BattleBoard battleBoard2 = new BattleBoard(battleShips);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String stringX = scanner.nextLine();
            String stringY = scanner.nextLine();

            if (stringX.equalsIgnoreCase("stop") ||
                    stringY.equalsIgnoreCase("stop") ||
                    stringX.equalsIgnoreCase("стоп") ||
                    stringY.equalsIgnoreCase("стоп")) {
                break;
            }

            try {
                int x = Integer.parseInt(stringX) - 1;
                int y = Integer.parseInt(stringY) - 1;

                battleShips[y][x] = BattleShip.ONE_WHITE;
                battleBoard2.print();

            } catch (Exception e) {
                System.err.println("Введите число");
            }
        }
    }
}
