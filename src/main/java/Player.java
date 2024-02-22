import java.util.Arrays;
import java.util.Objects;

public class Player {
    private BattleShip[][] battleShip;
    private String name;
    private int enemyShip;

    public Player(BattleShip[][] battleShip, String name) {
        this.battleShip = battleShip;
        this.name = name;
        this.enemyShip = 10;
    }

    public BattleShip[][] getBattleShip() {
        return battleShip;
    }

    public void setBattleShip(BattleShip[][] battleShip) {
        this.battleShip = battleShip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnemyShip() {
        return enemyShip;
    }

    public void setEnemyShip(int enemyShip) {
        this.enemyShip = enemyShip;
    }

    public void printPlayerBattleShip() {
        for (int i = 0; i < battleShip.length; i++) {
            for (int j = 0; j < battleShip.length; j++) {
                System.out.print(battleShip[i][j].getName());
            }
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return enemyShip == player.enemyShip && Arrays.equals(battleShip, player.battleShip) && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, enemyShip);
        result = 31 * result + Arrays.hashCode(battleShip);
        return result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "battleShip=" + Arrays.toString(battleShip) +
                ", name='" + name + '\'' +
                ", enemyShip" + enemyShip +
                '}';
    }
}
