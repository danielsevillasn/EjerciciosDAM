"""
if condicion:
bloque de código si la condición es verdadera
"""
numero = 15
if numero > 10:
    print("El número es mayor que 10")

"""
if condicion:
# bloque de código si la condición es  
verdadera
else:
# bloque de código si la condición es 
falsa
"""
numero = 5
if numero > 10:
    print("El número es mayor que 10")
else:
    print("El número es menor o igual a 10")

"""
if condicion_1:
# bloque de código si la condicion_1 
es verdadera
elif condicion_2:
# bloque de código si la condicion_1 
es falsa y la condicion_2 es 
verdadera
else:
# bloque de código si todas las 
condiciones anteriores son falsas
"""

numero = 5
if numero > 0:
    print("El número es positivo")
elif numero < 0:
    print("El número es negativo")
else:
    print("El número es cero")

"""
and: Retorna True si ambas condiciones son verdaderas.
or: Retorna True si al menos una de las condiciones es verdadera.
not: Retorna True si la condición es falsa
"""