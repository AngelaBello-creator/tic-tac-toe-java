# Tic Tac Toe – Tres en Raya en Java

##  Diagrama de flujo (Flow chart)

```text
[Inicio]
   |
   v
[Mostrar tablero vacío]
   |
   v
[Jugador actual hace movimiento]
   |
   v
[¿Casilla libre?]---NO--->[Mostrar error y pedir de nuevo]
   |
   SI
   v
[Colocar ficha en tablero]
   |
   v
[Mostrar tablero actualizado]
   |
   v
[¿Hay ganador?]---SI--->[Mostrar "Ganó X/O"]--->[Fin]
   |
   NO
   v
[¿Tablero lleno?]---SI--->[Mostrar "Empate"]--->[Fin]
   |
   NO
   v
[Cambiar turno (X <-> O)]
   |
   v
[Repetir ciclo]