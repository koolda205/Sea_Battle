public class Player {
    private BattleShip[][] enemyBattleShip;
    private String name;
    private int enemyShip;

    public Player(BattleShip[][] enemyBattleShip, String name) {
        this.enemyBattleShip = enemyBattleShip;
        this.name = name;
        this.enemyShip = 2;
    }

    public BattleShip[][] getEnemyBattleShip() {
        return enemyBattleShip;
    }

    public void setEnemyBattleShip(BattleShip[][] enemyBattleShip) {
        this.enemyBattleShip = enemyBattleShip;
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
