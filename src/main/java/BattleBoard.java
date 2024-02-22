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


    public boolean printBattleField(int y, int x) {
        BattleShip[][] playerBattleShip = player.getBattleShip();

        if (playerBattleShip[y][x] == BattleShip.BATTLE_SHIP) {
            battleField[y][x] = BattleShip.WOUND;
            playerBattleShip[y][x] = BattleShip.WOUND;
            player.setBattleShip(playerBattleShip);
            player.setEnemyShip(player.getEnemyShip() - 1);
            System.out.println("Точно в цель!");
            System.out.println("У соперника осталось кораблей: " + player.getEnemyShip());
            System.out.println();
            return true;
        } else if (playerBattleShip[y][x] == BattleShip.WOUND) {
            battleField[y][x] = BattleShip.WOUND;
            System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
            System.out.println();
            return false;
        } else if (playerBattleShip[y][x] == BattleShip.EMPTY) {
            battleField[y][x] = BattleShip.BUSY;
            playerBattleShip[y][x] = BattleShip.BUSY;
            player.setBattleShip(playerBattleShip);
            System.out.println("Мимо! В следующий раз обязательно повезет!");
            System.out.println();
            return false;
        }
        battleField[y][x] = BattleShip.BUSY;
        playerBattleShip[y][x] = BattleShip.BUSY;
        player.setBattleShip(playerBattleShip);

        System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
        System.out.println();
        return false;
    }

    void printBattleField() {

        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                System.out.print(battleField[j][i].getName());
            }
            System.out.println();
        }
    }
}
