#!/bin/bash
#Script que contiene un menu para gestionar un archivo lista
#Autor = Daniel S
nombreArchivo=LISTA.txt

function añadir() {
  echo -n "Dame un nombre: "
  read nombre
  echo -n "Dame una direccion: "
  read direccion
  echo -n "Dame un telefono: "
  read telefono
  echo "Nombre = $nombre | Direccion = $direccion | Telefono = $telefono" >> $nombreArchivo
}

function buscar() {
  echo -n "Busca en lista (nombre o direccion o telefono): "
  read buscar
  grep -i $buscar $nombreArchivo
}

function listar() {
  cat $nombreArchivo
}

function ordenar() {
  sort -o $nombreArchivo $nombreArchivo
}

function eliminar() {
  rm $nombreArchivo
}

function menu() {
  echo "--Menu $nombreArchivo--"
  echo "1. Añadir un registro"
  echo "2. Buscar un registro"
  echo "3. Listar el archivo"
  echo "4. Ordenar archivo"
  echo "5. Borrar archivo"
  echo "6. Salir"
  echo -n "Eliga una opcion(1-6): "
  read opcion

  case $opcion in
    1)
       añadir
       ;;
    2)
       buscar
       ;;
    3)
       listar
       ;;
    4)
       ordenar
       ;;
    5)
       eliminar
       ;;
    6)
       exit
       ;;
    *)
       echo "Opcion incorrecta"
       ;;
  esac
}

while true 
do
  menu
done
