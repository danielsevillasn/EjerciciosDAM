#!/bin/bash
#Script que muestre un menu interactivo con diferentes opciones
#Autor = Daniel S

function quienSoy() {
  echo "Usuario actual: $USER | Directorio personal: $HOME"
}

function dondeEstoy() {
  echo "Ruta actual: $PWD | Nombre del equipo: $HOSTNAME"
}

function chequeoArchivo() {
  echo -n "Dame la ruta de un archivo: "
  read archivo
  if [ -f $archivo ]; then
    if [ -s $archivo ]; then
      echo "Archivo con contenido"
    else
      echo "Archivo sin contenido"
    fi
  else
    echo "El archivo no existe"
  fi
}

function salir() {
  echo "Saliendo..."
  exit
}

function menu() {
  echo "--Panel de control del sistema--"
  echo "1. ¿Quién soy?"
  echo "2. ¿Donde estoy?"
  echo "3. Chequeo archivo"
  echo "4. Salir"
  echo -n "Eliga una opcion(1-4): "
  read opcion

  case $opcion in
  1)
   quienSoy
   ;;
  2)
   dondeEstoy
   ;;
  3)
   chequeoArchivo
   ;;
  4)
   salir
   ;;
  *)
   echo "Opcion invalida"
   ;;
  esac
}

while true
do
  menu
done
