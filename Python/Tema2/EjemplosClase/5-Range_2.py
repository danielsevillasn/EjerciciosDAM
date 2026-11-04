numeros_pares = list(range(0, 10, 2))
print(numeros_pares)    # Salida: [0, 2, 4, 6, 8]

"""
Crear lita dede rage()
En este ejemplo, se muestra cómo utilizar range para crear una lista de números pares del 0
al 9, utilizando la función list para convertir la secuencia generada por range en una lista:
"""
# ejemplo con zip() para iterar en paralelo sobre dos listas
nombres = ["Ana", "Luis", "María"]
edades = [30, 25, 35]
# Crea un iterador de tuplas
nombre_edad = zip(nombres, edades)
# Imprime las tuplas (o puedes usar un bucle for)
# print(list(nombre_edad)) # ['Ana', 'Luis', 'Maria'] , [30, 25, 35]
for nombre, edad in nombre_edad:
    print(f"{nombre} tiene {edad} años.")
# Salida:
# Ana tiene 30 años.
# Luis tiene 25 años.
# María tiene 35 años.
# mismo ejemplo usando range() como si fuera zip() para iterar en paralelo sobre dos listas
nombres = ["Ana", "Luis", "María"]
edades = [30, 25, 35]
for i in range(len(nombres)):
    print(f"{nombres[i]} tiene {edades[i]} años.")
# Salida:
# Ana tiene 30 años.
# Luis tiene 25 años.
# María tiene 35 años.