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

    @BeforeAll
    public void setup() {
        svc = new TicTacToeServiceImpl();
    }

    @Test
    public void mustCreateTicTacToePlayer()
    {
        //arrange
        TicTacToePlayer ticTacToePlayer = svc.CreateTicTacToePlayer(true);
        //act

        //assert
        Assertions.assertNotNull(ticTacToePlayer);
    }

    @Test
    public void mustCreateTicTocToeField()
    {
        //arrange
        TicTacToeField ticTacToeField = svc.CreateTicTacToeField(svc.CreateTicTacToePlayer(false));
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

        //assert
        verify(mock);
        verify(mock1);
        verify(mock2);
    }

    @Test
    public void mustInteractWithMocks()
    {
        //arrange
        TicTacToeService mock = mock(TicTacToeService.class);
        TicTacToePlayer ticTacToePlayer = mock.CreateTicTacToePlayer(false);
        //act
        mock.StartTicTacToeGame(ticTacToePlayer);
        //asert
        verify(mock, times(1)).StartTicTacToeGame(ticTacToePlayer);
        verify(mock, times(1)).CreateTicTacToePlayer(false);
    }
}
