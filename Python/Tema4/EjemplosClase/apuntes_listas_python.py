# -*- coding: utf-8 -*-
"""
APUNTES DE PYTHON: LISTAS (Basado en el documento 4.1_listas.pdf)
==================================================================
Este archivo recopila todos los ejemplos de código del documento,
organizados por temas y comentados para que puedas ejecutarlo y estudiarlo.
"""

from collections import deque

# ==============================================================================
# 1. CREACIÓN DE LISTAS E INDEXACIÓN (Páginas 3 - 4)
# ==============================================================================
print("--- 1. CREACIÓN DE LISTAS E INDEXACIÓN ---")

# Lista vacía (dos formas equivalentes)
lista = []
lista = list()

# Lista con un único elemento
lista = [1]

# Lista con dos elementos
lista = [3, 4]

# Lista con tres elementos de distinto tipo (heterogénea)
lista = [3, 5.6, 'coche']

# Lista generada a partir de un rango (valores 0, 1, 2, 3 y 4)
lista = list(range(5))
print("Lista con range(5):", lista)

# Acceso a elementos mediante índice (empieza en 0 hasta n-1)
invitados = ['Paquita Salas', 'John Stark', 'Sancho Panza', 'Sigmund Freud']
print("Primer invitado (índice 0):", invitados[0])   # 'Paquita Salas'
print("Tercer invitado (índice 2):", invitados[2])   # 'Sancho Panza'

# Modificación de un elemento existente
invitados[1] = 'John Snow'
print("Lista modificada:", invitados)  # ['Paquita Salas', 'John Snow', 'Sancho Panza', 'Sigmund Freud']

# Nota sobre errores de índice:
# Si intentamos acceder a invitados[5], Python lanzará:
# IndexError: list index out of range
try:
    print(invitados[5])
except IndexError as e:
    print("Error esperado al acceder a índice fuera de rango:", e)


# ==============================================================================
# 2. SEGMENTOS DE LISTA / SLICING (Páginas 5 - 7)
# ==============================================================================
print("\n--- 2. SEGMENTOS DE LISTA (SLICING) ---")

# Sintaxis: lista[indice_inicio : indice_limite] (el límite no se incluye)
print("Del primero al segundo [0:2]:", invitados[0:2])  # ['Paquita Salas', 'John Snow']
print("Del segundo al último [1:4]:", invitados[1:4])   # ['John Snow', 'Sancho Panza', 'Sigmund Freud']
print("Usando len() [1:len(invitados)]:", invitados[1:len(invitados)])

# Si inicio == límite, devuelve una lista vacía
print("Segmento vacío [1:1]:", invitados[1:1])  # []

# Uso de índices negativos (cuentan desde el final hacia atrás)
print("Desde el segundo hasta el penúltimo [1:-1]:", invitados[1:-1])  # ['John Snow', 'Sancho Panza']
print("Segmento vacío con negativo [1:-3]:", invitados[1:-3])          # []
print("Último elemento [-1]:", invitados[-1])                          # 'Sigmund Freud'

# Si el límite supera la longitud de la lista, llega hasta el final sin dar error
print("Límite superior [1:8]:", invitados[1:8])  # ['John Snow', 'Sancho Panza', 'Sigmund Freud']

# Asignación sobre segmentos (reemplazo de múltiples elementos)
l = list(range(7))
print("Lista inicial:", l)          # [0, 1, 2, 3, 4, 5, 6]
print("Segmento [2:5]:", l[2:5])    # [2, 3, 4]
l[2:5] = [8]                        # Reemplaza [2, 3, 4] por un solo elemento [8]
print("Tras reemplazar [2:5] por [8]:", l)  # [0, 1, 8, 5, 6]

# Segmentos parciales (omitiendo inicio o fin)
l = list('murciélago')
print("Lista de caracteres:", l)    # ['m', 'u', 'r', 'c', 'i', 'é', 'l', 'a', 'g', 'o']
print("Desde índice 5 al final [5:]:", l[5:])  # ['é', 'l', 'a', 'g', 'o']
print("Desde el inicio hasta índice 5 [:5]:", l[:5])  # ['m', 'u', 'r', 'c', 'i']


