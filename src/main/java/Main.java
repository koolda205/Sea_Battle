import java.util.Scanner;

/**
 *
 */

public class Main {
    public static void main(String[] args) {

        BattleShip[][] battleField = new  BattleShip [10][10];
        for (int x = 0; x < battleField.length; x++) {
            for (int y = 0; y < battleField.length; y++) {
                battleField[y][x] =  BattleShip.EMPTY;
            }
        }
        BattleShip[][] battleShip = new  BattleShip [10][10];


        Player dk = new Player(battleField, battleShip, "DK", 20);

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

                battleField[y][x] = BattleShip.BUSY;
                dk.print();

            } catch (Exception e) {
                System.err.println("Введите число");
            }
        }
    }
}
