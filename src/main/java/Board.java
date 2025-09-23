package main.java;

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

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public char getCell(int row, int col) {
    return board[row][col];
}

    public void placeMark(int row, int col, char mark) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == '-') {
                board[row][col] = mark;
            } else {
                System.out.println("Esa casilla ya está ocupada");
            }
        } else {
            System.out.println("Posición inválida");
        }
    }
}
