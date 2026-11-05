nombres = ["Ana","Luis","Carlos","Marta","Eva"]
edades = [17,22,19,15,28]

suma_edades = 0
mayor_edad_numero = 0
mayor_edad_nombre = ""
mayores_edad = 0

print("Lista de personas: ")

for i in range(len(nombres)):
    print(nombres[i],"tiene",edades[i],"años")

    if edades[i] >= 18:
        mayores_edad +=1
    if edades[i] > mayor_edad_numero:
        mayor_edad_numero = edades[i]
        mayor_edad_nombre = nombres[i]
    suma_edades += edades[i]

print("*****Resumen*****")
print(f"Mayores de edad: {mayores_edad}")
print(f"La persona de mayor edad es {mayor_edad_nombre} con {mayor_edad_numero} años")
print(f"Edad media: {suma_edades/len(nombres)} años")