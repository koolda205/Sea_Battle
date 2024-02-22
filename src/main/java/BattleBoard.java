import java.util.Arrays;
import java.util.Objects;

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

//    public void getPlayerBattleField() {
//
//        for (int x = 0; x < battleField.length; x++) {
//            for (int y = 0; y < battleField.length; y++) {
//                battleField[x][y] = BattleShip.EMPTY;
//            }
//        }
//    }

    public boolean printBattleField(int y, int x) {
        BattleShip[][] playerBattleShip = player.getBattleShip();

        printBattleField();

        if (playerBattleShip[y][x] == BattleShip.BATTLE_SHIP) {
            battleField[y][x] = BattleShip.WOUND;
            playerBattleShip[y][x] = BattleShip.WOUND;
            player.setBattleShip(playerBattleShip);
            player.setEnemyShip(player.getEnemyShip() - 1);

            printBattleField();

            System.out.println("Точно в цель!");
            System.out.println("У соперника осталось кораблей: " + player.getEnemyShip());
            System.out.println();
            return true;
        } else if (playerBattleShip[y][x] == BattleShip.WOUND) {
            battleField[y][x] = BattleShip.WOUND;

            printBattleField();

            System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
            System.out.println();
            return false;
        } else if (playerBattleShip[y][x] == BattleShip.EMPTY) {
            battleField[y][x] = BattleShip.BUSY;
            playerBattleShip[y][x] = BattleShip.BUSY;
            player.setBattleShip(playerBattleShip);

            printBattleField();

            System.out.println("Мимо! В следующий раз обязательно повезет!");
            System.out.println();
            return false;
        }
        battleField[y][x] = BattleShip.BUSY;
        playerBattleShip[y][x] = BattleShip.BUSY;
        player.setBattleShip(playerBattleShip);

        printBattleField();

        System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
        System.out.println();
        return false;
    }

    private void printBattleField() {

        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                System.out.print(battleField[j][i].getName());
            }
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BattleBoard that = (BattleBoard) o;
        return Arrays.equals(battleField, that.battleField) && Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(player);
        result = 31 * result + Arrays.hashCode(battleField);
        return result;
    }
}
