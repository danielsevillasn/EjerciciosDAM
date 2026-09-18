"""
Los tipos valor en Python son aquellos cuyas variables almacenan directamente el valor real. 
Esto significa que cuando asignamos una variable a otro valor, se crea una nueva copia de ese valor en la memoria. 
Los tipos de valor más comunes en Python son los tipos básicos como enteros, flotantes, cadenas y booleanos. 
"""

#Asignación de un entero a una variable
x = 10

#Se crea una nueva copia del valor 10 en la memoria para la variable x
#Tanto x como y apuntan al mismo objeto en memoria (no se copia realmente, se comparte).
y = x
print(id(x))  
print(id(y))    #Comparten la misma posición en memoria
print(y is x)   #True

#Modificamos el valor de y, pero lo dejamos en 10
y = 10

#Curiosamente, sigue siendo True.
#Esto pasa porque en Python los enteros pequeños (de -5 a 256) están internamente cacheados (internados).
#Por eso, cada vez que usas 10, Python no crea un nuevo objeto, sino que reutiliza el mismo en memoria
print(id(x))
print(id(y))    #Siguen compartiendo la misma posición en memoria
print(y is x)   #True

#Cuando modificamos x o y, cada variable tiene su propio espacio en la memoria para almacenar su valor
#Ahora x e y tienen valores independientes en la memoria 
y = 9
print(id(x))
print(id(y))    #Ya no comparten la misma posición en memoria
print(y is x)   #False

#¿Qué pasa si creo una nueva variable con el valor 10?
z = 10
print(id(z))    #Comparte la misma posición en memoria que la variable x
print(z is x)   #True

"""
Conclusión:
-----------
En Python, los números enteros son inmutables → no se pueden cambiar, solo reasignar.
Cuando reasignas y, no cambias x, simplemente haces que y apunte a otro objeto.
Para enteros pequeños, Python reutiliza los mismos objetos en memoria para optimizar 
(por eso x = 10 y z = 10 son el mismo objeto).
"""