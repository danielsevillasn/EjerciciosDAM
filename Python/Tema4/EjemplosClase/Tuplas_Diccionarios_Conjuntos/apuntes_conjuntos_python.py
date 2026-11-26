# -*- coding: utf-8 -*-
"""
APUNTES DE PYTHON: CONJUNTOS (Basado en el documento 4.2_Tuplas-Conjuntos-y-Diccionarios-en-Python.pdf)
======================================================================================================
Ejemplos de creacion, recorridos y operaciones con conjuntos (set).
"""

# ==============================================================================
# 1. CREACION DE CONJUNTOS
# ==============================================================================
print("--- 1. CREACION DE CONJUNTOS ---")

# Los conjuntos no mantienen un orden y eliminan los elementos duplicados.
numeros = {5, 4, 6, 8, 8, 1}
print("Conjunto literal:", numeros)
print("Tipo de dato:", type(numeros))

# set() permite crear conjuntos a partir de otros iterables.
desde_lista = set([1, 2, 2, 3, 4])
desde_cadena = set('abracadabra')
print("Desde una lista con duplicados:", desde_lista)
print("Letras distintas:", desde_cadena)

# {} crea un diccionario vacio, no un conjunto. Para un set vacio se usa set().
conjunto_vacio = set()
print("Conjunto vacio:", conjunto_vacio)

# Los elementos deben ser inmutables: se pueden usar numeros, cadenas y tuplas,
# pero no listas ni diccionarios.
conjunto_tuplas = {(1, 2), (3, 4)}
print("Conjunto de tuplas:", conjunto_tuplas)


# ==============================================================================
# 2. RECORRIDO, LONGITUD Y PERTENENCIA
# ==============================================================================
print("\n--- 2. RECORRIDO, LONGITUD Y PERTENENCIA ---")

colores = {'rojo', 'verde', 'azul'}
print("Numero de colores:", len(colores))
print("¿Esta rojo?:", 'rojo' in colores)
print("¿No esta amarillo?:", 'amarillo' not in colores)

# El orden de recorrido no esta garantizado.
for color in colores:
    print("Color:", color)

# Al imprimir un set el orden puede variar; sorted() sirve para mostrarlo ordenado.
print("Colores ordenados para mostrar:", sorted(colores))


# ==============================================================================
# 3. AÑADIR Y ELIMINAR ELEMENTOS
# ==============================================================================
print("\n--- 3. AÑADIR Y ELIMINAR ELEMENTOS ---")

valores = {1, 2}
valores.add(3)
valores.add(2)  # No se duplica un elemento que ya existe.
print("Tras add():", valores)

valores.remove(2)  # remove() lanza KeyError si el elemento no existe.
print("Tras remove(2):", valores)

valores.discard(99)  # discard() no hace nada si el elemento no existe.
print("Tras discard(99):", valores)

valores.add(4)
elemento_eliminado = valores.pop()  # Elimina y devuelve un elemento cualquiera.
print("Elemento eliminado por pop():", elemento_eliminado)
print("Conjunto restante:", valores)

valores.clear()
print("Tras clear():", valores)


# ==============================================================================
# 4. OPERACIONES ENTRE CONJUNTOS
# ==============================================================================
print("\n--- 4. OPERACIONES ENTRE CONJUNTOS ---")

alumno_1 = {'Matematicas', 'Lengua', 'Historia'}
alumno_2 = {'Ingles', 'Lengua', 'Ciencias'}
print("Asignaturas entre ambos (union):", alumno_1 | alumno_2)
print("Asignaturas comunes (interseccion):", alumno_1 & alumno_2)
print("Solo del alumno 1 (diferencia):", alumno_1 - alumno_2)
print("No comunes (diferencia simetrica):", alumno_1 ^ alumno_2)

# Las mismas operaciones se pueden expresar mediante metodos.
print("Union con union():", alumno_1.union(alumno_2))
print("Interseccion con intersection():", alumno_1.intersection(alumno_2))
print("Diferencia con difference():", alumno_1.difference(alumno_2))
print("Diferencia simetrica:", alumno_1.symmetric_difference(alumno_2))


# ==============================================================================
# 5. SUBCONJUNTOS Y CONJUNTOS DISJUNTOS
# ==============================================================================
print("\n--- 5. SUBCONJUNTOS Y CONJUNTOS DISJUNTOS ---")

pares = {2, 4, 6, 8}
print("{2, 4} es subconjunto:", {2, 4}.issubset(pares))
print("pares contiene {2, 4}:", pares.issuperset({2, 4}))
print("{2, 4} <= pares:", {2, 4} <= pares)

impares = {1, 3, 5, 7, 9}
print("Pares e impares son disjuntos:", pares.isdisjoint(impares))


# ==============================================================================
# 6. ACTUALIZAR CONJUNTOS
# ==============================================================================
print("\n--- 6. ACTUALIZAR CONJUNTOS ---")

original = {1, 2, 3, 4}
otro = {3, 4, 5, 6}

union_actualizada = original.copy()
union_actualizada.update(otro)
print("update():", union_actualizada)

interseccion_actualizada = original.copy()
interseccion_actualizada.intersection_update(otro)
print("intersection_update():", interseccion_actualizada)

diferencia_actualizada = original.copy()
diferencia_actualizada.difference_update(otro)
print("difference_update():", diferencia_actualizada)

diferencia_simetrica_actualizada = original.copy()
diferencia_simetrica_actualizada.symmetric_difference_update(otro)
print("symmetric_difference_update():", diferencia_simetrica_actualizada)


# ==============================================================================
# 7. EJEMPLO PRACTICO: INGREDIENTES
# ==============================================================================
print("\n--- 7. EJEMPLO PRACTICO: INGREDIENTES ---")

ensalada = {'lechuga', 'tomate', 'cebolla', 'aceite', 'vinagre', 'sal'}
verduras = {'brocoli', 'tomate', 'cebolla', 'apio', 'lechuga'}
condimentos = {'pimienta', 'curcuma', 'aceite', 'vinagre', 'sal'}

print("Ingredientes de la ensalada:", len(ensalada))
print("Verduras incluidas:", len(verduras & ensalada))
print("Condimentos incluidos:", len(condimentos & ensalada))