public class Board {

    private char[][] board;


    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

  
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

}
