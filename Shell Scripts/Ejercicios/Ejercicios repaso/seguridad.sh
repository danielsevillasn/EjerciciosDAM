#!/bin/bash
#Script que recibe un nombre de archivo o directorio como parámetro
#Autor = Daniel S
existe=0

if [ $# -eq 0 ]; then
  echo "No se ha pasado ningun parametro"
fi

if [ -f $1 ]; then
  contador=0
  if [ -r $1 ]; then
    echo "El fichero tiene permisos de lectura"
    contador=1
  fi
  if [ -w $1 ]; then
    echo "El fichero tiene permisos de escritura"
    contador=1
  fi
  if [ $contador -eq 0 ]; then
    echo "No tiene permisos ni de lectura ni de escritura"
  fi
  existe=1
fi

if [ -d $1 ]; then
  ls | wc -l
  existe=1
fi

if [ $existe -eq 0 ]; then
  echo "No es ni fichero ni directorio"
fi
