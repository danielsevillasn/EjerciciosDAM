#!/bin/bash
#Script que mediante un menu permite hacer modificaciones en un archivo lista
#Autores= Daniel Sevilla y Libio Calero

Lista="LISTA"
salir=0

while [ &salir -eq 0 ]
do
    echo "MENÚ LISTA"
    echo "1. Añadir registro"
    echo "2. Buscar entradas"
    echo "3. Listar todo"
    echo "4. Ordenar alfabéticamente"
    echo "5. Borrar archivo completo"
    echo "6. Salir"
    echo -n "Seleccione una opción: "
    read opcion

    case $opcion in
        1)
            echo -n "Nombre: "
            read nombre
            echo -n "Dirección: "
            read direccion
            echo -n "Teléfono: "
            read telefono
            echo "$nombre - $direccion - $telefono" >> $Lista
            echo "registro añadido"
            ;;
        2)
            echo -n "Introduce el término a buscar (nombre, dirección o teléfono): "
            read busqueda
            grep -i "$busqueda" $Lista
            if [ $? -ne 0 ]; then
                echo "No se encontraron coincidencias."
            fi
            ;;
        3)
            echo "--- CONTENIDO DE LA LISTA ---"
            if [ -e $Lista ]; then
                cat $Lista
            else
                echo "La lista no existe"
            fi
            ;;
        4)
            if [ -e $Lista ]; then
                sort $Lista -o $Lista
                echo "Archivo ordenado correctamente."
            else
                echo "No hay nada que ordenar."
            fi
            ;;
        5)
            if [ -e $Lista ]; then
                rm $Lista
                echo "Archivo LISTA borrado."
            else
                echo "El archivo no existe."
            fi
            ;;
        6)
            echo "Finalizando el programa..."
            salir=1
            ;;
        *)
            echo "Opción no válida, intente de nuevo."
            ;;
    esac
done
