package integration.servicelayer;

import dto.TicTacToeField;
import dto.TicTacToePlayer;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.Mockito;
import servicelayer.TicTacToeService;
import servicelayer.TicTacToeServiceImpl;

import static org.mockito.Mockito.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("integration")
public class ServiceTestTicTacToe {
    private TicTacToeService svc;

    public TicTacToePlayer CreateTicTacToePlayer(boolean is_circle) {
        return new TicTacToePlayer(is_circle);
    }

    @BeforeAll
    public void setup() {

        svc = new TicTacToeServiceImpl(CreateTicTacToePlayer(false));
    }

    @Test
    public void mustCreateTicTacToePlayer()
    {
        //arrange
        TicTacToePlayer ticTacToePlayer = CreateTicTacToePlayer(true);
        //act

        //assert
        Assertions.assertNotNull(ticTacToePlayer);
    }

    @Test
    public void mustCreateTicTocToeField()
    {
        //arrange
        TicTacToeField ticTacToeField = svc.getField();
        //act

        //asert
        Assertions.assertNotNull(ticTacToeField);
    }

    @Test
    public void mustCreateMocks()
    {
        //arrange
        TicTacToeService mock = mock(TicTacToeService.class);
        TicTacToePlayer mock1 = mock(TicTacToePlayer.class);
        TicTacToeField mock2 = mock(TicTacToeField.class);
        //act
        mock.getField();
        mock1.is_circle();
        mock2.startGame();
        //assert
        verify(mock).getField();
        verify(mock1).is_circle();
        verify(mock2).startGame();
    }

    @Test
    public void mustInteractWithMocks()
    {
        //arrange
        TicTacToeService mock = mock(TicTacToeService.class);
        TicTacToePlayer ticTacToePlayer = CreateTicTacToePlayer(false);
        //act
        mock.StartTicTacToeGame(ticTacToePlayer);
        //asert
        verify(mock, times(1)).StartTicTacToeGame(ticTacToePlayer);
    }

    @Test
    public void mustTestGameInputs()
    {
        //arrange
        //act
        String gameWinner = svc.StartTicTacToeGame(CreateTicTacToePlayer(true));
        //asert


    }

    @Test
    public void mustTestMockProperties() {
        TicTacToeField mock = mock(TicTacToeField.class);
        mock.setHumanPlayerName("player");
        verify(mock).setHumanPlayerName(argThat((String playerName) -> playerName.equals("player")));
    }
}
