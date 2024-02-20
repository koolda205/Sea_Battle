import java.util.Arrays;

public class BattleBoard {
    private BattleShip[][] battleShip;

    public BattleBoard(BattleShip[][] battleShip) {
        this.battleShip = battleShip;
    }

    public void print() {
        for (int i = 0; i < battleShip.length; i++) {
            for (int j = 0; j < battleShip.length; j++) {
                System.out.print(battleShip[i][j].getName());
            }
            System.out.println();
        }
    }

    public void printShout(int x, int y) {
        print();
        System.out.print(battleShip[x][x].getName());

    }

    @Override
    public String toString() {
        return "ChessBoard{" +
                "chessPieces=" + Arrays.toString(battleShip) +
                '}';
    }
}
