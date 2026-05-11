#!/bin/bash
#Script que muestra un pequeño menú y usa funciones para organizar las tareas
#Autores= Daniel Sevilla y Libio Basurto

function saludar() {
  echo "Holaaa $1"
}

function mostrarFecha() {
  echo "La fecha a dia de hoy es: $(date)"
}

function usoDisco() {
  echo "Uso de disco: "
  df -h
}

function saltoLinea() {
  echo -e "\n\n\n\n"
}


salir=0

function menu() {
  echo "===MENÚ==="
  echo "1. Saludar"
  echo "2. Mostrar fecha"
  echo "3. Uso de disco"
  echo "4. Salir"
  echo -n "Elige una opcion(1-4): "
  read opcion

  case $opcion in
    1)
      saltoLinea
      echo -n "Dame tu nombre: "
      read nombre
      saludar $nombre
      ;;
    2)
      saltoLinea
      mostrarFecha
      ;;
    3)
      saltoLinea
      usoDisco
      ;;
    4)
      echo "Saliendo..."
      salir=1
      ;;
    *)
      echo "Opción invalida"
      ;;
  esac
saltoLinea
}

while  [ $salir -eq 0 ];
do
  menu
done
