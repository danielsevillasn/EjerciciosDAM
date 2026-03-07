let array = [];
let total = "";
let limiteArray = 10;
let contadorNegativos = 0;
let contadorPositivos = 0;
let negativos = "";
let positivos = "";
for(let i = 0;i<limiteArray;i++){
    array[i] = Math.trunc(Math.random()*(10+10)-10);
    total += array[i]+ " ";
    if(array[i]<0){
        contadorNegativos++;
        negativos += array[i]+" ";
    }else{
        contadorPositivos++;
        positivos += array[i]+ " ";
    }
}
alert("Array: "+total);
alert("El array tiene "+contadorNegativos+" negativos y son: "+negativos);
alert("El array tiene "+contadorPositivos+" positivos y son: "+positivos);