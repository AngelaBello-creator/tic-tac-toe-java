package main.java;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Board b = new Board();
        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador 1, elige tu marca (X u O): ");
        char player1 = sc.next().toUpperCase().charAt(0);

        while (player1 != 'X' && player1 != 'O') {
            System.out.print("Solo puedes elegir X u O: ");
            player1 = sc.next().toUpperCase().charAt(0);
        }

        char player2 = (player1 == 'X') ? 'O' : 'X';

        char currentPlayer = player1;

        System.out.println("Bienvenida al Tres en Raya");
        System.out.println("Jugador 1: " + player1 + " | Jugador 2: " + player2);

        boolean playing = true;

        while (playing) {
            b.printBoard();

            System.out.println("Turno del jugador " + currentPlayer);

            System.out.print("Introduce fila (0-2): ");
            int row = sc.nextInt();

            System.out.print("Introduce columna (0-2): ");
            int col = sc.nextInt();

            b.placeMark(row, col, currentPlayer);

            if (b.getCell(row, col) == currentPlayer) 
            {
            currentPlayer = (currentPlayer == player1) ? player2 : player1;

            }
        }

        sc.close();
    }
}
