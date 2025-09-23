package main.java;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Board b = new Board();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenida al Tres en Raya");
        b.printBoard();

        System.out.print("Introduce fila (0-2): ");
        int row = sc.nextInt();

        System.out.print("Introduce columna (0-2): ");
        int col = sc.nextInt();

        b.placeMark(row, col, 'X');

        b.printBoard();

        sc.close();
    }
}
