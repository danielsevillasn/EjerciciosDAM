#!/bin/bash
#Comprueba si estamos a 21 de este mes, si es así mostrará el texto "21 de abril, la
#primavera está aquí"
#Autores = Daniel Sevilla y Libio Basurto

if [ $(date +%d) == "21" ]; then
 echo "21 de abril, la primavera está aquí"
else
 echo "Que pena, no estas a 21"
fi
