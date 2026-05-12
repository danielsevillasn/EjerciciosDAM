#!/bin/bash
#Realizar la tabla de multiplicar (hasta 10) de un número pasdo por parámetro
#Autores = Daniel Sevilla y Libio Basurto

for i in 1 2 3 4 5 6 7 8 9 10
do 
 echo "$1 x $i = $(($1 * $i))"
done
