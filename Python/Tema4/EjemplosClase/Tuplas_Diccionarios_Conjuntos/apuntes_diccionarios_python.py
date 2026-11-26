# -*- coding: utf-8 -*-
"""
APUNTES DE PYTHON: DICCIONARIOS (Basado en el documento 4.2_Tuplas-Conjuntos-y-Diccionarios-en-Python.pdf)
==========================================================================================================
Ejemplos de creacion, acceso, modificacion y recorrido de diccionarios.
"""

# ==============================================================================
# 1. CREACION DE DICCIONARIOS
# ==============================================================================
print("--- 1. CREACION DE DICCIONARIOS ---")

# Un diccionario guarda pares clave-valor. Las claves son unicas.
persona = {
    'nombre': 'Miriam',
    'apellidos': 'Garcia Martinez',
    'edad': 21,
    'es_estudiante': True,
    'notas': [7, 8, 9]
}
print("Diccionario:", persona)
print("Tipo de dato:", type(persona))

# Si se repite una clave, se conserva su ultimo valor.
precios = {'pera': 2.34, 'tomate': 1.98, 'pera': 2.50}
print("Clave repetida:", precios)

# Tambien se pueden construir diccionarios con dict(), pares o zip().
con_dict = dict(nombre='Sara', edad=27)
con_pares = dict([('pera', 2.3), ('tomate', 1.98)])
con_zip = dict(zip(['pera', 'tomate'], [2.3, 1.98]))
print("Con dict():", con_dict)
print("Desde pares:", con_pares)
print("Desde zip():", con_zip)

# {} y dict() crean un diccionario vacio.
diccionario_vacio = {}
otro_vacio = dict()
print("Diccionarios vacios:", diccionario_vacio, otro_vacio)

# Las claves deben ser inmutables (por ejemplo, cadenas, numeros o tuplas).
# Las listas y los diccionarios no se pueden usar como claves.


# ==============================================================================
# 2. ACCESO Y MODIFICACION
# ==============================================================================
print("\n--- 2. ACCESO Y MODIFICACION ---")

precio_kilo = {'pera': 2.34, 'tomate': 1.98, 'manzana': 2.50}
print("Precio de la pera:", precio_kilo['pera'])

# Una clave nueva se agrega al asignarle un valor; una existente se actualiza.
precio_kilo['uva'] = 3.20
precio_kilo['pera'] = 2.40
print("Tras agregar uva y actualizar pera:", precio_kilo)

# get() permite consultar una clave sin provocar KeyError si no existe.
print("Precio de manzana:", precio_kilo.get('manzana'))
print("Precio de naranja:", precio_kilo.get('naranja'))
print("Naranja con valor por defecto:", precio_kilo.get('naranja', 'No disponible'))

# El valor por defecto de get() no agrega la clave al diccionario.
print("¿Se agrego naranja?:", 'naranja' in precio_kilo)


# ==============================================================================
# 3. COMPROBAR CLAVES Y ELIMINAR ELEMENTOS
# ==============================================================================
print("\n--- 3. COMPROBAR CLAVES Y ELIMINAR ELEMENTOS ---")

print("¿Existe pera?:", 'pera' in precio_kilo)
print("¿Existe naranja?:", 'naranja' in precio_kilo)

del precio_kilo['tomate']
print("Tras del tomate:", precio_kilo)

# pop() devuelve y elimina el valor asociado a la clave.
precio_uva = precio_kilo.pop('uva')
print("Valor eliminado con pop():", precio_uva)
print("Diccionario restante:", precio_kilo)

# pop() acepta un valor por defecto si la clave podria no existir.
precio_naranja = precio_kilo.pop('naranja', 'No existia')
print("pop() de una clave ausente:", precio_naranja)


# ==============================================================================
# 4. RECORRER CLAVES, VALORES Y PARES
# ==============================================================================
print("\n--- 4. RECORRER CLAVES, VALORES Y PARES ---")

persona = {
    'nombre': 'Miriam',
    'apellidos': 'Garcia Martinez',
    'telefono': '555 34 34 34',
    'edad': 21
}

# Recorrer directamente el diccionario devuelve sus claves.
print("Claves:")
for clave in persona:
    print(clave)

print("Valores:")
for valor in persona.values():
    print(valor)

print("Pares clave-valor:")
for clave, valor in persona.items():
    print(clave, "->", valor)

# keys(), values() e items() permiten consultar las vistas del diccionario.
print("Vista de claves:", persona.keys())
print("Vista de valores:", persona.values())
print("Vista de pares:", persona.items())


# ==============================================================================
# 5. COPIAR Y ACTUALIZAR DICCIONARIOS
# ==============================================================================
print("\n--- 5. COPIAR Y ACTUALIZAR DICCIONARIOS ---")

compra = {'tomates': 2, 'naranjas': 4, 'suavizante': 1}
referencia = compra
referencia['pan'] = 1
print("La referencia cambia el original:", compra)

compra_lunes = compra.copy()
compra_lunes['rollo cocina'] = 6
del compra_lunes['naranjas']
print("Compra original:", compra)
print("Copia modificada:", compra_lunes)

# update() incorpora pares de otro diccionario y actualiza claves repetidas.
datos = {'nombre': 'Sara', 'edad': 27}
datos.update({'edad': 28, 'ciudad': 'Madrid'})
print("Tras update():", datos)


# ==============================================================================
# 6. DICCIONARIOS ANIDADOS Y VALORES COMPUESTOS
# ==============================================================================
print("\n--- 6. DICCIONARIOS ANIDADOS Y VALORES COMPUESTOS ---")

persona = {
    'nombre': 'Marciano',
    'calificaciones': [7, 8, 9],
    'redes': {
        'twitter': '@marciano',
        'instagram': '@marciano'
    }
}
print("Tercera calificacion:", persona['calificaciones'][2])
print("Usuario de Instagram:", persona['redes']['instagram'])

# El diccionario puede modificarse y tambien los objetos mutables que contiene.
persona['calificaciones'][2] = 10
persona['redes']['facebook'] = 'marciano'
print("Persona actualizada:", persona)


# ==============================================================================
# 7. EJEMPLO PRACTICO: CESTA DE LA COMPRA
# ==============================================================================
print("\n--- 7. EJEMPLO PRACTICO: CESTA DE LA COMPRA ---")

cesta = {'manzanas': 2.50, 'peras': 2.34, 'tomates': 1.98}
total = 0

for articulo, precio in cesta.items():
    print(articulo, "cuesta", precio, "euros por kilo")
    total += precio

print("Suma de los precios por kilo:", round(total, 2), "euros")

# clear() elimina todos los pares del diccionario.
cesta.clear()
print("Cesta tras clear():", cesta)