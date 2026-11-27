###
# EJERCICIOS
# Usa los métodos que has aprendido
###

#Ejercicio 1 – Unión e intersección de conjuntos
#Dadas las asignaturas que cursan dos alumnos, muestra:
#Las asignaturas que cursan entre los dos (unión).
#Las asignaturas que tienen en común (intersección).
alumno1 = {"Matemáticas", "Lengua", "Historia"}
alumno2 = {"Inglés", "Lengua", "Ciencias"}

resultadoUnion = alumno1.union(alumno2) # alumno1 | alumno2
print(resultadoUnion)

resultadoInterseccion = alumno1.intersection(alumno2) # alumno1 & alumno2
print(resultadoInterseccion)


#Ejercicio 2 – Diferencia de conjuntos
#Un grupo de amigos fue al cine. Algunos compraron palomitas y otros no.
#Muestra qué amigos no compraron palomitas.
todos = {"Ana", "Luis", "Carlos", "Marta", "Sofía"}
palomitas = {"Luis", "Sofía"}

resultadoDiferencia = todos.difference(palomitas) # todos - palomitas
print(resultadoDiferencia)



#Ejercicio 3 – Comprobar subconjuntos y superconjuntos
#Determina si todos los empleados del turno de tarde también trabajan en el turno general.
turno_general = {"Juan", "Lucía", "Pedro", "María", "Andrés"}
turno_tarde = {"Pedro", "Lucía"}

if turno_tarde.issubset(turno_general):
    print("Todos los de tarde tambien van al general") # turno_tarde <= turno_general


#Ejercicio 4 – Diferencia simétrica
#Tienes dos listas de películas vistas por dos personas.
#Muestra las películas que solo ha visto una de ellas (pero no ambas).
juan = {"Avatar", "Titanic", "Matrix"}
maria = {"Matrix", "Inception", "Avatar 2"}
print(juan.symmetric_difference(maria)) # juan ^ maria


#Ejercicio 5 – Actualización de conjuntos
#Un conjunto pendientes contiene las tareas que faltan por hacer.
#Cuando se completan algunas, actualiza el conjunto eliminándolas.
pendientes = {"comprar pan", "hacer la cama", "leer", "pagar factura"}
hechas = {"hacer la cama", "leer"}

pendientes.difference_update(hechas) # Equivalente a: pendientes -= hechas
print(pendientes)