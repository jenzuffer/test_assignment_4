package servicelayer;

import dto.TicTacToePlayer;

public interface TicTacToeService {
    public void StartTicTacToeGame(TicTacToePlayer dtoPlayer);
    public TicTacToePlayer CreateTicTacToePlayer();
}
