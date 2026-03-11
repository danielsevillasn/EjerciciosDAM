//Ejercicio 1 — Ofertas del restaurante

const imgOferta = document.getElementById("imgOferta");
const btnOfertas = document.getElementById("btnOfertas");
const ofertaContenido = document.getElementById("ofertaContenido");
const textoDinamico = document.createElement("p");
textoDinamico.textContent = "Oferta exclusiva 8 euros"

let botonPulsado = false;

function toggleImagen() {
    if (!botonPulsado) {
        imgOferta.classList.toggle("oculta");
        btnOfertas.textContent = "Mostrar imagen";
        ofertaContenido.appendChild(textoDinamico);
        botonPulsado = true;
    } else {
        imgOferta.classList.toggle("oculta");
        ofertaContenido.removeChild(textoDinamico);
        btnOfertas.textContent = "Descubre nuestras ofertas";
        botonPulsado = false;
    }
}

btnOfertas.addEventListener("click", toggleImagen);

//Ejercicio 2 — Ubicación del restaurante

// Al pasar el ratón sobre la foto, cambia la imagen por otra alternativa
const imagenRestaurante = document.getElementById("imagenRestaurante");
const enlaceUbicacion = document.getElementById("enlaceUbicacion");
const enlace = document.createElement("a");
enlace.textContent = "Ver ubicación del restaurante en Google Map";
enlace.href = "enlace.html";
enlace.target = "_blank";

function incluirEnlaceUbicación() {
    enlaceUbicacion.parentElement.appendChild(enlace);
}

function quitarEnlaceUbicación() {
    enlaceUbicacion.parentElement.removeChild(enlace);
}

imagenRestaurante.addEventListener("mouseover", incluirEnlaceUbicación);
enlace.addEventListener("click", quitarEnlaceUbicación);

//Ejercicio 3. Formulario de reserva

//Apartado A y B

const formReserva = document.getElementById("formReserva");
const nombre = document.getElementById("nombre");
const plazasDisponibles = document.getElementById("plazasDisponibles");
const personas = document.getElementById("personas");
const reserva = document.getElementById("reserva");       // Select con el curso elegido
const mensajeReserva = document.getElementById("mensajeReserva");
const listaReservas = document.getElementById("listaReservas");

let nReservas = 1;
let plazas = 30;
let sePuedeReservar = true;

function validarFormulario(e) {
    e.preventDefault();
    mensajeReserva.textContent = ""; // Limpiamos cualquier mensaje previo


    // Validación: ambos campos deben estar rellenos
    if(nombre.value.trim() === "" && personas.value <= 0){
        mensajeReserva.textContent = "Debes rellenar el nombre de la reserva y no pueden haber menos de 1 persona en la reserva";
        mensajeReserva.style.color = "red";
        return; // Salimos sin hacer nada más
    }
    if (nombre.value.trim() === "") {
        mensajeReserva.textContent = "Debes rellenar el nombre de la reserva";
        mensajeReserva.style.color = "red";
        return; // Salimos sin hacer nada más
    }

    if (personas.value <= 0) {
        mensajeReserva.textContent = "No pueden haber menos de 1 persona en la reserva";
        mensajeReserva.style.color = "red";
        return; // Salimos sin hacer nada más
    }

    if ((plazas - personas.value) < 0) {
        sePuedeReservar = false;
        mensajeReserva.textContent = "La reserva sobrepasa el limite de personas";
        mensajeReserva.style.color = "red";
        return; // Salimos sin hacer nada más
    } else {
        sePuedeReservar = true;
        plazas = plazas - personas.value;
    }

    plazasDisponibles.textContent = "Plazas disponibles: " + plazas;

    if (sePuedeReservar) {
        const nuevoReserva = document.createElement("li");
        const btnEliminar = document.createElement("button");
        btnEliminar.type = "button";       // Evita que el botón envíe el formulario
        btnEliminar.textContent = "Eliminar";
        btnEliminar.className = "botonEliminar";

        nuevoReserva.textContent = "El nombre de la reserva "+nReservas+" es: "+nombre.value+" con "+ personas.value+" personas";
        nuevoReserva.appendChild(btnEliminar); // Botón dentro del <li>
        listaReservas.appendChild(nuevoReserva);  // <li> dentro de la lista de Redes

        // Al pulsar "Eliminar", borra ese alumno de la lista
        btnEliminar.addEventListener("click", function () {
            nuevoReserva.remove();
        });

        mensajeReserva.textContent = "Reserva enviada correctamente.";
        mensajeReserva.style.color = "green";
        nReservas++;
    }
}

formReserva.addEventListener("submit", validarFormulario);

//Ejercicio 4. Tu propuesta.

//Boton Carne
const btnCarne = document.getElementById("btnCarne");
const detalleCarne = document.getElementById("detalleCarne");
const enlaceCarne = document.createElement("a");
enlaceCarne.textContent = "Ver detalle de la carne";
enlaceCarne.href = "enlace.html";
enlaceCarne.target = "_blank";

let btnCarnePulsado = false;

btnCarne.addEventListener("click", function () {
    if(btnCarnePulsado){
        detalleCarne.removeChild(enlaceCarne);
        btnCarnePulsado = false;
    }else{
        detalleCarne.appendChild(enlaceCarne);
        btnCarnePulsado = true;
    }
});

btnCarne.addEventListener("mouseover", function() {
    document.body.style.backgroundColor = "red";
});

btnCarne.addEventListener("mouseout", function() {
    document.body.style.backgroundColor = "white";
});

//Boton ensalada
const btnEnsalada = document.getElementById("btnEnsalada");
const detalleEnsalada = document.getElementById("detalleEnsalada");
const enlaceEnsalada = document.createElement("a");
enlaceEnsalada.textContent = "Ver detalle de la ensalada";
enlaceEnsalada.href = "enlace.html";
enlaceEnsalada.target = "_blank";

let btnEnsaladaPulsado = false;

btnEnsalada.addEventListener("click", function () {
    if(btnEnsaladaPulsado){
        detalleEnsalada.removeChild(enlaceEnsalada);
        btnEnsaladaPulsado = false;
    }else{
        detalleEnsalada.appendChild(enlaceEnsalada);
        btnEnsaladaPulsado = true;
    }
});

btnEnsalada.addEventListener("mouseover", function() {
    document.body.style.backgroundColor = "green";
});

btnEnsalada.addEventListener("mouseout", function() {
    document.body.style.backgroundColor = "white";
});

//Boton tarta
const btnTarta = document.getElementById("btnTarta");
const detalleTarta = document.getElementById("detalleTarta");
const enlaceTarta = document.createElement("a");
enlaceTarta.textContent = "Ver detalle de la carne";
enlaceTarta.href = "enlace.html";
enlaceTarta.target = "_blank";

let btnTartaPulsado = false;

btnTarta.addEventListener("click", function () {
    if(btnTartaPulsado){
        detalleTarta.removeChild(enlaceTarta);
        btnTartaPulsado = false;
    }else{
        detalleTarta.appendChild(enlaceTarta);
        btnTartaPulsado = true;
    }
});

btnTarta.addEventListener("mouseover", function() {
    document.body.style.backgroundColor = "yellow";
});

btnTarta.addEventListener("mouseout", function() {
    document.body.style.backgroundColor = "white";
});