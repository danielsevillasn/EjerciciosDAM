#!/bin/bash
#Scrip que solicita un número y si es mayo que 10 muestra un mensaje
#Autores= Daniel Sevilla y Libio Calero

echo -n "Dame tu nota: "
read n

if [ $n -gt 10 ]; then
  echo "Nota demasiado grande"
elif [ $n -lt 0 ]; then
  echo "Nota negativa"
else
  echo "Nota normal"
fi
