package main;

import dto.TicTacToePlayer;
import servicelayer.TicTacToeService;
import servicelayer.TicTacToeServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        TicTacToeService srvcImpl = new TicTacToeServiceImpl();
        TicTacToePlayer ticTacToePlayer = srvcImpl.CreateTicTacToePlayer();
        srvcImpl.StartTicTacToeGame(ticTacToePlayer);

    }
}
