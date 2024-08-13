package TicTacToe.strategies;

import TicTacToe.models.*;

import java.util.List;

public class RowWinningStrategy implements WinningStrategy {
//    Board board;
//    List<Move> moves;
//
////    public RowWinningStrategy(Board board, List<Move> moves){
////        this.board = board;
////        this.moves = moves;
////    }
//
//    public void setBoard(Board board) {
//        this.board = board;
//    }
//
//    public void setMoves(List<Move> moves) {
//        this.moves = moves;
//    }

    public boolean checkWinner(Game game) {
        Board board = game.getBoard();
        List<Move> moves = game.getMoves();
        System.out.println("Checking for row win");
        Move lastMove = moves.getLast();
        Player currentPlayer = lastMove.getPlayer();
        Cell lastPopulatedCell = lastMove.getCell();
        int row_id = lastPopulatedCell.getRow();
        int col_id = lastPopulatedCell.getCol();
        for (int col = 0; col < board.getSize(); col += 1) {
            if (board.getCell(row_id, col).getSymbol() != currentPlayer.getSymbol()) {
//                How to know if the for loop was complete successfully
                System.out.println("Player " + currentPlayer.getName() + " didnt win this attempt");
                return false;
            }
            else
                continue;
        }
        game.setWinner(currentPlayer);
        game.setGameState(GameState.SUCCESS);
        return true;

    }

}