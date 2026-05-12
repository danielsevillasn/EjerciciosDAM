#!/bin/bash
#Realizar un contador desde 0 hasta un número que te solicita el script
#Autores = Daniel Sevilla y Libio Basurto

echo "Dame un numero: "
read n
i=0

while [ $i -le $n ]
do
  echo "Contador: $i"
  i=$((i+1))
done
