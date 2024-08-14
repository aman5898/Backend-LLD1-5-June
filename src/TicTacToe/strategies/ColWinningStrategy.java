package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy{
    HashMap<Integer, HashMap<Character, Integer>> counts = new HashMap<>();

    // for row and column winning strategy, we don't need the board only dimensiton, but keeping it
    // in interface since you can have any kind of winning strategy.
    public boolean checkWinner(Board board, Move move) {
//        0 -> {'X':count} {'Y' count} {'Z' -> 3}
//        1 - > {'X':count}


//        2, 0 -> U

        int col = move.getCell().getCol();
        Character sym = move.getCell().getSymbol().getSym();

        if(!counts.containsKey(col)){
            counts.put(col,new HashMap<>());
        }

        HashMap<Character,Integer> countRow = counts.get(col);

        if(!countRow.containsKey(sym)){
            countRow.put(sym,0);
        }

        countRow.put(sym,countRow.get(sym)+1);

        if(countRow.get(sym) == board.getSize()){
            return true;
        }

        return false;
    }
}
