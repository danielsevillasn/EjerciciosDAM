//ejmplo1 evento con boton-saludo
const boton = document.getElementById("btn");
const mensaje = document.getElementById("mensajeBienvenida");

function mostrarBienvenida() {
  mensaje.textContent = "¡Bienvenid@ a la práctica de eventos!";
}

boton.addEventListener("click", mostrarBienvenida);

const boton2 = document.getElementById("btn2");
// ejemplo 2 evento con botón que crea parrafo con texto

function crearParrafo() {

  // Crear el elemento
  const nuevoParrafo = document.createElement("p");

  // 
  nuevoParrafo.textContent = "¡Ahora creamos el elemento para darte la bienvenida!";

  // Insertarlo en el documento
  boton2.parentElement.appendChild(nuevoParrafo);
}

    boton2.addEventListener("click", crearParrafo);

//Ejemplo 3 creamos div con estilo porpio para bienvenida

const boton3 = document.getElementById("btn3");

function crearSaludoGrande() {

  // Evitar que se cree más de uno
  if (document.querySelector(".saludoGrande")) return;

  // Crear el div
  const nuevoDiv = document.createElement("div");

  // Añadir clase
  nuevoDiv.classList.add("saludoGrande");

  // Añadir contenido
  nuevoDiv.textContent = "¡Bienvenida a la práctica avanzada de eventos DOM!";

  // Insertarlo
  boton3.parentElement.appendChild(nuevoDiv);
}

boton3.addEventListener("click", crearSaludoGrande);


//ejercicio4 mostrar ocultar imagen
const foto = document.getElementById("foto");
const botonOcultar = document.getElementById("btnToggle");
const contImagen=document.getElementById("imagen")
function toggleImagen() {
  foto.classList.toggle("oculta");
}

/*function toggleImagen() {

  if (foto.style.display === "none") {
    foto.style.display = "block";
    botonOcultar.textContent = "Ocultar Imagen";
  } else {
    foto.style.display = "none";
    botonOcultar.textContent = "Mostrar Imagen";
  }
}
*/
botonOcultar.addEventListener("click", toggleImagen);



function cambiarImagen() {
  foto.src = "img/img2.jpg";
}
function cambiarFondo() {
  contImagen.style.backgroundColor = "lightblue";
}
function restaurarImagen() {
  foto.src = "img/img1.jpg";
  contImagen.style.backgroundColor = "";
}

foto.addEventListener("mouseover", cambiarImagen);
foto.addEventListener("mouseover", cambiarFondo);
foto.addEventListener("mouseout", restaurarImagen);

// cursos, abrir información al pulsar
const btnCurso1 = document.getElementById("btnCurso1");
const detalleCurso1 = document.getElementById("detalleCurso1");

btnCurso1.addEventListener("click", function () {
  detalleCurso1.classList.toggle("abierto");
});

//  creacion de un enlace 

const Curso1 = document.getElementById("btnCurso1");

function crearEnlaceCurso() {

  // Evitar que se cree más de una vez
  if (document.querySelector(".enlaceCurso1")) return;

  // Crear el enlace
  const enlace = document.createElement("a");

  // Configurarlo
  enlace.textContent = "Ver información detallada del curso";
  enlace.href = "curso1.html";
  enlace.target = "_blank"; // abrimos en nueva pestaña

  // Añadir clase para poder identificarlo
  enlace.classList.add("enlaceCurso1");

  // Insertarlo debajo del botón
    Curso1.parentElement.appendChild(enlace);
}

    Curso1.addEventListener("click", crearEnlaceCurso);
    
    
/* verificacion en envios de formularios

const form = document.getElementById("form1");
const nombre = document.getElementById("fname");
const apellido = document.getElementById("lname");
const mensaje1 = document.getElementById("mensaje");

function validarFormulario(e) {

  mensaje1.textContent = ""; // limpiar mensaje anterior

  if (nombre.value.trim() === "" || apellido.value.trim() === "") {
    e.preventDefault(); // detener envío
    mensaje1.textContent = "Debes rellenar ambos campos antes de enviar.";
    mensaje1.style.color = "red";
  }

}

form.addEventListener("submit", validarFormulario);
*/
/*
const form = document.getElementById("form1");
const nombre = document.getElementById("fname");
const apellido = document.getElementById("lname");
const mensajeUsuario = document.getElementById("mensaje");

function validarFormulario(e) {

  e.preventDefault(); // detenemos el envío SIEMPRE para controlar nosotros

  const valorNombre = nombre.value.trim();
  const valorApellido = apellido.value.trim();

  if (valorNombre === "" || valorApellido === "") {

    mensajeUsuario.textContent = "Debes rellenar ambos campos antes de enviar.";
    mensajeUsuario.style.color = "red";

  } else {

    mensajeUsuario.textContent = `${valorNombre} ${valorApellido} has enviado el mensaje correctamente`;
    mensajeUsuario.style.color = "green";

  }
}

form.addEventListener("submit", validarFormulario);

*/
/*contar caracteres del textarea

const textArea = document.getElementById("mensajeTexto");
const inFo = document.getElementById("infoTextarea");

function contarCaracteres() {

  const cantidad = textArea.value.length;

  inFo.textContent = `Caracteres escritos: ${cantidad}`;
}

textArea.addEventListener("input", contarCaracteres);
*/
//contador inverso

const textarea = document.getElementById("mensajeTexto");
const info = document.getElementById("infoTextarea");

const MAX = 100;

function controlarLimite() {

  const cantidad = textarea.value.length;
  const restantes = MAX - cantidad;

  info.textContent = `Te quedan ${restantes} caracteres`;

  if (cantidad > MAX) {
    info.textContent = "Lo siento. Has superado el máximo permitido";
    info.style.color = "red";
  } else {
    info.style.color = "black";
  }
}

textarea.addEventListener("input", controlarLimite);

// palabra tabú

const cuadroTexto = document.getElementById("mensajeTexto");
const panelAviso = document.getElementById("infoTextarea");

const palabraTabu = "error";

function encontrarPalabraTabu() {

  const textoEscrito = cuadroTexto.value.toLowerCase();

  if (textoEscrito.includes(palabraTabu)) {

    panelAviso.textContent = "Has escrito una palabra tabú";
    panelAviso.style.color = "red";

  } else {

    panelAviso.textContent = "";
    panelAviso.style.color = "black";
  }
}

cuadroTexto.addEventListener("input", encontrarPalabraTabu);