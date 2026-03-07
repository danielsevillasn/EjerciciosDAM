let cadena1 = "Hola me llamo Pepe Hola";
let cadena2 = "Hola me llamo Pepe";
let palabraInicio1= cadena1.split(" ");
let palabraInicio2= cadena2.split(" ");
alert("La frase "+cadena1);
if(palabraInicio1[0] ==palabraInicio1[palabraInicio1.length-1]){
    alert("Empieza y acaba con la misma palabra");
}else{
    alert("Empieza y acaba con distintas palabras")
}
alert("La frase "+cadena2);
if(palabraInicio2[0] ==palabraInicio2[palabraInicio2.length]){
    alert("Empieza y acaba con la misma palabra");
}else{
    alert("Empieza y acaba con distintas palabras")
}