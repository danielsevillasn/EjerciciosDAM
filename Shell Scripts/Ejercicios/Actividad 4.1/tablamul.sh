#!/bin/bash
#Script que realiza la tabla de multiplicar hasta 10 de un numero pasado por parametro
#Autor = Daniel S

echo "-Tabla multiplicar del $1-"

for i in $(seq 10); do
  multiplicacion=$(( $i * $1 ))
  echo "-$i x $1 = $multiplicacion"
done
