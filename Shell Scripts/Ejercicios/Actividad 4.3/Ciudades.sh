#!/bin/bash
#Script que muestra un menu con diferentes opciones
#Autores= Daniel Sevilla y Libio Basurto

fichero="ciudades_espana.txt"

if [ ! -f "$fichero" ]; then
    echo "Error: El fichero $fichero no existe."
    exit 1
fi

while true
do
  echo "---Menu---"
  echo "1. Mostrar el contenido del fichero por orden alfabético de ciudades"
  echo "2. Obtener la temperatura de la ciudad que se indique"
  echo "3. Mostrar el contenido del fichero ordenado por habitantes de forma decreciente, sin la temperatura"
  echo "4. Salir"
  echo -n "Eliga una opcion(1-4): "
  read opcion

  case $opcion in
    1)
      echo "Ciudades ordenadas alfabéticamente:"
      tr ' ' '\n' < "$fichero" | grep . | sort -t'%' -k1
      ;;
    2)
      read -p "Introduce el nombre de la ciudad: " ciudad
      resultado=$(tr ' ' '\n' < "$fichero" | grep -i "^$ciudad%")

      if [ -z "$resultado" ]; then
        echo "Ciudad no encontrada"
      else
        temp=$(echo "$resultado" | cut -d'%' -f3)
        echo "Temperatura de $ciudad: $temp ºC"
      fi
      ;;
    3)
      echo "Ciudades ordenadas por habitantes (descendente):"
      tr ' ' '\n' < "$fichero" | grep . | sort -t'%' -k2 -nr | cut -d'%' -f1,2
      ;;
    4)
      echo "Saliendo..."
      exit 0
      ;;
    *)
      echo "Opción invalida"
      ;;
  esac
done
