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
# María tiene 35 año

# Usar range() para generar índices en un bucle
palabra = "Python"
for i in range(len(palabra)):
    print(f"Índice {i}: {palabra[i]}")
# Salida: Índice 0: P, Índice 1: y, Índice 2: t, Índice 3: h, Índice 4: o, Índice 5: 