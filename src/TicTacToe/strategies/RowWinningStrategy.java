package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    // Every Game will have a seperate instance of  this RowWinningStrategy so, if keep the member hashmap
//    static, it will go wrong.
    HashMap<Integer, HashMap<Character, Integer>> counts = new HashMap<>();

    // for row and column winning strategy, we don't need the board only dimension, but keeping it
    // in interface since you can have any kind of winning strategy.
    public boolean checkWinner(Board board, Move move) {
//        0 -> {'X':count} {'Y' count} {'Z' -> 3}
//        1 - > {'X':count}


//        2, 0 -> U

            int row = move.getCell().getRow();
            Character sym = move.getCell().getSymbol().getSym();

            if(!counts.containsKey(row)){
                counts.put(row,new HashMap<>());
            }

            HashMap<Character,Integer> countRow = counts.get(row);

            if(!countRow.containsKey(sym)){
                countRow.put(sym,0);
            }

            countRow.put(sym,countRow.get(sym)+1);

            if(countRow.get(sym) == board.getSize()){
                return true;
            }

            return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        Character sym = move.getPlayer().getSymbol().getSym();

        counts.get(row).put(sym,counts.get(row).get(sym)-1);
    }
}

// 10:20 - 10:32pm; -> Break
