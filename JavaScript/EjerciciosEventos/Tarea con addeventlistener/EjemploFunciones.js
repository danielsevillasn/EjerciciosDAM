// ============================================================
// BOTÓN PRINCIPAL — Alerta al hacer click + fondo rojo al pulsar
// ============================================================

let boton = document.getElementById('btn');

// Click simple: muestra una alerta con el mensaje "Ei"
boton.onclick = function(){
    alert("Ei");
}

// mousedown: se dispara en el momento que se PRESIONA el botón (antes de soltar)
// → pone el fondo de la página en rojo mientras el botón está pulsado
boton.addEventListener("mousedown", function() {
    document.body.style.backgroundColor = "red";
});

// mouseup: se dispara cuando se SUELTA el botón
// → restaura el fondo blanco al soltar
boton.addEventListener("mouseup", function() {
    document.body.style.backgroundColor = "white";
});


// ============================================================
// INPUT DE NOMBRE — Saludo personalizado al pulsar Enter
// ============================================================

let input = document.getElementById('nombre');           // Campo de texto
let parrafoSaludo = document.getElementById('parrafoSaludo'); // Párrafo donde aparece el saludo

// keydown: se ejecuta cada vez que el usuario pulsa una tecla dentro del input
input.addEventListener("keydown", function(evento){

    // Solo actuamos si la tecla pulsada es Enter
    if (evento.key === "Enter") {

        input.style.width = "100px"; // Reducimos el ancho del input visualmente al confirmar

        let nombre = input.value; // Leemos el texto que hay en el campo

        if (nombre !== "") {
            // Si hay texto, mostramos el saludo personalizado
            parrafoSaludo.textContent = "¡Hola, " + nombre + "!";
        } else {
            // Si el campo está vacío, pedimos que escriba el nombre
            parrafoSaludo.textContent = "Por favor, escribe tu nombre.";
        }
    }
});

// change: se dispara cuando el input pierde el foco y su valor ha cambiado
// → restaura el ancho completo del input (deshace el efecto del Enter)
input.addEventListener("change", function(){
    input.style.width = "100%";
});


// ============================================================
// IMAGEN — Cambio de imagen al pasar el ratón por encima
// ============================================================

let image = document.getElementById("foto");

// mouseenter: el cursor ENTRA en la imagen → cambia a la imagen alternativa
image.addEventListener("mouseenter", function(){
    image.src = "eieiei.jpg";
});

// mouseleave: el cursor SALE de la imagen → vuelve a la imagen original
image.addEventListener("mouseleave", function(){
    image.src = "oioioi.jpg";
});


// ============================================================
// BOTÓN 1 — Alerta simple al hacer click
// ============================================================

let boton1 = document.getElementById('btn1');

// Click: muestra una alerta con el mensaje "oi"
boton1.onclick = function(){
    alert("oi");
}


// ============================================================
// BOTÓN 2 — Cambia el fondo de la página a rojo al hacer click
// ============================================================

let boton2 = document.getElementById('btn2');

// Click: aplica fondo rojo a todo el body de la página
boton2.onclick = function(){
    document.body.style.backgroundColor = "red";
}