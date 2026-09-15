import random

filas = 8
columnas = 8
total_minas = 10

# Crear tablero de minas
minas = [[False for _ in range(columnas)] for _ in range(filas)]

# Colocar minas de forma aleatoria
colocadas = 0
while colocadas < total_minas:
    f = random.randint(0, filas - 1)
    c = random.randint(0, columnas - 1)
    if not minas[f][c]:
        minas[f][c] = True
        colocadas += 1

# Tablero visible para el jugador
visible = [[False for _ in range(columnas)] for _ in range(filas)]

# Bucle principal simple
juego_en_curso = True
while juego_en_curso:
    print("\n  " + " ".join([str(i) for i in range(columnas)]))
    for i in range(filas):
        print(i, end=" ")
        for j in range(columnas):
            if visible[i][j]:
                print("M" if minas[i][j] else ".", end=" ")
            else:
                print("*", end=" ")
        print()
        
    # Entrada de ejemplo para revelar casilla
    f_jugador = int(input("Fila: "))
    c_jugador = int(input("Columna: "))
    
    if minas[f_jugador][c_jugador]:
        print("¡Has pisado una mina! Fin del juego.")
        juego_en_curso = False
    else:
        visible[f_jugador][c_jugador] = True
