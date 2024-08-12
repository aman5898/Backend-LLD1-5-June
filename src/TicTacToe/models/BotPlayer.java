package TicTacToe.models;

public class BotPlayer extends Player{
    private BotDifficultyLevel difficultyLevel;

    public BotPlayer(int id, String name, PlayerType playerType, Symbol symbol, BotDifficultyLevel difficultyLevel){
        super(id, name, playerType, symbol);
        this.difficultyLevel = difficultyLevel;
    }
}
