#!/bin/bash
#Script que solicita que se pulse una tecla para ver que tecla a sido pulsada

echo -n "Pulsa una tecla: "
read tecla

case $tecla in
  [0-9])
    echo "Es un numero del 0 al 9"
    ;;
  [a-z])
    echo "Es una letra minúscula"
    ;;
  [A-Z])
    echo "Es una letra mayúcula"
    ;;
  *)
    echo "Es un caracter especial"
    ;;
esac

