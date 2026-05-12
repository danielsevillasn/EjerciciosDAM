#!/bin/bash
#Script que pide dos números y comprueba si son divisibles o no
#Autores= Daniel Sevilla y Libio Calero
echo -n "Dame dos numeros: "
read n1 n2
contador=0

if [ $((n1 % n2)) -eq 0 ]; then
  echo "$n1 es divisible por $n2"
  contador=1
fi

if [ $((n2 % n1)) -eq 0 ]; then
  echo "$n2 es divisible por $n1"
  contador=1
fi

if [ $contador -ne 1 ]; then
  echo "ninguno de los dos es divisible"
fi

