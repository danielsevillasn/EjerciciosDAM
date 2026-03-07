let cadena1 = "Hola";
let array = cadena1.split("");
let aux = "";
let cadena2 = "";
do {
    aux = array[array.length - 1];
    for (let i = array.length - 1; i > 0; i--) {
        array[i] = array[i - 1];
    }
    array[0] = aux;
    cadena2 = array.join("");
    alert(cadena2);
} while (cadena1 !== cadena2);