package TicTacToe.models;

public abstract class Player {
    private int id;
    private String name;
    private final PlayerType playerType;
    private Symbol symbol;

    public Player(int id, String name, PlayerType playerType, Symbol symbol){
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

//    public void setPlayerType(PlayerType playerType) {
//        this.playerType = playerType;
//    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
