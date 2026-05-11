#!/bin/bash
#Script que pide dos números y comprueba si son divisibles
#Autor = Daniel S

echo -n "Dame dos numeros: "
read n1 n2
contador=0

if [ $(( n1 % n2 )) -eq 0 ]; then
  echo "n2 es divisible entre n1"
  contador=1
fi

if [ $(( n2 % n1 )) -eq 0 ]; then
  echo "n1 es divisible entre n2"
  contador=1
fi

if [ $contador -eq 0 ]; then
  echo "No son divisibles"
fi
