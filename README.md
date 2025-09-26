# 🎮 Tic Tac Toe - Tres en Raya en Java

¡Bienvenid@ a **Tic Tac Toe**!

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

[Diagrama Flujo] (https://www.figma.com/design/GfNkxtpbtEDwALxkxmnRwz/Cruz-y-raya?node-id=0-1&p=f&t=cCWRPt9r5CkgvQZz-0)

## Tecnologías Utilizadas

- **Versión de Java:** 21.0.6
- **Scanner** para entrada de datos
- **JUnit 5:** 5.13.4

## Instalación y Ejecución

### 1 Clonar el Repositorio

```bash
git clone https://github.com/tu-usuario/tic-tac-toe-java.git
cd tic-tac-toe-java
```

### 2 Compilar el Código

```java
javac TicTacToe.java
```

### 3 Ejecutar el Juego

```java
java TicTacToe
```

## Funcionalidades Implementadas

✅ Creación de tablero vacío

✅ Elección del jugador (`X` o `O`).

✅ Alternancia entre jugadores (`X` y `O`).

✅ Validación de movimientos

✅ Detección de ganador o empate

## Equipo

[Angela Bello](https://github.com/AngelaBello-creator) → Product Owner & Developer

[Daniella Pacheco](https://github.com/DaniPacheco8) → Scrum Master & Developer
