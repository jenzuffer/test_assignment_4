package dto;

public class TicTacToeField {
    private int [] Fields = new int[9];
    private int [] scores = new int[2];
    private TicTacToePlayer dtoPlayer;
    private String HumanPlayerName = "";

    public String getHumanPlayerName() {
        return HumanPlayerName;
    }

    public void setHumanPlayerName(String humanPlayerName) {
        HumanPlayerName = humanPlayerName;
    }

    public int[] getFields() {
        return Fields;
    }

    public int[] getScores() {
        return scores;
    }

    public TicTacToePlayer getDtoPlayer() {
        return dtoPlayer;
    }

    public TicTacToeField(TicTacToePlayer dtoPlayer){
        this.dtoPlayer = dtoPlayer;
    }

    public void startGame() {

    }
}
