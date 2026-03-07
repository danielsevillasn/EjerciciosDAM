let letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'];
let numerosDNI = Number(prompt("Dime los numeros de tu DNI"));
let letraDNI1 = prompt("Dime la letra de tu DNI");
let letraDNI2 = letras[numerosDNI %23];
if(numerosDNI<0 || numerosDNI>99999999 || isNaN(numerosDNI) || !isNaN(letraDNI1)){
    alert("Lo proporcionado no es válido");
}else{
    if(letraDNI1==letraDNI2){
        alert("El número y la letra de DNI son correctos. ");
    }else{
        alert("la letra que ha indicado no es correcta");
    }
}