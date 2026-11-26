# -*- coding: utf-8 -*-
"""
APUNTES DE PYTHON: TUPLAS (Basado en el documento 4.2_Tuplas-Conjuntos-y-Diccionarios-en-Python.pdf)
====================================================================================================
Ejemplos de creacion, acceso, operaciones y uso de tuplas.
"""

# ==============================================================================
# 1. CREACION DE TUPLAS
# ==============================================================================
print("--- 1. CREACION DE TUPLAS ---")

# Una tupla puede crearse con parentesis o separando los elementos con comas.
tupla = (3, 2, 1, 'contacto')
otra_tupla = 3, 2, 1, 'contacto'
print("Con parentesis:", tupla)
print("Sin parentesis:", otra_tupla)
print("Tipo de dato:", type(tupla))

# Para crear una tupla con un unico elemento es necesaria la coma.
tupla_unitaria = ('Python',)
no_es_tupla = ('Python')
print("Tupla unitaria:", tupla_unitaria, type(tupla_unitaria))
print("Sin coma es una cadena:", no_es_tupla, type(no_es_tupla))

# Tambien se pueden crear tuplas vacias y convertir otros iterables.
tupla_vacia = ()
desde_rango = tuple(range(4))
desde_cadena = tuple('sol')
print("Tupla vacia:", tupla_vacia)
print("Desde range:", desde_rango)
print("Desde una cadena:", desde_cadena)

# Las tuplas pueden contener datos de distintos tipos y otras tuplas.
anidada = (3, 2, (1, 'contacto'), 'fin')
print("Tupla anidada:", anidada)
print("Elemento de la tupla interior:", anidada[2][1])


# ==============================================================================
# 2. INDEXACION Y SEGMENTOS (SLICING)
# ==============================================================================
print("\n--- 2. INDEXACION Y SEGMENTOS ---")

invitados = ('Paquita Salas', 'John Snow', 'Sancho Panza', 'Sigmund Freud')
print("Primer elemento [0]:", invitados[0])
print("Ultimo elemento [-1]:", invitados[-1])
print("Elementos [1:3]:", invitados[1:3])
print("Desde el indice 2:", invitados[2:])
print("Hasta el indice 2, sin incluirlo:", invitados[:2])
print("Elementos alternos:", invitados[::2])
print("Tupla invertida:", invitados[::-1])

# Los cortes crean otra tupla y no modifican la original.
print("Tupla original:", invitados)


# ==============================================================================
# 3. INMUTABILIDAD
# ==============================================================================
print("\n--- 3. INMUTABILIDAD ---")

datos = ('Antonio', 'Gutierrez', 36, '+34 555 343 232')
# No se puede reasignar un elemento: datos[2] = 43 produciria TypeError.
# Para obtener una tupla con un valor distinto, se crea otra tupla.
datos_actualizados = datos[0], datos[1], 43, datos[3]
print("Datos originales:", datos)
print("Datos actualizados:", datos_actualizados)

# Aunque la tupla sea inmutable, una lista que contiene puede modificarse.
lista_interna = [1, 2]
tupla_con_lista = ('valores', lista_interna)
lista_interna.append(3)
print("Tupla con lista modificada:", tupla_con_lista)


# ==============================================================================
# 4. OPERACIONES Y FUNCIONES COMUNES
# ==============================================================================
print("\n--- 4. OPERACIONES Y FUNCIONES COMUNES ---")

numeros = (1, 2, 3)
letras = ('a', 'b', 'c')
print("Elemento incluido:", 2 in numeros)
print("Elemento no incluido:", 'z' not in letras)
print("Concatenacion:", numeros + letras)
print("Repeticion:", ('hola', 7) * 2)
print("Numero de elementos:", len(numeros))
print("Minimo:", min(numeros))
print("Maximo:", max(numeros))

# min() y max() requieren que los elementos se puedan comparar entre si.


# ==============================================================================
# 5. METODOS DE TUPLAS
# ==============================================================================
print("\n--- 5. METODOS DE TUPLAS ---")

valores = (7, 7, 7, 3, 5)
print("Veces que aparece 7:", valores.count(7))
print("Indice de la primera aparicion de 5:", valores.index(5))
print("Indice de 7 buscando desde el indice 2:", valores.index(7, 2))

# index() produce ValueError si el elemento no existe.
if 35 in valores:
    print("Indice de 35:", valores.index(35))
else:
    print("35 no aparece en la tupla")


# ==============================================================================
# 6. EMPAQUETADO, DESEMPAQUETADO E ITERACION
# ==============================================================================
print("\n--- 6. EMPAQUETADO, DESEMPAQUETADO E ITERACION ---")

# Empaquetado: varios valores se agrupan en una tupla.
coordenadas_3d = 34, 5.6, 86

# Desempaquetado: cada elemento se asigna a una variable.
x, y, z = coordenadas_3d
print("Coordenadas:", x, y, z)

depredador, presa = ('aguila', 'liebre')
print("Depredador:", depredador)
print("Presa:", presa)

# El numero de variables debe coincidir con el numero de elementos.
alumnos = [('David', 5), ('Irene', 9), ('Maria', 6.5), ('Antonio', 4.2), ('Marta', 3.7)]
suma_notas = 0
aprobados = 0
suspensos = 0

# Cada tupla de alumno se desempaqueta durante la iteracion.
for nombre, nota in alumnos:
    suma_notas += nota
    if nota >= 5:
        aprobados += 1
    else:
        suspensos += 1

print("Media del curso:", suma_notas / len(alumnos))
print("Aprobados:", aprobados)
print("Suspensos:", suspensos)

# enumerate() permite recorrer elementos junto a su indice.
for indice, alumno in enumerate(alumnos):
    print("Alumno", indice, "->", alumno[0])


# ==============================================================================
# 7. ZIP: COMBINAR SECUENCIAS
# ==============================================================================
print("\n--- 7. ZIP: COMBINAR SECUENCIAS ---")

numeros = [1, 2, 3]
letras = 'abc'
pares = tuple(zip(numeros, letras))
print("Tuplas creadas con zip():", pares)

# zip() se detiene al terminar la secuencia mas corta.
print("zip con longitudes distintas:", tuple(zip((1, 2, 3), ('a', 'b'))))