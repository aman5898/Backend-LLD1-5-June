package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Game {
    private Board board;
    private List<Player> players;
    private Player winner;
    private int nextPlayerIndex;
    private List<Move> moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    private Game(Builder builder) {
        board = new Board(builder.dimension);
        players = builder.players;
        winningStrategies = builder.winningStrategies;
        winner = null;
        nextPlayerIndex = 0;
        moves = new ArrayList<>();
        gameState = GameState.IN_PROGRESS;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void diplayBoard(){
        board.display();
    }

    private boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // if input is outside boundary
        if(row<0||row>board.getSize()-1||col < 0|| col>board.getSize()-1){
            return false;
        }

        return board.getGrid().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }

    public void undo(){
        if(moves.isEmpty()){
            System.out.println("Nothing to Undo");
            return;
        }

        Move lastMove = moves.get(moves.size()-1);
        moves.remove(moves.size()-1);

        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setSymbol(null);

        nextPlayerIndex--;
        // (a-b) % n = (a-b+n)%n;

        nextPlayerIndex = (nextPlayerIndex+ players.size()) % players.size();

        for(WinningStrategy strategy:winningStrategies){
            strategy.handleUndo(board,lastMove);
        }

        setGameState(GameState.IN_PROGRESS);
        setWinner(null);
    }

    public boolean checkWinner(Move move){
        for(WinningStrategy strategy:winningStrategies){
            if(strategy.checkWinner(board,move)){
                return true;
            }
        }
        return false;
    }

    public void makeMove(){
        Player currentPlayer = players.get(nextPlayerIndex);

        System.out.println("It's "+currentPlayer.getName()+"'s turn! Please make the move");

        Move move = currentPlayer.makeMove(board);

        if(!validateMove(move)){
            System.out.println("Not a Valid Move");
            return;
        }

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange = board.getGrid().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(currentPlayer.getSymbol());
        move.setPlayer(currentPlayer);

        move.setCell(cellToChange);

        moves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

//         we need to confirm if there is a change in game state
        if(checkWinner(move)){
            setWinner(currentPlayer);
            setGameState(GameState.SUCCESS);
        }else if (moves.size() == board.getSize()*board.getSize()){ // will not work if some cells are not allowed to be played in the start
            setWinner(null);
            setGameState(GameState.DRAW);
        }

    }



    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void validate(){
//            1. Check Player Count
            if(players.size()!=dimension-1){
                throw new RuntimeException("Invalid players count");
            }

            // We Want to have only one bot in the Game
            int botCount = 0;
            for(Player player:players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }

            if(botCount>1){
                throw new RuntimeException("More than one bot is not allowed!");
            }

//            3. Every Player should have a seperate Symbol
            Set<Character> symbolSet = new java.util.HashSet<>();

            for(Player player:players){
                if(symbolSet.contains(player.getSymbol().getSym())){
                    throw new RuntimeException("Multiple players have the same Symbol");
                }
                symbolSet.add(player.getSymbol().getSym());
            }
        }

        public Game build(){
            // Validation
            validate();
            return new Game(this);
        }


    }
}
