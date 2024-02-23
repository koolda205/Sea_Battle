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
    public boolean playerShoots (String stringScaner, String stringScaner2) {


        int coordinateY = 0;
        int coordinateX = 0;
            try {
                coordinateY = Integer.parseInt(stringScaner) - 1;
                coordinateX = Integer.parseInt(stringScaner2) - 1;
            } catch (Exception e) {
                System.err.println("Введите число от 1 до 10");
                return true;
            }
            if (coordinateY < 0 || coordinateY > 9 || coordinateX < 0 || coordinateX > 9){
                System.err.println("Введите число от 1 до 10");
                return true;
            }
        return printBattleField(coordinateX, coordinateY);
    }


    public boolean printBattleField(int x, int y) {
        BattleShip[][] enemyBattleShip = player.getEnemyBattleShip();

        if (enemyBattleShip[y][x] == BattleShip.BATTLE_SHIP) {
            battleField[y][x] = BattleShip.WOUND;
            enemyBattleShip[y][x] = BattleShip.WOUND;
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
            player.setEnemyShip(player.getEnemyShip() - 1);
            System.out.println("Точно в цель!");
            System.out.println("У соперника осталось кораблей: " + player.getEnemyShip());
            System.out.println();
            return true;
        } else if (enemyBattleShip[y][x] == BattleShip.WOUND) {
            battleField[y][x] = BattleShip.WOUND;
            System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
            System.out.println();
            return false;
        } else if (enemyBattleShip[y][x] == BattleShip.EMPTY) {
            battleField[y][x] = BattleShip.BUSY;
            enemyBattleShip[y][x] = BattleShip.BUSY;
            player.setEnemyBattleShip(enemyBattleShip);
            System.out.println("Мимо! В следующий раз обязательно повезет!");
            System.out.println();
            return false;
        }
        battleField[y][x] = BattleShip.BUSY;
        enemyBattleShip[y][x] = BattleShip.BUSY;
        player.setEnemyBattleShip(enemyBattleShip);

        System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
        System.out.println();
        return false;
    }

    public void makeBattleShip (String stringScaner, String stringScaner2) {

            int coordinateY = 0;
            int coordinateX = 0;
            try {
                coordinateY = Integer.parseInt(stringScaner) - 1;
                coordinateX = Integer.parseInt(stringScaner2) - 1;
            } catch (Exception e) {
                System.err.println("Введите число от 1 до 10");
            }
            if (coordinateY < 0 || coordinateY > 9 || coordinateX < 0 || coordinateX > 9){
                System.err.println("Введите число от 1 до 10");
            }

            BattleShip[][] enemyBattleShip = player.getEnemyBattleShip();

            enemyBattleShip[coordinateY][coordinateX] = BattleShip.BATTLE_SHIP;

            player.setEnemyBattleShip(enemyBattleShip);

            player.setEnemyShip(player.getEnemyShip() + 1);
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
}
