#!/bin/bash
#Script que solicita un número y si es mayor que 10 muestre un mensaje
#Autor = Daniel S

echo -n "Dame tu nota: "
read nota

if [ $nota -lt 0 ]; then
  echo "No puedes tener nota negativa"
  exit
fi

if [ $nota -gt 10 ]; then
  echo "Nota demasiado grande"
  exit
fi

echo "Nota normal"
