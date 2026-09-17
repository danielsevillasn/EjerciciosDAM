list = ["Manzana","Platano","Naranja","Manzana", 6, True]

print(list[3]) #El primer valor es el indice 0
print(list[-1])
print(list[0:3]) #El indice 3 no esta incluido
print(list[-1:3]) #Como el indice -1 es 5 y es mayor que 3 entonces es un rango imposible de recorrer
print(list[-1:3:-1]) #El ultimo indice indica los pasos que tiene quedar para hacer el recorrido

if "Platano" in list:
    print("Hay un platano en la lista")

