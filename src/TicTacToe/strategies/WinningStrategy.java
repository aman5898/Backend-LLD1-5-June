package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Game;
import TicTacToe.models.Move;

import java.util.List;

public interface WinningStrategy {

    public boolean checkWinner(Game game);
}
