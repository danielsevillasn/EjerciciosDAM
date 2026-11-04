# Generar una secuencia de 0 a 4 (exclusivo)
for i in range(5):
    print(i)
# Salida: 0, 1, 2, 3, 4

# Generar una secuencia de 2 a 8 (exclusivo)
for i in range(2, 9):
    print(i)
# Salida: 2, 3, 4, 5, 6, 7, 8

# Generar una secuencia de 1 a 10 con paso de 2
for i in range(1, 11, 2):
    print(i)
# Salida: 1, 3, 5, 7, 9

# Iterar en orden inverso
for i in range(10, 0, -1):
    print(i)
# Salida: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

numeros_pares = list(range(0, 10, 2))
print(numeros_pares)
# Salida: [0, 2, 4, 6, 8]