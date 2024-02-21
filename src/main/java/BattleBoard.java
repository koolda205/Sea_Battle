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

        if (playerBattleShip[y][x] == BattleShip.BATTLE_SHIP) {
            battleField[y][x] = BattleShip.WOUND;
            playerBattleShip[y][x] = BattleShip.WOUND;
            player.setBattleShip(playerBattleShip);
            System.out.println("Точно в цель!");
            for (int i = 0; i < battleField.length; i++) {
                for (int j = 0; j < battleField.length; j++) {
                    System.out.print(battleField[j][i].getName());
                }
                System.out.println();
            }
            return true;
        } else if (playerBattleShip[y][x] == BattleShip.WOUND) {
            battleField[y][x] = BattleShip.WOUND;
            System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
            for (int i = 0; i < battleField.length; i++) {
                for (int j = 0; j < battleField.length; j++) {
                    System.out.print(battleField[j][i].getName());
                }
                System.out.println();
            }
            return false;
        } else if (playerBattleShip[y][x] == BattleShip.EMPTY) {
            battleField[y][x] = BattleShip.BUSY;
            playerBattleShip[y][x] = BattleShip.BUSY;
            player.setBattleShip(playerBattleShip);
            System.out.println("Мимо! В следующий раз обязательно повезет!");
            for (int i = 0; i < battleField.length; i++) {
                for (int j = 0; j < battleField.length; j++) {
                    System.out.print(battleField[j][i].getName());
                }
                System.out.println();
            }
            return false;
        }
        battleField[y][x] = BattleShip.BUSY;
        playerBattleShip[y][x] = BattleShip.BUSY;
        player.setBattleShip(playerBattleShip);
        System.out.println("Метьтесь лучше, вы сюда уже стреляли!");
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                System.out.print(battleField[j][i].getName());
            }
            System.out.println();
        }
        return false;
    }


//    public void printPlayerBattleShip() {
//        BattleShip[][] playerBattleShip = player.getBattleShip();
//        for (int i = 0; i < playerBattleShip.length; i++) {
//            for (int j = 0; j < playerBattleShip.length; j++) {
//                System.out.print(playerBattleShip[i][j].getName());
//            }
//            System.out.println();
//        }
//    }

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
