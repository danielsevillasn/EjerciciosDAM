let array = [];
let total = "";
let limiteArray = 10;
for(let i = 0;i<limiteArray;i++){
    array[i] = Math.trunc(Math.random()*(10-1)+1);
    total += array[i]+ " ";
}
alert("Array inicial: "+total);

let arrayInverso = array.reverse();
let totalInverso = "";
for(let i = 0;i<limiteArray;i++){
    totalInverso += arrayInverso[i]+ " ";
}
alert("Array inverso: "+totalInverso);

