let frase = "Tengo una hormiguita en la patita que me esta haciendo cosquillitas y no me puedo aguantar";
alert(frase);
let array = frase.split(" ");
let mayor= "a";
for(let i = 0;i<array.length;i++){
    if(array[i].length>mayor.length){
        mayor = array[i];
    }
}
alert(mayor);