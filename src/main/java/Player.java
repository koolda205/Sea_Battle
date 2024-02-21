import java.util.Arrays;
import java.util.Objects;

public class Player {
    private BattleShip[][] battleShip;
    private String name;
    private int live;

    public Player(BattleShip[][] battleShip, String name, int live) {
        this.battleShip = battleShip;
        this.name = name;
        this.live = live;
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

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
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
        return live == player.live && Arrays.equals(battleShip, player.battleShip) && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, live);
        result = 31 * result + Arrays.hashCode(battleShip);
        return result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "battleShip=" + Arrays.toString(battleShip) +
                ", name='" + name + '\'' +
                ", live=" + live +
                '}';
    }
}
