package servicelayer;

import dto.TicTacToeField;
import dto.TicTacToePlayer;

public class TicTacToeServiceImpl implements TicTacToeService{


    public TicTacToeServiceImpl(){ }

    public void StartTicTacToeGame(TicTacToePlayer dtoPlayer) {
        TicTacToeField field = new TicTacToeField(dtoPlayer);
        field.startGame();
        System.out.println("StartTicTacToeGame reached");
    }

    public TicTacToePlayer CreateTicTacToePlayer(boolean is_circle) {
        return new TicTacToePlayer(is_circle);
    }

    public TicTacToeField CreateTicTacToeField(TicTacToePlayer dtoPlayer) {
        return new TicTacToeField(dtoPlayer);
    }
}
