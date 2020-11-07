package integration.servicelayer;

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
        TicTacToePlayer ticTacToePlayer = svc.CreateTicTacToePlayer();
        //act

        //assert
        Assertions.assertNotNull(ticTacToePlayer);
    }
    @Test
    public void mustCreateMocks()
    {
        //arrange
        TicTacToeService mock = mock(TicTacToeService.class);
        //act

        //assert
        verify(mock);
    }

    @Test
    public void mustInteractWithMocks()
    {
        //arrange
        TicTacToeService mock = mock(TicTacToeService.class);
        TicTacToePlayer ticTacToePlayer = mock.CreateTicTacToePlayer();
        //act
        mock.StartTicTacToeGame(ticTacToePlayer);
        //asert
        verify(mock, times(1)).StartTicTacToeGame(ticTacToePlayer);
        verify(mock, times(1)).CreateTicTacToePlayer();
    }
}
