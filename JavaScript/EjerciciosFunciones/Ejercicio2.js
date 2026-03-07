function defCadena(cadena) {
    let longitud = cadena.length;
    let mayusculas = false;
    let minusculas = false;
    let caracter;
    for(let i = 0;i<longitud;i++){
        caracter = cadena.charAt(i);

        if(caracter == (caracter).toUpperCase()){
            mayusculas = true;
        }
        if(caracter == (caracter).toLowerCase()){
            minusculas = true;
        }
    }
    if(mayusculas && minusculas){
        alert("La cadena: "+cadena+" contiene mayusculas y minusculas");
    }
    else if(mayusculas){
        alert("La cadena: "+cadena+" contiene mayusculas");
    }
    else{
        alert("La cadena: "+cadena+" contiene minusculas");
    }
}

defCadena(prompt("Dame una cadena"));