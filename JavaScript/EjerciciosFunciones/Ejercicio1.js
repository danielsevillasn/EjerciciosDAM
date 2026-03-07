function esPar(n) {
    if(n % 2 == 0){
        alert("El numero "+n+" es par");
    }else{
        alert("El numero "+n+" es impar");
    }
}
esPar(prompt("Dame un numero entero: "));