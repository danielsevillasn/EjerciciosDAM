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
media = media/limiteArray;
alert("La media de todos los elementos del array es: "+media);
let contador = 0;
let mayor = "";
for(let i = 0;i<limiteArray;i++){
    if(array[i]>media){
        contador++;
        mayor += array[i]+ " ";
    }
}
alert("Son "+contador+" numeros que tienen mayor valor que la media y son: "+mayor);