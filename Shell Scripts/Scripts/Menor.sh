#!/bin/bash
#Script que solicita dos números y muestra el más pequeño
#Autores= Daniel Sevilla y Libio Adrian

echo -n "Dame dos numeros: "
read n1 n2

if [ $n1 -lt $n2 ]; then
  echo "$n1 es mas pequeño que $n2"
elif [ $n2 -lt $n1 ]; then
  echo "$n2 es más pequeño que $n1"
else
  echo "Son iguales"
fi
