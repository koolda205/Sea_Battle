import java.util.Scanner;

public class BattleBoard {
    private BattleShip[][] battleField;
    private Player player;

    public BattleBoard(Player player) {
        this.player = player;
        battleField = new BattleShip[10][10];
        for (int x = 0; x < battleField.length; x++) {
            for (int y = 0; y < battleField.length; y++) {
                battleField[x][y] = BattleShip.EMPTY;
            }
        }
    }

    void printBattleField() {

        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                System.out.print(battleField[j][i].getName());
            }
            System.out.println();
        }
    }

    void printEnemyBattleShip() {
        BattleShip[][] enemyBattleShip = player.getEnemyBattleShip();
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                System.out.print(battleField[j][i].getName());
            }
            System.out.println();
        }
    }

    public boolean shot(Scanner scanner) {

        System.out.println("Стреляет " + player.getName());
        printBattleField();

        System.out.println("Введите первое число от 1 до 10");
        String stringScaner = scanner.nextLine();

        System.out.println("Введите второе число от 1 до 10");
        String stringScaner2 = scanner.nextLine();

        if (stringScaner.equals("выход")) {
            Main.exitGame();
        } else if (stringScaner.equals("жизни")) {
            System.out.println("У соперника осталось: " + player.getEmountEnemyShip());
        }

        int coordinateY = 0;
        int coordinateX = 0;
        try {
            coordinateY = Integer.parseInt(stringScaner) - 1;
            if (coordinateY < 0 || coordinateY > 9) {
                System.err.println("Вы ввели не верное число");
                return true;
            }
            coordinateX = Integer.parseInt(stringScaner2) - 1;
            if (coordinateX < 0 || coordinateX > 9) {
                System.err.println("Вы ввели не верное число");
                return true;
            }
            return printBattleField(coordinateX, coordinateY);
        } catch (Exception e) {
            System.err.println("Это не число");
            return true;
        }
    }

    public boolean printBattleField(int x, int y) {
        BattleShip[][] enemyBattleShip = player.getEnemyBattleShip();

        if (enemyBattleShip[x][y] == BattleShip.BATTLE_SHIP) {
            battleField[x][y] = BattleShip.WOUND;
            enemyBattleShip[x][y] = BattleShip.WOUND;
//            for (int i = y - 1; i == y + 1; i++) {
//                for (int j = x - 1; j == x + 1; j++) {
//                    if (battleField[i][j] == null) {
//                        continue;
//                    }
//                    if (    battleField[i][j] != null ||
//                            battleField[i][j] == BattleShip.BUSY ||
//                            battleField[i][j] == BattleShip.DEAD ||
//                            battleField[i][j] == BattleShip.BATTLE_SHIP ||
//                            battleField[i][j] == BattleShip.WOUND ) {
//                        battleField[i][j] = BattleShip.DEAD;
//                    }
//                }
//            }
            battleField[y][x] = BattleShip.WOUND;

            player.setEnemyBattleShip(enemyBattleShip);
            player.setEmountEnemyShip(player.getEmountEnemyShip() - 1);
            System.out.println("Точно в цель!");
            System.out.println("У соперника осталось кораблей: " + player.getEmountEnemyShip());
            System.out.println();
            return true;
        } else if (enemyBattleShip[y][x] == BattleShip.WOUND) {
            battleField[y][x] = BattleShip.WOUND;
            printBattleField();
            System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
            System.out.println();
            return false;
        } else if (enemyBattleShip[y][x] == BattleShip.EMPTY) {
            battleField[y][x] = BattleShip.BUSY;
            enemyBattleShip[y][x] = BattleShip.BUSY;
            player.setEnemyBattleShip(enemyBattleShip);
            printBattleField();
            System.out.println("Мимо! В следующий раз обязательно повезет!");
            System.out.println();
            return false;
        }
        battleField[y][x] = BattleShip.BUSY;
        enemyBattleShip[y][x] = BattleShip.BUSY;
        player.setEnemyBattleShip(enemyBattleShip);
        printBattleField();
        System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
        System.out.println();
        return false;
    }

//    public void makeBattleShip(String stringScaner, String stringScaner2) {
//
//        int coordinateY = 0;
//        int coordinateX = 0;
//        try {
//            coordinateY = Integer.parseInt(stringScaner) - 1;
//            coordinateX = Integer.parseInt(stringScaner2) - 1;
//        } catch (Exception e) {
//            System.err.println("Введите число от 1 до 10");
//        }
//        if (coordinateY < 0 || coordinateY > 9 || coordinateX < 0 || coordinateX > 9) {
//            System.err.println("Введите число от 1 до 10");
//        }
//
//        BattleShip[][] enemyBattleShip = player.getEnemyBattleShip();
//
//        enemyBattleShip[coordinateY][coordinateX] = BattleShip.BATTLE_SHIP;
//
//        player.setEnemyBattleShip(enemyBattleShip);
//
//        player.setEnemyShip(player.getEnemyShip() + 1);
//    }
}
