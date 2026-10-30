def definirValor(entrada):
    while True:
        try:
            n = int(input(entrada))
            break;
        except ValueError:
            print("Tienen que ser numeros los valores")
    return(n)

saldoInicial = definirValor("Dame tu saldo inicial:")
objetivoAhorro = definirValor("Dame tu objetivo a ahorrar: ")
ahorroMes = definirValor("Dame tu ahorro cada mes: ")

for i in range(1,12):
    if saldoInicial >= objetivoAhorro:
        print("Has superado tus",objetivoAhorro,"!!! con:",saldoInicial,"euros")
        break
    else:
        saldoInicial += ahorroMes
        print("Dia",i,":",saldoInicial)
