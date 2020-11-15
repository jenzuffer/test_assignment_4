package main;

import dto.TicTacToePlayer;
import servicelayer.TicTacToeService;
import servicelayer.TicTacToeServiceImpl;

import java.sql.SQLException;

public class Main {
    public static TicTacToePlayer CreateTicTacToePlayer(boolean is_circle) {
        return new TicTacToePlayer(is_circle);
    }
    public static void main(String[] args) throws SQLException {
        TicTacToePlayer ticTacToePlayer = CreateTicTacToePlayer(true);
        TicTacToeService srvcImpl = new TicTacToeServiceImpl(ticTacToePlayer);

        srvcImpl.StartTicTacToeGame(ticTacToePlayer);

    }
}
