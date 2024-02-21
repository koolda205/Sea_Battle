import java.util.Arrays;
import java.util.Objects;

public class BattleBoard {
    private BattleShip[][] battleField;
    private Player player;

    public BattleBoard(BattleShip[][] battleField, Player player) {
        this.battleField = battleField;
        this.player = player;

    }

    public boolean printBattleField() {

        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                System.out.print(battleField[j][i].getName());
            }
            System.out.println();
        }
        return false;
    }

    public void printPlayerBattleShip() {
        BattleShip[][] playerBattleShip = player.getBattleShip();
        for (int i = 0; i < playerBattleShip.length; i++) {
            for (int j = 0; j < playerBattleShip.length; j++) {
                System.out.print(playerBattleShip[i][j].getName());
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