# ==============================================================================
# 3. ELIMINACIÓN DE ELEMENTOS CON 'del' (Página 8)
# ==============================================================================
print("\n--- 3. ELIMINACIÓN DE ELEMENTOS ---")

l = list(range(2010, 2018))
print("Años:", l)  # [2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017]
del l[3]           # Elimina el elemento en la posición 3 (el año 2013)
print("Tras del l[3]:", l)  # [2010, 2011, 2012, 2014, 2015, 2016, 2017]


# ==============================================================================
# 4. MÉTODOS PRINCIPALES DE LISTAS (Páginas 9 - 14)
# ==============================================================================
print("\n--- 4. MÉTODOS PRINCIPALES DE LISTAS ---")

# --- append(x): Añade x al final de la lista ---
l = list(range(7))
l.append(9)
print("append(9):", l)  # [0, 1, 2, 3, 4, 5, 6, 9]

# --- extend(iterable): Añade todos los elementos de un iterable al final ---
l = list(range(7))
l.extend(range(4))
print("extend(range(4)):", l)  # [0, 1, 2, 3, 4, 5, 6, 0, 1, 2, 3]
# Equivalente usando slicing al final de la lista:
l[len(l):] = 'fin'
print("Tras l[len(l):] = 'fin':", l)  # [..., 3, 'f', 'i', 'n']

# --- insert(i, x): Inserta x en la posición i desplazando el resto ---
l = list('salta')
print("Original:", l)              # ['s', 'a', 'l', 't', 'a']
l.insert(len(l), 's')              # Inserta al final
print("insert al final:", l)       # ['s', 'a', 'l', 't', 'a', 's']
l.insert(0, 'a')                   # Inserta al principio
print("insert al principio:", l)   # ['a', 's', 'a', 'l', 't', 'a', 's']
l.insert(2, 'f')                   # Inserta en índice 2
print("insert en índice 2:", l)    # ['a', 's', 'f', 'a', 'l', 't', 'a', 's']

# --- remove(x): Elimina la PRIMERA ocurrencia del valor x (ValueError si no existe) ---
l.remove('f')
print("remove('f'):", l)  # ['a', 's', 'a', 'l', 't', 'a', 's']
l.remove('s')
print("remove('s'):", l)  # ['a', 'a', 'l', 't', 'a', 's']
l.remove('a')
print("remove('a'):", l)  # ['a', 'l', 't', 'a', 's']

# --- pop([i]): Extrae, elimina y devuelve el elemento en i (por defecto el último) ---
l = list('programador')
a = l.pop()               # Saca el último ('r')
print("pop() sacó:", a, "| Lista queda:", l)
a = l.pop(1)              # Saca el de la posición 1 ('r')
print("pop(1) sacó:", a, "| Lista queda:", l)

# --- clear(): Vacía completamente la lista ---
l.clear()
print("Tras clear():", l)  # []

# --- index(x[, inicio[, límite]]): Devuelve el índice de la primera aparición de x ---
l = list(range(4, 14, 2))
print("Lista pares:", l)               # [4, 6, 8, 10, 12]
print("Índice del 4:", l.index(4))     # 0
# Si el elemento no existe (ej. l.index(20)), lanza ValueError
try:
    l.index(20)
except ValueError as e:
    print("Error esperado en index(20):", e)

# --- count(x): Cuenta cuántas veces aparece x en la lista ---
l = list('mammamía')
print("Contar 'm':", l.count('m'))  # 4
print("Contar 'a':", l.count('a'))  # 3
print("Contar 'f':", l.count('f'))  # 0

# --- sort(key=None, reverse=False): Ordena la lista in-place ---
l = list(range(10))
l.sort(reverse=True)
print("Orden descendente:", l)   # [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
l.sort(reverse=False)
print("Orden ascendente:", l)    # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

# Ordenación personalizada usando funciones y el parámetro 'key'
def nombre(e):
    return e['nombre']

