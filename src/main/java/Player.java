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

}
