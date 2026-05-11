#!/bin/bash
# Script decbin.sh: Conversor decimal a binario usando lógica de bucles
# Autor = Daniel S

echo -n "Introduce un número decimal: "
read decimal

# Si el número es 0, el binario es 0
if [ $decimal -eq 0 ]; then
  echo "El equivalente binario es: 0"
  exit 0
fi

binario=""
n=$decimal

# Algoritmo de divisiones sucesivas
while [ $n -gt 0 ]; do
  residuo=$(( n % 2 ))     # Obtenemos el resto (0 o 1)
  binario="$residuo$binario" # Lo pegamos a la IZQUIERDA de lo que ya tenemos
  n=$(( n / 2 ))            # Dividimos el número por 2
done

echo "El equivalente binario de $decimal es: $binario"
