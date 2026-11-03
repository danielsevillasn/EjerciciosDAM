###
# EJERCICIOS (exception)
###

# Ejercicio 1: División por cero
# Código: resultado = 10 / 0
# Tarea: Modifica este código para evitar que el programa se bloquee. Usa un bloque try-except para capturar 
# el error ZeroDivisionError y muestra un mensaje indicando que no se puede dividir por cero.
print("\nEjercicio 1:")
try:
    resultado = 10 / 0
except ZeroDivisionError:
    print("No se puede dividir entre 0")


# Ejercicio 2: Acceso a índice de lista fuera de rango Código.
# lista = [1, 2, 3, 4, 5]
# lista[10]
#Usa un bloque try-except para capturar el error IndexError y muestra un mensaje al usuario indicando 
# que el índice está fuera del rango de la lista.
print("\nEjercicio 2:")
try:
    lista = [1, 2, 3, 4, 5]
    elemento = lista[10]
except IndexError:
    print("El índice es incorrecto")
    


# Ejercicio 3: Acceso a clave de diccionario inexistente Código.
# colores = { 'rojo':'red', 'verde':'green', 'negro':'black' }
# colores['blanco']
#  Utiliza un bloque try-except para manejar la excepción KeyError que 
# se produce al intentar acceder a la clave 'blanco', y muestra un mensaje de error apropiado.
print("\nEjercicio 3:")
try:
    colores = { 'rojo':'red', 'verde':'green', 'negro':'black' }
    colores['blanco']
except KeyError:
    print("No existe la clave seleccionada")


# Error de tipo de dato
# resultado = 15 + "20"
# Escribe un bloque try-except para manejar el TypeError que ocurre al intentar sumar un entero con una cadena.
print("\nEjercicio 4:")
try:
    resultado = 15 + "20"
except TypeError:
    print("No se puede concatenar un entero y un string")


# Ejercicio 5: Validación de entrada con bucle 
# Crea un bucle while que solicite repetidamente al usuario que ingrese un número. 
# Utiliza un bloque try-except para capturar ValueError si el usuario ingresa algo que no es un número. 
# El bucle debe continuar hasta que se ingrese un valor válido.
print("\nEjercicio 5:")
while True:
    try:
        input("Dame un numero: ")
        break
    except ValueError:
        print("Tienes que ingresar un numero, no un carácter")


# Ejercicio 6: Función que calcula la raíz cuadrada 
# Escribe una función llamada calcular_raiz_cuadrada que reciba un número. 
# Dentro de la función, usa try-except para manejar dos posibles errores:
# - ValueError: Si el usuario intenta calcular la raíz cuadrada de un valor no numérico.
# - ZeroDivisionError: Si el usuario intenta calcular la raíz cuadrada de un número negativo 
#   (puedes simular esto pidiendo un número negativo y luego intentando calcular la raíz cuadrada).
# La función debe imprimir un mensaje de error o el resultado correcto si no hay ningún error.
print("\nEjercicio 6:")
import math
def calcular_raiz_cuadrada(numero):
    try:
        n = float(numero)
        if n < 0:
            raise ZeroDivisionError("No se puede hacer la raíz cuadrada de un negativo")
        print("La raiz cuadrada es",math.sqrt(n))
    except ValueError as ve:
        print(ve)
    except ZeroDivisionError as zde:
        print(zde)

n = input("Dame un numero:")
calcular_raiz_cuadrada(n)
