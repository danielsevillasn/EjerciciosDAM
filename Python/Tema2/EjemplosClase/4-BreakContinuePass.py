"""
break
Permite "romper" un bucle en cualquier momento, terminar las iteraciones y continuar después del mismo. Generalmente se usa break para 
abandonar un bucle while o for cuando se cumple cierta condición. 
"""
frutas = ["manzana", "banana", "cereza", "sandía", "uva"]
for fruta in frutas:
    print(fruta)
    if fruta == "sandía":
        break

"""
continue
Permite saltar a la siguiente iteración sin ejecutar el resto del bloque de código para esa iteración. Útil para omitir ciertos 
elementos en un bucle.
"""
numeros = [1, 2, 3, 4, 5]
for numero in numeros:
    if numero % 2 == 0:
        continue
print(numero)

"""
pass
No hace nada. Útil cuando necesitamos un bloque de código sintácticamente pero aún no hemos implementado su 
funcionalidad.
"""
if contador_clientes == 1000:
    pass # POR HACER: celebrar nuestro cliente número 1000


