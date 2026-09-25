try:
    num = int(input("Introduce un número: "))
    match num:
        case 0:
            print("El número es un cero")
        case num if num % 2 == 0:
            print("El número es par")
        case _:
    # Simplificado: si no es cero ni par, obligatoriamente es impar
            print("El número es impar")

except ValueError:
# Este bloque se activa solo si la conversión a int() falla
    print("Error: No has introducido un número entero válido.")