let array = [];
let total = "";
let mayor = Number.MIN_VALUE;
let menor = Number.MAX_VALUE;
let limiteArray = 10;
for(let i = 0;i<limiteArray;i++){
    array[i] = Math.trunc(Math.random()*(10-1)+1);
    total += array[i]+ " ";
    if(array[i]>mayor){
        mayor = array[i];
    }
    if(array[i]<menor){
        menor = array[i];
    }
}
alert("Array: "+total);
alert("El valor maximo del array es: "+mayor);
alert("El valor mínimo del array es: "+menor);