#Declaración de variables
x = 5
y = 10
resul = 0

#Definición de función
def suma(a, b):
    # Bloque de código indentado
    resultado = a + b
    return resultado

#Estructura de control
if x < y:
    # Bloque de código indentado
    print("x es menor que y")
else:
    # Otro bloque indentado
    print("y es menor que x")

resul = suma(x, y)

print("el resultado de la suma es: " + str(resul))

vocales = {"a", "e", "i", "o", "u"}
es_a_vocal = "a" in vocales # True
no_es_y = "y" not in vocales # True

print(es_a_vocal)
print(no_es_y)