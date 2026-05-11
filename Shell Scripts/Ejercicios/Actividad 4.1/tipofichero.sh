#!/bin/bash
#Script que recibe un nombre de fichero por parametro y lo analiza
#Autor = Daniel S
nombreFichero=$1

if [ -e $nombreFichero ]; then
  echo "Existe el fichero"
fi

if [ -w $nombreFichero ]; then
  echo "El fichero es modificable"
fi

if [ -x $nombreFichero ]; then
  echo "El fichero es ejecutable"
fi
