#!/bin/bash
#Script que capaz de sumar una cantidad indeterminada de numeros pasados como parametros
#Autor = Daniel S
if [ $# -eq 0 ]; then
  echo "No has pasado ningun parametro"
fi

suma=0

while [ $# -gt 0 ]
do
  suma=$(( suma + $1))
  shift
done

echo "La suma de los parametros es de: $suma"
