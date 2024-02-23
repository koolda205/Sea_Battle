public enum BattleShip {

    BATTLE_SHIP(1, "\uD83D\uDEA2"),
    EMPTY(0, "\uD83D\uDDFA\uFE0F"),
    BUSY(0, "\uD83D\uDED1"),
    WOUND(-1, "♨\uFE0F"),
    DEAD(-1, "\uD83D\uDD07");


    private double shipValue;
    private String name;

    BattleShip(double shipValue, String name) {
        this.shipValue = shipValue;

        this.name = name;
    }

    public double getShipValue() {
        return shipValue;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
