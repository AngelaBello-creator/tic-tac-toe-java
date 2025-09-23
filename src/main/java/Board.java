package main.java;

public class Board {

    board = new char [3] [3];
    initializeBoard();  
}

public void initializeBoard() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board [i] [j] = '-';
        }
    }
}

