let cantidad = prompt("Dame la cantidad de articulos que quieres comprar");
let precio = prompt("Dame el precio del articulo");

if(isNaN(cantidad) && isNaN(precio)){
    alert("El comprador debera abonar: "+ (cantidad*precio));
}else{
    alert("Lo introducido no es valido");
}
