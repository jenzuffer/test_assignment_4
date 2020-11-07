package servicelayer;

import dto.TicTacToeField;
import dto.TicTacToePlayer;

public interface TicTacToeService {
    public void StartTicTacToeGame(TicTacToePlayer dtoPlayer);
    public TicTacToePlayer CreateTicTacToePlayer(boolean is_circle);
    public TicTacToeField CreateTicTacToeField(TicTacToePlayer dtoPlayer);
}
