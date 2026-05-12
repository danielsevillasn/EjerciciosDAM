#!/bin/bash
#Conversor de decimal a binario
#Autores = Daniel Sevilla y Libio Basurto

echo -n "Introduce un número decimal: "
read decimal

num=$decimal
binario=""

if [ $num -eq 0 ]; then
  binario="0"
else
  while [ $num -gt 0 ]
    do
      residuo=$((num % 2))
      binario="$residuo$binario"
      num=$((num / 2))
    done
fi

echo "El equivalente binario de $decimal es: $binario"
