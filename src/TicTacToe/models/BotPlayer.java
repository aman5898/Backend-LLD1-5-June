package TicTacToe.models;

public class BotPlayer extends Player{
    private BotDifficultyLevel difficultyLevel;

    public BotPlayer(int id, String name, Symbol symbol, BotDifficultyLevel difficultyLevel){
        super(id, name, PlayerType.BOT, symbol);
        this.difficultyLevel = difficultyLevel;
    }
}
