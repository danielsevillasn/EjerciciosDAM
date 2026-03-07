function esPalíndromo(cadena){
    cadena = cadena.toLowerCase().replace(/[^a-z]/g, "");;
    let array1 = cadena.split("");
    let array2 = [];
    let longitud = array1.length;
    let contador = 0;
    for(let i = longitud-1;i>=0;i--){
        array2[contador] = array1[i];
        contador++;
    }
    let cadena2 = array2.join("");
    if(cadena == cadena2){
        alert("La cadena de texto: "+cadena+" es palíndromo");
    }else{
        alert("La cadena de texto: "+cadena+" no es palíndromo");
    }
}

esPalíndromo(prompt("Dame una cadena de texto: "));