package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.RowWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gc = new GameController();

        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer(1,"Aman", PlayerType.HUMAN,new Symbol('0')));
        players.add(new BotPlayer(2,"Bot",PlayerType.BOT,new Symbol('X'),BotDifficultyLevel.EASY));

        Game g = gc.startGame(3,players,List.of(new RowWinningStrategy()));

//        Game g2 = gc.startGame();
        gc.makeMove(g);


    }
}


// 1. Create your Models
// 2. Get ready your controller and basic interaction with the client
