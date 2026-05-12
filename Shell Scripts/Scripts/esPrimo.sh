#!/bin/bash
#Script que solicita un nº y te indica si es par o impar

echo "Dame un numero: "
read n

if ($(n % 2)); then
  echo "El numero es primo"
else
  echo "El numero no es primo"
fi

