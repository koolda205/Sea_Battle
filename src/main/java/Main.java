import java.util.Scanner;

/**
 *
 */

public class Main {
    public static void main(String[] args) {

        BattleShip[][] battleFieldP1 = new  BattleShip [10][10];
        for (int x = 0; x < battleFieldP1.length; x++) {
            for (int y = 0; y < battleFieldP1.length; y++) {
                battleFieldP1[x][y] =  BattleShip.EMPTY;
            }
        }
        BattleShip[][] battleShipP1 = {
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



        Player dk = new Player(battleFieldP1, battleShipP1, "DK", 20);

//        battleShipP1[7-1][1-1] = BattleShip.BUSY;
//        dk.printBattleShip();

        battleFieldP1[5-1][10-1] = BattleShip.BUSY;
        dk.printBattleField();

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
