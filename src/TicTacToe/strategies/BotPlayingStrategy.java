package TicTacToe.strategies;

import Factory.Platform;
import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, Player player);
}
