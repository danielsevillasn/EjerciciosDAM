#!/bin/bash
#Script que juega con el archivo nombres.txt
#Autor = Daniel S

echo -n "Introduzca el nombre del fichero a ordenar: "
read nombreFichero

if [ -f $nombreFichero ]; then
  echo "Alumnos ordenados por edad: "
  sort -t '%' -k4 -n $nombreFichero

  echo ""
  echo -n "Edad Marta: "
  grep "Marta" $nombreFichero | cut -d '%' -f4
else
  echo "El fichero a ordenar no existe"
fi
