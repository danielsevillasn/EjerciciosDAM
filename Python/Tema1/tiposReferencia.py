"""
Los tipos referencia son aquellos cuyas variables almacenan una referencia 
(normalmente la dirección de memoria) al objeto real en lugar del valor real en sí mismo. 
Esto significa que cuando asignamos una variable a otra, ambas variables apuntan al mismo objeto en la memoria. 
Los tipos de referencia comunes incluyen listas, diccionarios, conjuntos y objetos personalizados
"""

#Asignación de una lista a una variable
lista1 = [1, 2, 3]

#lista2 apunta al mismo objeto en la memoria que lista1
lista2 = lista1

#Modificar lista2 también modifica lista1
lista2.append(4) 
print("lista1:", lista1) # Resultado: [1, 2, 3, 4] 

#En este ejemplo, cuando modificamos lista2, también se modifica lista1 porque ambas 
#variables apuntan al mismo objeto en la memoria.
print(lista1 is lista2)
print(id(lista1))
print(id(lista2))