try:
# Código que puede fallar
    resultado = 10 / 0
except ZeroDivisionError:
# Manejo específico del error
    print("Error: División por cero")
except Exception as e:
# Manejo genérico
    print(f"Error inesperado: {e}")

"""
[instrucciones]
except <tipo de la excepción>: 
[instrucciones si ocurre esa excepción]
else:
[instrucciones si no ocurre ninguna excepción]
finally:
[instrucciones ocurran o no excepciones
"""

try:
    archivo = open("resultado.txt", "w") 
# Suponemos que el archivo existe
    print("Archivo resultado.txt abierto.") 
    resultado = 15 * (3/0)
except IOError:
# Instrucciones si ocurre la excepción IOError
    print("Error de entrada/salida.")
except ZeroDivisionError:
# Instrucciones si ocurre la excepción
    ZeroDivisionError
    print("Error división por cero.")
else:
    # Instrucciones si no ocurre ninguna excepción 
    print("El resultado de la división es", resultado) 
    archivo.write(resultado)
finally:
# Instrucciones si ocurren o no ocurren excepciones
    if not(archivo.closed): 
        archivo.close()
    print("Archivo resultado.txt cerrado.")