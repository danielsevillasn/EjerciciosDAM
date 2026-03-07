let n = prompt("Dame un numero entero");
let factorial = 1;
for (let i = n;i>0;i--){
    factorial *= i
}
alert("El factorial del numero es:"+ factorial);