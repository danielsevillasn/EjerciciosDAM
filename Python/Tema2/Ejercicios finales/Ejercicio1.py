def definirValor():
    while True:
        try:
            n = int(input("Dame un numero: "))
            break;
        except ValueError:
            print("Tienen que ser numeros los valores")
    return(n)

while True:
    n1 = definirValor()
    n2 = definirValor()

    print("Opciones de operaciones: ")
    print("1. Suma")
    print("2. Resta")
    print("3. Multiplicacion")
    print("4. Division")
    opcion = input("Eliga una opcion(1-4):")

    operacionValida = True
    match opcion:
        case "1":
            operacion = n1+n2
        case "2":
            operacion = n1-n2
        case "3":
            operacion = n1*n2
        case "4":
            try:
                operacion = n1/n2
            except ZeroDivisionError:
                operacionValida = False
                print("No se puede dividir entre 0, da infinito")
    
    if operacionValida:
        print(operacion)
        

    respuesta = input("Quieres salir si o no(s/n):")
    if respuesta.lower == "s".lower:
        print("Saliendo...")
        break;
    


    
