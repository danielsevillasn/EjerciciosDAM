#!/bin/bash
#Script que solicita dos numeros
#y muestra el más pequeño
echo -e "Dame dos numeros: \c"
read a b
if [ $a -gt $b ]; then
  echo "El numero más pequeño es $b"
elif [ $b -gt $a ]; then
  echo "El numero más pequeño es $a"
else
  echo "Los dos numeros son iguales"
fi 
