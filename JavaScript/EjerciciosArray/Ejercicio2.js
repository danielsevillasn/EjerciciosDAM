let array = [];
let total = "";
let media = 0;
let limiteArray = 10;
for(let i = 0;i<limiteArray;i++){
    array[i] = Math.trunc(Math.random()*(10-1)+1);
    total += array[i]+ " ";
    media += array[i];
}
alert("Array: "+total);
media = media/10;
alert("La media de todos los elementos del array es: "+media);