package servicelayer;

import dto.TicTacToeField;
import dto.TicTacToePlayer;

public class TicTacToeServiceImpl implements TicTacToeService{
    private TicTacToeField field;

    public TicTacToeServiceImpl(TicTacToePlayer dtoPlayer){
        this.field = new TicTacToeField(dtoPlayer);
    }

    public TicTacToeField getField() {
        return this.field;
    }

    public String StartTicTacToeGame(TicTacToePlayer dtoPlayer) {
        System.out.println("StartTicTacToeGame reached");

        String exampleName = "christian";
        field.setHumanPlayerName(exampleName);
        field.startGame();

        return "winner";
    }
}
