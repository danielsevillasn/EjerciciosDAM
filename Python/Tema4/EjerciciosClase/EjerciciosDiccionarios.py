###
# EJERCICIOS
# Diccionarios
###

#Ejercicio 1
#Escribir un programa que guarde en una variable el diccionario {'Euro':'€', 'Dollar':'$', 'Yen':'¥'}, 
#pregunte al usuario por una divisa y muestre su símbolo o un mensaje de aviso si la divisa no está 
#en el diccionario.
monedas = {'Euro': '€', 'Dollar': '$', 'Yen': '¥'}
divisa = input("Introduce una divisa (Euro, Dollar, Yen): ").strip().title()

if divisa in monedas:
    print(f"El símbolo de {divisa} es {monedas[divisa]}")
else:
    print("La divisa no está en el diccionario.")

#Ejercicio 2
#Escribir un programa que pregunte al usuario su nombre, edad, dirección y teléfono y 
#lo guarde en un diccionario. 
#Después debe mostrar por pantalla el mensaje <nombre> tiene <edad> años, vive en <dirección> 
#y su número de teléfono es <teléfono>.
usuario = {
    'nombre': input("Introduce tu nombre: ").strip(),
    'edad': input("Introduce tu edad: ").strip(),
    'direccion': input("Introduce tu dirección: ").strip(),
    'telefono': input("Introduce tu teléfono: ").strip()
}

print(f"{usuario['nombre']} tiene {usuario['edad']} años, vive en {usuario['direccion']} y su número de teléfono es {usuario['telefono']}.")



#Ejercicio 3
#Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla, 
#pregunte al usuario por una fruta, un número de kilos y muestre por pantalla el precio 
#de ese número de kilos de fruta. Si la fruta no está en el diccionario debe mostrar un 
#mensaje informando de ello.
frutas = {
    'Plátano': 1.35,
    'Manzana': 0.80,
    'Pera': 0.85,
    'Naranja': 0.70
}

fruta = input("¿Qué fruta quieres?: ").strip().title()

if fruta in frutas:
    kilos = float(input("¿Cuántos kilos?: "))
    total = frutas[fruta] * kilos
    print(f"{kilos} kg de {fruta} cuestan {total:.2f} €")
else:
    print(f"Lo siento, no tenemos {fruta} disponible.")



#Ejercicio 4
#Escribir un programa que almacene el diccionario con los créditos de las asignaturas 
#de un curso {'Matemáticas': 6, 'Física': 4, 'Química': 5} y después muestre por pantalla 
#los créditos de cada asignatura en el formato <asignatura> tiene <créditos> créditos, 
#donde <asignatura> es cada una de las asignaturas del curso, y <créditos> son sus créditos. 
#Al final debe mostrar también el número total de créditos del curso.
creditos = {'Matemáticas': 6, 'Física': 4, 'Química': 5}
total_creditos = 0

for asignatura, num_creditos in creditos.items():
    print(f"{asignatura} tiene {num_creditos} créditos")
    total_creditos += num_creditos

print(f"Número total de créditos del curso: {total_creditos}")


#Ejercicio 5
#Escribir un programa que cree un diccionario simulando una cesta de la compra. 
#El programa debe preguntar el artículo y su precio y añadir el par al diccionario, 
#hasta que el usuario decida terminar. Después se debe mostrar por pantalla la lista 
#de la compra y el coste total
cesta = {}

while True:
    articulo = input("Introduce un artículo (o escribe 'fin' para terminar): ").strip()
    if articulo.lower() == 'fin':
        break
    precio = float(input(f"Introduce el precio de '{articulo}': "))
    cesta[articulo] = precio

print("\nLista de la compra")
print("-" * 25)
total = 0

for articulo, precio in cesta.items():
    print(f"{articulo:<18} {precio:>6.2f} €")
    total += precio

print("-" * 25)
print(f"{'Total':<18} {total:>6.2f} €")