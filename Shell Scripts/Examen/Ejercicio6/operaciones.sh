#!/bin/bash
#Script que valida parametros y muestra un menu con diferentes opciones
#Autor = Daniel S

#Listado funciones
function validarParametros() {
  if [ $# -lt 2 ]; then
    echo "Tienen que ser al menos dos parametros"
    exit
  fi
  for i in "$@"; do
    if [[ ! "$i" =~ ^[0-9]+$ ]]; then
      echo "Los parametros no son numeros"
      exit
    fi
  done
}

function sumar() {
  suma=0
  while [ $# -gt 0 ]
  do
    suma=$(( suma + $1 ))
    shift
  done
  echo "La suma de los parametros es de: $suma"
}

function multiplicar() {
  multiplicacion=1
  while [ $# -gt 0 ]
  do
    multiplicacion=$(( multiplicacion * $1 ))
    shift
  done
  echo "La multiplicacion de los parametros es de: $multiplicacion"

}

function listadoProcesos() {
  nombreArchivo=listadoProcesos.txt
  ps -e > $nombreArchivo
  echo "Listado de procesos guardado en $nombreArchivo"
}
function mostrarMenu() {
  echo "--MENU--"
  echo "1. Sumar todos los números"
  echo "2. Multiplicar todos los números"
  echo "3. Listado de procesos en ejecución"
  echo "4. Salir"
  echo -n "Eliga opcion(1-4): "
  read opcion
  case $opcion in
  1)
    sumar "$@"
    ;;
  2)
    multiplicar "$@"
    ;;
  3)
    listadoProcesos
    ;;
  4)
    echo "Saliendo..."
    exit
    ;;
  *)
    echo "Opcion invalida, intenta de nuevo"
    ;;
  esac
}

#La funcion principal

validarParametros "$@"
while true
do
  mostrarMenu "$@"
done
