package tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void initializeBoard_fillsWithDashes() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals('-', board.getCell(i, j),
                        "Cell at (" + i + "," + j + ") should be empty");
            }
        }
    }

    @Test
    void placeMark_placesCorrectly() {
        board.placeMark(1, 1, 'X'); 
        assertEquals('X', board.getCell(1, 1)); 
    }

    @Test
    void placeMark_doesNotOverrideExistingMark() {
        board.placeMark(0, 0, 'X');
        board.placeMark(0, 0, 'O');
        assertEquals('X', board.getCell(0, 0));
    }

    @Test
    void checkWinner_rowWin() {
        board.placeMark(2, 0, 'O');
        board.placeMark(2, 1, 'O');
        board.placeMark(2, 2, 'O');
        assertTrue(board.checkWinner('O'));
    }

    @Test
    void isBoardFull_returnsTrueWhenNoEmptyCells() {
        char current = 'X';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.placeMark(i, j, current);
                current = (current == 'X') ? 'O' : 'X';
            }
        }
        assertTrue(board.isBoardFull());
    }
}
