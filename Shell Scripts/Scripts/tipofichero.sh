#!/bin/bash
#Recibe un nombre de fichero por parámetro e indica si el fichero es legible, modificable
#o ejecutable por el usuario
#Autores = Daniel Sevilla y Libio Basurto

if [ -e $1 ]; then
 if [ -r $1 ]; then
  echo "Es legible"
 fi

 if [ -w $1 ]; then
  echo "Es modificable"
 fi

 if [ -x $1 ]; then
  echo "Es ejecutable"
 fi

else 
    echo "El fichero o ruta introducida no existe"
fi
