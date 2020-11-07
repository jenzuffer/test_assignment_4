package servicelayer;

import dto.TicTacToeField;
import dto.TicTacToePlayer;

public class TicTacToeServiceImpl implements TicTacToeService{


    public TicTacToeServiceImpl(){ }

    public void StartTicTacToeGame(TicTacToePlayer dtoPlayer) {
        TicTacToeField field = new TicTacToeField(dtoPlayer);
        System.out.println("StartTicTacToeGame reached");
    }

    public TicTacToePlayer CreateTicTacToePlayer() {
        return new TicTacToePlayer(false);
    }
}
