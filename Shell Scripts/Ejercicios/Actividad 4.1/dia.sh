#!/bin/bash
#Script que comprueba si estamos a 21 de este mes
#Autor = Daniel S

diaDeHoy=$(date +%d)

if [ $diaDeHoy -eq 21 ]; then
  echo "21 de abril, la primavera esta aquí"
else
  echo "No estamos a 21"
fi

