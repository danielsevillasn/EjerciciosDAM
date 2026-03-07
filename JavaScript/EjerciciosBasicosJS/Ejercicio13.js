let nombre = prompt("Dame tu nombre");
let cantidad = prompt("Dime cuantas preguntas habian");
let correcto = prompt("Dime cuantas preguntas correctas has tenido");

let porcentaje = correcto*100/cantidad;
let preguntasMal = cantidad-correcto;
let suma = correcto+preguntasMal;
alert(preguntasMal);
alert(suma);

alert(nombre+" estas en el nivel...")
if(porcentaje>=90){
    alert("Nivel superior");
}else if(porcentaje>=75 && porcentaje<90){
    alert("Nivel medio");
}else if(porcentaje>=50 && porcentaje<75){
    alert("Nivel regular");
}else{
    alert("Fuera de nivel");
}