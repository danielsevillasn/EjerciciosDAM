# Ejemplo de TypeError
mensaje = '6' + 17 # Error: no se puede concatenar str y int
# Solución 1
mensaje = '6' + str(17) # Correcto: ambos son strings
# Solución 2
try:    
    numero = int("abc")
except ValueError as e:
    print(f"Error de valor: {e}")

#Ejemplo ZeroDivisionError
result = 21/0
#Solución
try:
    resultado = 21/0
except ZeroDivisionError as e:
    print(f"Error de división por cero: {e}")

#Ejemplo FileNotFoundError
f = open("fichero.txt", "r")
#Solución
try:
    with open('archivo_que_no_existe.txt', 'r') as archivo:
        contenido = archivo.read()
except FileNotFoundError as e:
    print(f"Archivo no encontrado: {e}")

#Ejemplo ValueError
try:    
    numero = int("abc")
except ValueError as e:
    print(f"Error de valor: {e}")

#Ejemplo AtributeError
cadena = "Programación en Python"
cadena.get(i)
#Solucion
try:
    print(variable_no_definida)
except NameError as e:
    print(f"Nombre de variable no encontrado: {e}")

"""
SystemError: Se lanza cuando se detecta un error interno en Python

KeyboardInterrupt: Se lanza cuando se interrumpe la ejecución del 
programa mediante la entrada del usuario (por ejemplo, Ctrl+C)
"""

