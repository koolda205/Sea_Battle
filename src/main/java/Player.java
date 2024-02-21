import java.util.Arrays;

public class Player {
    private BattleShip[][] battleField;

    private BattleShip[][] battleShip;

    private String name;

    private int live;

    public Player(BattleShip[][] battleField, BattleShip[][] battleShip, String name, int live) {
        this.battleField = battleField;
        this.battleShip = battleShip;
        this.name = name;
        this.live = live;
    }

        public void print(int x, int y) {
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                System.out.print(battleField[i][j].getName());
            }
            System.out.println();
        }
    }

//    public void myDesk (){
//        BattleShip[][] battleShips = new  BattleShip [10][10];
//        for (int i = 0; i < battleShips.length; i++) {
//            for (int j = 0; j < battleShips.length; j++) {
//                System.out.print(battleShips[i][j] =  BattleShip.EMPTY);
//                System.out.print(battleShips[1][1] =  BattleShip.BATTLE_SHIP);
//                System.out.print(battleShips[10][10] =  BattleShip.BATTLE_SHIP);
//                System.out.print(battleShips[4][4] =  BattleShip.BATTLE_SHIP);
//                System.out.print(battleShips[5][4] =  BattleShip.BATTLE_SHIP);
//                System.out.print(battleShips[6][4] =  BattleShip.BATTLE_SHIP);
//                System.out.print(battleShips[7][4] =  BattleShip.BATTLE_SHIP);
//            }
//        }
//        print();
//    }

//    public void print() {
//        for (int i = 0; i < battleShip.length; i++) {
//            for (int j = 0; j < battleShip.length; j++) {
//                System.out.print(battleShip[i][j].getName());
//            }
//            System.out.println();
//        }
//    }

//    public void printShout(int x, int y) {
//        print();
//        System.out.print(battleShip[x][x].getName());
//
//    }

    @Override
    public String toString() {
        return "ChessBoard{" +
                "chessPieces=" + Arrays.toString(battleField) +
                '}';
    }
}