def edad(e):
    return e['edad']

personajes = [
    {'nombre': 'Pili', 'edad': 12},
    {'nombre': 'Mili', 'edad': 14},
    {'nombre': 'Beorn', 'edad': 300}
]
# sorted() devuelve una nueva lista ordenada sin modificar la original
print("Ordenado por nombre (sorted):", sorted(personajes, key=nombre))
print("Ordenado por edad (sorted):", sorted(personajes, key=edad))
print("Lista original sin cambios:", personajes)
# sort() modifica la lista original directamente
personajes.sort(key=edad)
print("Lista original ordenada por edad (sort):", personajes)

# --- reverse(): Invierte el orden de los elementos in-place ---
l = ['primero', 'segundo', 'tercero', 'cuarto']
l.reverse()
print("Tras reverse():", l)  # ['cuarto', 'tercero', 'segundo', 'primero']

# --- copy(): Crea una copia independiente (evita aliasing / referencias compartidas) ---
l1 = ['primero', 'segundo', 'tercero', 'cuarto']
l2 = l1          # ¡OJO! l2 apunta a la misma lista en memoria que l1
l2.sort()
print("l2 ordenada:", l2)
print("l1 también cambió:", l1)

l3 = l1.copy()   # Copia superficial independiente
l1.reverse()
print("l1 invertida:", l1)
print("l2 (referencia) también invertida:", l2)
print("l3 (copia) intacta:", l3)


# ==============================================================================
# 5. PILAS Y COLAS (Páginas 15 - 17)
# ==============================================================================
print("\n--- 5. PILAS (LIFO) Y COLAS (FIFO) ---")

# --- PILA (Stack - Last In, First Out) usando append() y pop() ---
acciones = []  # Inicializamos la pila

# Guardamos las acciones del usuario
acciones.append("escribir 'h'")
acciones.append("escribir 'o'")
acciones.append("escribir 'y'")
acciones.append("negrita 'hoy'")
print("Contenido de la pila:", acciones)

# Deshacemos el último cambio y ponemos en cursiva
print("Sacamos última acción:", acciones.pop())
acciones.append("cursiva 'hoy'")
print("Estado final de la pila:", acciones)

# --- COLA (Queue - First In, First Out) usando collections.deque ---
# Se usa deque en lugar de list.insert(0, x) por eficiencia en memoria
cola = deque()

# Llegan 5 clientes a la cola
for i in range(5):
    cliente = 'cliente ' + str(i + 1)
    print('Llega', cliente)
    cola.append(cliente)
    print('Cola:', cola)

# Salen todos los clientes de la cola por orden de llegada (popleft)
while len(cola) > 0:
    print('Sale', cola.popleft())
    print('Quedan:', cola)


# ==============================================================================
# 6. COMPRENSIÓN DE LISTAS / LIST COMPREHENSIONS (Páginas 18 - 19)
# ==============================================================================
print("\n--- 6. COMPRENSIÓN DE LISTAS ---")

# --- Transformación (aplicar una operación a cada elemento) ---
precios = [200.0, 125.99, 19.90, 37.50]

# Forma tradicional con bucle for:
for i in range(len(precios)):
    precios[i] = precios[i] * 0.5
print("Precios rebajados (bucle tradicional):", precios)

# Forma con comprensión de listas (volvemos a rebajar un 50% como ejemplo):
precios = [200.0, 125.99, 19.90, 37.50]
precios = [x * 0.5 for x in precios]
print("Precios rebajados (list comprehension):", precios)

# --- Filtrado (incluir condición if) ---
edades = [23, 32, 19, 22, 25, 30, 27]
mayores = [x for x in edades if x > 25]
print('Hay', len(mayores), 'mayores de 25 años ->', mayores)  # Hay 3 mayores de 25 años

# --- Combinación (bucles anidados) ---
chicos = ['Juan', 'Mark', 'Arturo']
chicas = ['Ana', 'Pilar', 'Salud']
parejas_posibles = [(x, y) for x in chicas for y in chicos]
print("Parejas posibles:", parejas_posibles)