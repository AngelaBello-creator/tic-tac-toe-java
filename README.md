# 🎮 Tic Tac Toe - Tres en Raya en Java

¡Bienvenide a **Tic Tac Toe**!

## Descripción

Este proyecto consiste en el desarrollo del clásico juego **Tic Tac Toe** (Tres en Raya) en Java 21, un desafío de consola para dos jugadoras con control de turnos, validación de jugadas y detección de victoria o empate.

## Reglas del Juego

1. **Dos jugadores** se turnan para ingresar su jugada (`X` y `O`).
2. Eligen una **fila y una columna** separadas por un tabulador.
3. El sistema valida el movimiento:
   - Si la casilla está ocupada, se pedirá una nueva entrada.
   - Si la casilla está libre, se actualizará el tablero.
4. A partir del **quinto turno**, el sistema verifica si hay un ganador.
5. Si se completan los **9 turnos** sin un ganador, el juego termina en **empate**.

## Diagrama de Flujo

Aquí tienes un **diagrama de flujo** del funcionamiento del juego:

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

## Tecnologías Utilizadas

- WIP

## Instalación y Ejecución
WIP

## Funcionalidades Implementadas

WIP
- ✅

## Equipo

[Angela Bello](https://github.com/AngelaBello-creator) → Product Owner & Developer

[Daniella Pacheco](https://github.com/DaniPacheco8) → Scrum Master & Developer

```
