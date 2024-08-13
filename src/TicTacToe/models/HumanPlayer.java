package TicTacToe.models;

public class HumanPlayer extends Player{
    public HumanPlayer(int id,  String name , Symbol symbol){
        super(id, name, PlayerType.HUMAN, symbol);
    }
}
