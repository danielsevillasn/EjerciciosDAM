def numeros_infinitos():
    print("Introduce números uno por uno. Escribe \"fin\" para terminar")
    numeros = []
    while True:
        numero = input("Número: ")
        if numero.lower() == "fin":
            break
        else:
            numeros.append(float(numero))
    return numeros, numero_mayor(numeros), numero_menor(numeros)

def numero_mayor(numeros: list) -> float:
    mayor = 0
    for numero in numeros:
        if numero > mayor:
            mayor = numero
    return mayor

def numero_menor(numeros: list) -> float:
    menor = 999999
    for numero in numeros:
        if numero < menor:
            menor = numero
    return menor

def promedio_numeros(numeros: list) -> float:
    suma = 0
    for numero in numeros:
        suma += numero
    return suma / len(numeros) if len(numeros) > 0 else 0

# Código principal
lista, mayor, menor = numeros_infinitos()
promedio = promedio_numeros(lista)

print("Lista de números:", lista)
print("Mayor:", mayor)
print("Menor:", menor)
print("Promedio:", promedio)