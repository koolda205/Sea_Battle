import java.util.Scanner;

/**
 *
 */

public class Main {
    public static void main(String[] args) {

        BattleShip[][] battleShips = new  BattleShip [10][10];
        for (int i = 0; i < battleShips.length; i++) {
            for (int j = 0; j < battleShips.length; j++) {
                battleShips[i][j] =  BattleShip.EMPTY;
            }
        }
        BattleBoard battleBoard = new BattleBoard(battleShips);

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

                battleShips[y][x] = BattleShip.FOUR_DECK;
                battleBoard.print();

            } catch (Exception e) {
                System.err.println("Введите число");
            }
        }
    }
}
