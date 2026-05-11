#!/bin/bash
#Script que solicita dos números y muestra el más pequeño
#Autor = Daniel S

echo -n "Dame el primer numero: "
read n1
echo -n "Dame el segundo numero: "
read n2

if [ $n1 -gt $n2 ]; then
  echo "$n2 es el más pequeño"
elif [ $n2 -gt $n1 ]; then
  echo "$n1 es el más pequeño"
else
  echo "Ambos son iguales"
fi
