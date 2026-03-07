let array = [];
let total = "";
let limiteArray = 3;
for(let i = 0;i<limiteArray;i++){
    array[i] = Math.trunc(Math.random()*(10-1)+1);
    total += array[i]+ " ";
}
alert("Array: "+total);
let menor = true;
for(let i = 0;i<limiteArray-1;i++){
    if(array[i]>array[i+1]){
        menor = false;
    }
}
if(!menor){
    alert("El array no esta ordenado de menor a mayor");
}else{
    alert("El array esta ordenado de menor a mayor");
}