class MiExcepcion(Exception): 
    def __init__(self, valor):
        self.valor = valor

    def __str__(self):
        return "Error: " + str(self.valor)

try:
    fin = False
    while not fin:
        entrada = input("Introduzca c para continuar o f para finalizar:")
        if entrada != "f" and entrada != "c":
            raise MiExcepcion(entrada + " no es un valor válido.")
        elif entrada == "f": 
            fin = True
except MiExcepcion as e:
    print (e)