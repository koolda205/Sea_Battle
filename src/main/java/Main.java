import java.util.Scanner;

/**
 *
 */

public class Main {
    public static void main(String[] args) {

        BattleShip[][] battleShips = new  BattleShip [10][10];
        for (int x = 0; x < battleShips.length; x++) {
            for (int y = 0; y < battleShips.length; y++) {
                battleShips[y][x] =  BattleShip.EMPTY;
            }
        }
        Player dk = new Player(battleShips, "DK", 20);

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

                battleShips[y][x] = BattleShip.BUSY;
                dk.print();

            } catch (Exception e) {
                System.err.println("Введите число");
            }
        }
    }
}
