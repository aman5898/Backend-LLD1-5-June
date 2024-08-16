package TicTacToe.models;

import TicTacToe.strategies.BotPlayingStrategy;
import TicTacToe.strategies.BotPlayingStrategyFactory;

public class BotPlayer extends Player{
    private BotDifficultyLevel difficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(int id, String name, Symbol symbol, BotDifficultyLevel difficultyLevel){
        super(id, name, PlayerType.BOT, symbol);
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public Move makeMove(Board board){
        return botPlayingStrategy.makeMove(board, this);
    }

}
