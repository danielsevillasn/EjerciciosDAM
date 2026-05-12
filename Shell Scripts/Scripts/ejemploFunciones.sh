#!/bin/bash
echo "Número de parámetros: $#"
while [ $# -ne 0 ]
do
 echo $1
 shift
done
