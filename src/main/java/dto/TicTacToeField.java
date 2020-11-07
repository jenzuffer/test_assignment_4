package dto;

public class TicTacToeField {
    private int [] Fields = new int[9];
    private int [] scores = new int[2];
    private TicTacToePlayer dtoPlayer;

    public int[] getFields() {
        return Fields;
    }

    public TicTacToeField(TicTacToePlayer dtoPlayer){
        this.dtoPlayer = dtoPlayer;
    }
}
