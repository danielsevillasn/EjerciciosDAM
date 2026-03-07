let array = [];
let total = "";
let limiteArray = 10;
for(let i = 0;i<limiteArray;i++){
    array[i] = Math.trunc(Math.random()*(10-1)+1);
    total += array[i]+ " ";
}
alert("Array: "+total);
let n = Number(prompt("Dime un numero que creas que este en el array: "));
let posN = "";
let contador = 0;
for(let i = 0;i<limiteArray;i++){
    if(n == array[i]){
        posN += i+" ";
        contador++;
    }
}
if(posN == ""){
    alert("No he encontrado tu numero en el array");
}else{
    alert("Tu numero si existe en el array y esta en la posicion: "+posN+"y ha salido un total de: "+contador+"veces");
}
