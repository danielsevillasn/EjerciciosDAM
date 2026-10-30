#Parámetros por defecto
def saluda(nombre='amigo'):
    print('Hola', nombre)
saluda()  #'Hola amigo'
saluda('Antonio')  #'Hola Antonio'


#Parámetros indefinidos
"""
Un asterisco indica que puede recibir un número indefinido de parámetros posicionales 
y dos asteriscos indican que puede recibir un número indefinido de parámetros nombrados.
"""
def reserva(origen, destino, *viajeros, **detalles): 
    print(f'Se ha reservado el vuelo de {origen} {destino} para:')
    for viajero in viajeros:
        print(viajero)
    print('Con los siguientes detalles:')
    for k in detalles:
        print(k, ':', detalles[k])
reserva('Granada', 'México', 'Pedro', 'Juani', 'Luisa', comida='vegana', asientos='ventanilla', precio=350)