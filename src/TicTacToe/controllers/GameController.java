package TicTacToe.controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ) {
        return Game.getBuilder().
                setDimension(dimension).
                setPlayers(players).
                setWinningStrategies(winningStrategies).
                build();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void display(Game game){
            game.diplayBoard();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void Undo(){

    }


}


// 1. Start the Game : Create, set the attributes, taking the input : Validate
// while the gameState IN_PROGRESS
// 2. Display the board
// 3. Make the move : input, make the move, update the state, https://github.com/aman5898/Backend-LLD1-5-June

    // 4. Check the state
            // if gameState is SUCCESS
    // 5. Get the winner and display
            // else if gameState is DRAW
    // 6. Declare the draw
