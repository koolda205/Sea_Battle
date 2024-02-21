import java.util.Arrays;
import java.util.Objects;

public class BattleBoard {
    private BattleShip[][] battleField;
    private Player player;

    public BattleBoard(BattleShip[][] battleField, Player player) {
        this.battleField = battleField;
        this.player = player;
    }

    public boolean printBattleField(int y, int x) {
        BattleShip[][] playerBattleShip = player.getBattleShip();

        if (y == 11 && x == 11) {
            for (int i = 0; i < battleField.length; i++) {
                for (int j = 0; j < battleField.length; j++) {
                    System.out.print(battleField[j][i].getName());
                }
                System.out.println();
            }
            return false;
        }

        if (playerBattleShip[y][x] == BattleShip.BATTLE_SHIP) {
            battleField[y][x] = BattleShip.WOUND;
            playerBattleShip[y][x] = BattleShip.WOUND;
            player.setBattleShip(playerBattleShip);
            player.setEnemyShip(player.getEnemyShip() - 1);

            for (int i = 0; i < battleField.length; i++) {
                for (int j = 0; j < battleField.length; j++) {
                    System.out.print(battleField[j][i].getName());
                }
                System.out.println();
            }
            System.out.println("Точно в цель!");
            System.out.println("У соперника осталось кораблей: " + player.getEnemyShip());
            System.out.println();
            return true;
        } else if (playerBattleShip[y][x] == BattleShip.WOUND) {
            battleField[y][x] = BattleShip.WOUND;

            for (int i = 0; i < battleField.length; i++) {
                for (int j = 0; j < battleField.length; j++) {
                    System.out.print(battleField[j][i].getName());
                }
                System.out.println();
            }
            System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
            System.out.println();
            return false;
        } else if (playerBattleShip[y][x] == BattleShip.EMPTY) {
            battleField[y][x] = BattleShip.BUSY;
            playerBattleShip[y][x] = BattleShip.BUSY;
            player.setBattleShip(playerBattleShip);

            for (int i = 0; i < battleField.length; i++) {
                for (int j = 0; j < battleField.length; j++) {
                    System.out.print(battleField[j][i].getName());
                }
                System.out.println();
            }
            System.out.println("Мимо! В следующий раз обязательно повезет!");
            System.out.println();
            return false;
        }
        battleField[y][x] = BattleShip.BUSY;
        playerBattleShip[y][x] = BattleShip.BUSY;
        player.setBattleShip(playerBattleShip);

        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                System.out.print(battleField[j][i].getName());
            }
            System.out.println();
        }
        System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
        System.out.println();
        return false;
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
