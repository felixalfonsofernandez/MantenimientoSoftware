import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testeo {

    private ChessGameBoard gameBoard;

    @BeforeEach
    public void setUp() {
        gameBoard = new ChessGameBoard();
    }

    @Test
    public void testClearCelll() {
        int row = 5;
        int col = 2;
        BoardSquare square = gameBoard.getCell(row,col);
        assertNotNull(square);
        assertEquals(row,square.getRow());
    }
    
    

}