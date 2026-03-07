let nombre = prompt("Dame tu nombre con tus apellidos: ");
let array = nombre.split(" ");
let arrayNombre = array[0].split("");
let arrayApellido1 = array[1].split("");
let arrayApellido2 = array[2].split("");

let opcion1 = arrayNombre[0]+arrayNombre[1]+arrayNombre[2];
let opcion2 = arrayApellido1[0]+arrayApellido1[1]+arrayApellido1[2];
let opcion3 = arrayApellido2[0]+arrayApellido2[1]+arrayApellido2[2];
let opcionTotal = opcion1+opcion2+opcion3;
opcionTotal = opcionTotal.toUpperCase();

let iniciales = arrayNombre[0]+arrayApellido1[0]+arrayApellido2[0];

alert(opcionTotal);
alert(iniciales);
