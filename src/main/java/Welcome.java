package main.java;

public class Welcome {
    private Welcome() {
    }

    public static void printWelcomeMessage() {
        String title = """
                ┌────────────────────────┐
                │       TRES EN RAYA     │
                └────────────────────────┘
                """;

        String board = """
                    0   1   2
                  ┌───┬───┬───┐
                0 │ X │ O │   │
                  ├───┼───┼───┤
                1 │   │ X │   │
                  ├───┼───┼───┤
                2 │   │   │ O │
                  └───┴───┴───┘
                """;

        String msg = """
                ¡Bienvenid@ al Tres en Raya! ✨

                Reglas rápidas:
                - El Jugador 1 elige si quiere ser X u O.
                - Los turnos se alternan colocando marcas en la cuadrícula (0–2).
                - Gana quien alinee 3 marcas en fila, columna o diagonal.

                ¡Que empiece la partida!
                """;

        System.out.println(title);
        System.out.println(board);
        System.out.println(msg);
    }
}
