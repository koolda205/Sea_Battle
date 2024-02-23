public class Player {
    private BattleShip[][] enemyBattleShip;
    private String name;
    private int emountEnemyShip;

    public Player(BattleShip[][] enemyBattleShip, String name) {
        this.enemyBattleShip = enemyBattleShip;
        this.name = name;
        this.emountEnemyShip = 1;
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

    public int getEmountEnemyShip() {
        return emountEnemyShip;
    }

    public void setEmountEnemyShip(int emountEnemyShip) {
        this.emountEnemyShip = emountEnemyShip;
    }


}
