#!/bin/bash
#Script que solicita un nº y te indica si es par o impar
#Autores = Daniel Sevilla y Libio Basurto

echo -n "Dame un numero: "
read n

if [ $((n % 2)) -eq 0 ]; then
  echo "El numero es par"
else
  echo "El numero es impar"
fi

