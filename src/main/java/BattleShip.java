public enum BattleShip {
    ONE_BLACK(1, "\uD83D\uDEF6"),
    ONE_WHITE(1, "\uD83D\uDEA1"),
    TWO_BLACK(2, "\uD83D\uDE9F"),
    TWO_WHITE(2, "⛵"),
    THREE_BLACK (3, "\uD83D\uDEA0"),
    THREE_WHITE (3, "\uD83D\uDEE5\uFE0F"),
    FOUR_BLACK(4, "⛴\uFE0F"),
    FOUR_WHITE(4, "\uD83D\uDEA2"),
    EMPTY(0, "\uD83D\uDDFA\uFE0F"),
    BUSY(0, "\uD83D\uDED1"),
    WOUND(-1, "♨\uFE0F"),
    DEAD(-100, "\uD83D\uDD07");


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
        return "ChessPiece{" +
                "chessValue=" + shipValue +
                ", name='" + name + '\'' +
                '}';
    }
}
