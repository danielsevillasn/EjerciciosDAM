#!/bin/bash
echo -e "Escribe el nombre de un fichero: \c"
read pregunta
if [ -f $pregunta ]; then
  echo "$pregunta es un fichero"
elif [ -d $pregunta ]; then
  echo "$pregunta es un directorio"
else
  echo "$pregunta no es fichero ni directorio"
fi
