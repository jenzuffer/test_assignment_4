package servicelayer;

import dto.TicTacToeField;
import dto.TicTacToePlayer;

public interface TicTacToeService {
    public String StartTicTacToeGame(TicTacToePlayer dtoPlayer);
    public TicTacToeField getField();
}
