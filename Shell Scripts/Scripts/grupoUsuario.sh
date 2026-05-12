#!/bin/bash
# Comprobar si existe el usuario y el grupo solicitado
# Autores = Daniel Sevilla y Libio Basurto

echo -n "Introduce el nombre de usuario a buscar: "
read usuario
echo -n "Introduce el nombre del grupo a buscar: "
read grupo

if grep -q "^$usuario:" /etc/passwd; then
    echo "El usuario '$usuario' existe en el sistema."
else
    echo "El usuario '$usuario' NO existe."
fi

if -q "^$grupo:" /etc/group; then
    echo "El grupo '$grupo' existe en el sistema."
else
    echo "El grupo '$grupo' NO existe."
fi
