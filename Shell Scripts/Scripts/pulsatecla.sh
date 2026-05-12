#!/bin/bash
#Solicita que se pulse una tecla y te debe indicar si has introducido
#una letra (mayúsculas o minúscula) o un número
#Autores = Daniel Sevilla y Libio Basurto
echo "Pulse una tecla"
read tecla

case $tecla in
    [0-9])
        echo "Has introducido un número"
        ;;
    [a-z])
        echo "Has introducido una letra minúscula"
        ;;
    [A-Z])
	echo "Has introducido una letra mayúscula"
	;;
    *)
        echo "Has introducido otro carácter"
        ;;
esac
