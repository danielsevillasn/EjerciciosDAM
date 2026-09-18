list = ["Manzana","Platano","Naranja","Manzana", 6, True]
list2 = (3,10)

list.insert(1, "Sandía") #Inserta donde tu quieras un valor sin eliminar al otro
print(list)

list.append(6) #Añade al final de la lista el valor
print(list)

list.extend(list2) #Extiende la lista con otro objeto iterable de cualquier tipo
print(list)

list.remove(6) #Solo elimina un objeto del mismo valor, no todos
print(list)

list.pop(0) #Elimina el objeto del indice que quieras y los pone en orden
print(list)

del list2
#print(list2) este print no funcionaria ya que se ha eliminado este objeto

list.clear
print(list) #No imprime nada ya que la lista esta vacia pero no eliminada

