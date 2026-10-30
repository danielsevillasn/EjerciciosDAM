###
# 01 - Functions
# Permiten la reutilización del código
###

import os
import subprocess

# Comprobamos el tipo de sistema operativo
if os.name == "nt":
    # Si el sistema es Windows, usamos el comando 'cls'
    comando = "cls"
else:
    # Si es cualquier otro sistema (Mac o Linux), usamos 'clear'
    comando = "clear"

# Ejecuta el comando seleccionado en la terminal
subprocess.run(comando, shell=True)

#Escribir una función que muestre por pantalla el 
#saludo ¡Hola profe! cada vez que se la invoque.
def saludoProfe():
    print("¡Hola profe!")

saludoProfe()




#Escribir una función a la que se le pase una cadena <nombre> 
#y muestre por pantalla el saludo ¡hola <nombre>!.
def saludo(nombre: str) -> str:
    return f"Hola, {nombre}"
print(saludo("Pepe"))



#Escribir una función que reciba un número entero positivo y devuelva su factorial.
def factorial(x) -> int:
    if x == 0:
        return 1
    else:
        return x * factorial(x - 1)
print(f"El factorial es: {factorial(5)}")



#Escribir una función que calcule el total de una factura tras aplicarle el IVA. 
#La función debe recibir la cantidad sin IVA y el porcentaje de IVA a aplicar, 
#y devolver el total de la factura. Si se invoca la función sin pasarle 
# el porcentaje de IVA, deberá aplicar un 21%.





#Escribir una función que calcule el área de un círculo 
#y otra que calcule el volumen de un cilindro usando la primera función.





#Escribir una función que reciba una muestra de números en una lista y 
#devuelva otra lista con sus cuadrados.


