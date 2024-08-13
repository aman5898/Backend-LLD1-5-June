package TicTacToe.controllers;

import TicTacToe.models.*;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;
import java.util.Scanner;

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
        int index = game.getNextPlayerIndex();
        Player currenPlayer = game.getPlayers().get(index);
        game.setNextPlayerIndex(index+1);
        int attempts = 0;
        int n = game.getBoard().getSize();
        while (attempts < n*n) {
            attempts += 1;
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Cell targetCell = game.getBoard().getCell(x, y);
            if (targetCell.getCellState() == CellState.EMPTY){
                Move move = new Move(new Cell(x, y), currenPlayer);
                targetCell.setCellState(CellState.FILLED);
                targetCell.setSymbol(currenPlayer.getSymbol());
                game.getMoves().add(move);
//          check if the player has win or not
                for (WinningStrategy ws: game.getWinningStrategies()){
                    if (ws.checkWinner(game)){
                        break;
                    }
                }
//          at the end of successful move break the loop for asking input
                break;
            }
            else {
                System.out.println("Selected incorrect Cell location, Try again");
                display(game);
            }
        }


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
