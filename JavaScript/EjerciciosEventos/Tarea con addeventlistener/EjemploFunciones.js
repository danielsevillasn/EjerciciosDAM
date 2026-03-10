let boton = document.getElementById('btn');

boton.onclick = function(){
    alert("Ei");
}

boton.addEventListener("mousedown", function() {
    document.body.style.backgroundColor = "red";
});

boton.addEventListener("mouseup", function() {
    document.body.style.backgroundColor = "white";
});

let input = document.getElementById('nombre');
let parrafoSaludo = document.getElementById('parrafoSaludo');


input.addEventListener("keydown", function(evento){
    if (evento.key === "Enter") {
        input.style.width = "100px";

        let nombre = input.value;
        if (nombre !== "") {
            parrafoSaludo.textContent = "¡Hola, " + nombre + "!";
        } else {
            parrafoSaludo.textContent = "Por favor, escribe tu nombre.";
        }
    }
});

input.addEventListener("change", function(){
    input.style.width = "100%";
});

let image = document.getElementById("foto");
image.addEventListener("mouseenter", function(){
    image.src = "eieiei.jpg";
});
image.addEventListener("mouseleave", function(){
    image.src = "oioioi.jpg";
});

let boton1 = document.getElementById('btn1');

boton1.onclick = function(){
    alert("oi");
}

let boton2 = document.getElementById('btn2');

boton2.onclick = function(){
    document.body.style.backgroundColor = "red";
}