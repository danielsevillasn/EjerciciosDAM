import random

def definirValor(entrada):
    while True:
        try:
            n = int(input(entrada))
            break;
        except ValueError:
            print("Tienen que ser numeros los valores")
    return(n)

n = random.randint(1,10)
adivinado = False
intentos = 1

while not adivinado:
    numeroAdivinado = definirValor("Adivina el valor, del 1 al 10: ")
    if numeroAdivinado == n:
        adivinado = True
    elif numeroAdivinado < n:
        intentos += 1
        print("El numero ingresado es menor, intentos:",intentos)
    else:
        intentos += 1
        print("El numero ingresado es mayor, intentos:",intentos)
print("Has adivinado en ",intentos,"intentos")