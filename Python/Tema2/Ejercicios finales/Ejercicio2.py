def definirValor():
    while True:
        try:
            n = int(input("Dame un numero entero positivo: "))
            if n < 1:
                print("El numero ha de ser mayor o igual que 1")
            else:
                break;
                
        except ValueError:
            print("Tienen que ser numeros los valores")
    return(n)
try:
    print(definirValor())
except KeyboardInterrupt:
    print("\nPrograma finalizado")