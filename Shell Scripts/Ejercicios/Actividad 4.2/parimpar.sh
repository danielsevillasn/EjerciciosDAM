#!/bin/bash
#Script que solicita si un numero es par o impar
#Autor = Daniel S

echo -n "Dame un numero: "
read n

if [ $(( n % 2 )) -eq 0 ]; then
  echo "El numero es par"
else
  echo "El numero es impar"
fi
