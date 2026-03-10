// ============================================================
// EJEMPLO 1 — Botón de saludo con eventos mouseover y click
// ============================================================

// Seleccionamos el párrafo donde mostraremos el mensaje de bienvenida
const mensaje = document.getElementById("mensajeBienvenida");

// Al pasar el ratón por encima del botón, escribe el mensaje en el párrafo
function mostrarBienvenida() {
  mensaje.textContent = "¡Bienvenid@ a la práctica de eventos!";
}

// Seleccionamos el botón principal y todos los divs del documento
const boton1 = document.getElementById("btn");
const fondo = document.querySelectorAll("div"); // Devuelve una NodeList con todos los divs

// Al hacer click en el botón, cambia el fondo del 6º div (índice 5) a azul
function cambiarFondo1() {
  fondo[5].style.backgroundColor = "blue";
}

// Asignamos los dos eventos al mismo botón:
// - mouseover: muestra el saludo al pasar el ratón
// - click: cambia el color de fondo
boton1.addEventListener("mouseover", mostrarBienvenida);
boton1.addEventListener("click", cambiarFondo1);


// ============================================================
// EJEMPLO 2 — Botón que crea un párrafo dinámicamente (solo una vez)
// ============================================================

const boton2 = document.getElementById("btn2");

// Crea un nuevo <p> con texto y lo añade al contenedor del botón
function crearParrafo() {
  const nuevoParrafo = document.createElement("p"); // Creamos el elemento <p>
  nuevoParrafo.textContent = "¡Ahora creamos el elemento para darte la bienvenida!";
  boton2.parentElement.appendChild(nuevoParrafo); // Lo insertamos al final del contenedor
}

// { once: true } hace que el evento se dispare solo la primera vez que se hace click
boton2.addEventListener("click", crearParrafo, { once: true });


// ============================================================
// EJEMPLO 3 — Botón que crea un div estilizado y añade una imagen (solo una vez)
// ============================================================

const boton3 = document.getElementById("btn3");

// Crea un div con clase CSS "saludoGrande" y lo añade al DOM
function crearSaludoGrande() {

  // Comprobamos si ya existe el div para no duplicarlo
  if (document.querySelector(".saludoGrande")) return;

  const nuevoDiv = document.createElement("div");
  nuevoDiv.classList.add("saludoGrande"); // Le aplicamos los estilos definidos en CSS
  nuevoDiv.textContent = "¡Bienvenid@ a la práctica avanzada de eventos DOM!";

  boton3.parentElement.appendChild(nuevoDiv); // Lo insertamos en el DOM
}

boton3.addEventListener("click", crearSaludoGrande, { once: true });

// Preparamos el elemento <img> antes de insertarlo
const parrafo1 = document.getElementById("mensajeBienvenida");
const nuevaImagen = document.createElement("img");

// Al hacer click en boton3, también se añade una imagen de bienvenida
function incorporarimagen() {
  nuevaImagen.src = "img/img3.png";      // Ruta de la imagen
  nuevaImagen.alt = "Esta es una foto de bienvenida"; // Texto alternativo (accesibilidad)
  nuevaImagen.classList.add("img");      // Clase CSS para estilar la imagen

  parrafo1.parentElement.appendChild(nuevaImagen); // La insertamos junto al mensaje
}

// { once: true } evita que se añada la imagen más de una vez
boton3.addEventListener("click", incorporarimagen, { once: true });


// ============================================================
// EJEMPLO 4 — Mostrar y ocultar imagen con toggle + cambio al hacer hover
// ============================================================

const foto = document.getElementById("foto");             // La imagen principal
const botonOcultar = document.getElementById("btnToggle"); // Botón para mostrar/ocultar
const contImagen = document.getElementById("imagen");      // Contenedor de la imagen

// Alterna la clase "oculta" (definida en CSS para display:none o similar)
// y cambia el texto del botón a "Mostrar imagen"
function toggleImagen() {
  foto.classList.toggle("oculta");
  botonOcultar.textContent = "Mostrar imagen";
}

botonOcultar.addEventListener("click", toggleImagen);

// Al pasar el ratón sobre la foto, cambia la imagen por otra alternativa
function cambiarImagen() {
  foto.src = "img/img2.jpg";
}

// Al pasar el ratón sobre la foto, también cambia el fondo del contenedor
function cambiarFondo() {
  contImagen.style.backgroundColor = "lightblue";
}

// Al sacar el ratón de la foto, vuelve la imagen y el fondo originales
function restaurarImagen() {
  foto.src = "img/img1.jpg";
  contImagen.style.backgroundColor = ""; // Elimina el estilo inline (vuelve al CSS)
}

foto.addEventListener("mouseover", cambiarImagen);
foto.addEventListener("mouseover", cambiarFondo);
foto.addEventListener("mouseout", restaurarImagen);


// ============================================================
// CURSOS — Expandir/colapsar detalles al pulsar cada botón de curso
// ============================================================

// Cada botón de curso alterna la clase "abierto" en su panel de detalles
// La clase "abierto" se encarga en CSS de mostrar u ocultar el contenido

const Curso1 = document.getElementById("btnCurso1");
const detalleCurso1 = document.getElementById("detalleCurso1");
Curso1.addEventListener("click", function () {
  detalleCurso1.classList.toggle("abierto");
});

const Curso2 = document.getElementById("btnCurso2");
const detalleCurso2 = document.getElementById("detalleCurso2");
Curso2.addEventListener("click", function () {
  detalleCurso2.classList.toggle("abierto");
});

const Curso3 = document.getElementById("btnCurso3");
const detalleCurso3 = document.getElementById("detalleCurso3");
Curso3.addEventListener("click", function () {
  detalleCurso3.classList.toggle("abierto");
});


// ============================================================
// CURSOS — Crear/eliminar enlace "Ver información" al pulsar cada curso
// ============================================================

// Se crea el elemento <a> pero NO se añade al DOM todavía
const enlace1 = document.createElement("a");
enlace1.textContent = "Ver información detallada del curso";
enlace1.href = "curso1.html";
enlace1.target = "_blank"; // Se abre en una nueva pestaña
enlace1.classList.add("enlaceCurso1");

// Variable bandera: controla si el enlace está visible o no
let enlace1Visible = false;

// Cada click alterna entre añadir y eliminar el enlace del DOM
function crearEnlaceCurso1() {
  if (!enlace1Visible) {
    Curso1.parentElement.appendChild(enlace1); // Añade el enlace
  } else {
    Curso1.parentElement.removeChild(enlace1); // Elimina el enlace
  }
  enlace1Visible = !enlace1Visible; // Cambia el estado de la bandera
}
Curso1.addEventListener("click", crearEnlaceCurso1);

// — Mismo patrón para Curso 2 —
const enlace2 = document.createElement("a");
enlace2.textContent = "Ver información detallada del curso";
enlace2.href = "curso2.html";
enlace2.target = "_blank";
enlace2.classList.add("enlaceCurso2");

let enlace2Visible = false;

function crearEnlaceCurso2() {
  if (!enlace2Visible) {
    Curso2.parentElement.appendChild(enlace2);
  } else {
    Curso2.parentElement.removeChild(enlace2);
  }
  enlace2Visible = !enlace2Visible;
}
Curso2.addEventListener("click", crearEnlaceCurso2);

// — Mismo patrón para Curso 3 —
const enlace3 = document.createElement("a");
enlace3.textContent = "Ver información detallada del curso";
enlace3.href = "curso3.html";
enlace3.target = "_blank";
enlace3.classList.add("enlaceCurso3");

let enlace3Visible = false;

function crearEnlaceCurso3() {
  if (!enlace3Visible) {
    Curso3.parentElement.appendChild(enlace3);
  } else {
    Curso3.parentElement.removeChild(enlace3);
  }
  enlace3Visible = !enlace3Visible;
}
Curso3.addEventListener("click", crearEnlaceCurso3);


// ============================================================
// TEXTAREA — Contador inverso de caracteres + detección de palabra tabú
// ============================================================

const textArea = document.getElementById("mensajeTexto");
const info = document.getElementById("infoText");           // Muestra los caracteres restantes
const panelAviso = document.getElementById("mensajePalabraTabu"); // Muestra aviso si hay palabra tabú

const MAX = 100;                // Límite máximo de caracteres permitidos
const palabraTabu = "error";    // Palabra que no se puede escribir

// Controla que no se supere el límite de caracteres y actualiza el contador
function controlarLimite() {
  const cantidad = textArea.value.length;
  const restantes = MAX - cantidad;

  if (cantidad > MAX) {
    // Si se supera el límite, recorta el texto y avisa en rojo
    textArea.value = textArea.value.substring(0, MAX);
    info.textContent = "Lo siento. Has superado el máximo permitido";
    info.style.color = "red";
  } else {
    // Si no se supera, muestra cuántos caracteres quedan
    info.textContent = `Te quedan ${restantes} caracteres`;
    info.style.color = "black";
  }
}

// Detecta si el texto contiene la palabra tabú y muestra un aviso
function encontrarPalabraTabu() {
  const texto = textArea.value.toLowerCase(); // Convertimos a minúsculas para comparar sin importar mayúsculas

  if (texto.includes(palabraTabu)) {
    panelAviso.textContent = "Has escrito una palabra tabú";
  } else {
    panelAviso.textContent = ""; // Limpiamos el aviso si ya no está la palabra
  }
}

// Ambas funciones se ejecutan cada vez que el usuario escribe algo
textArea.addEventListener("input", controlarLimite);
textArea.addEventListener("input", encontrarPalabraTabu);


// ============================================================
// FORMULARIO — Inscripción a cursos con validación y lista dinámica
// ============================================================

const form = document.getElementById("form1");
const nombre = document.getElementById("fname");      // Campo nombre
const apellido = document.getElementById("lname");    // Campo apellido
const curso = document.getElementById("curso");       // Select con el curso elegido
const mensajeCurso = document.getElementById("mensaje"); // Mensaje de éxito o error

// Referencias a las listas de alumnos de cada curso
const listaRedes = document.getElementById("listaRedes");
const listaHtml = document.getElementById("listaHtml");
const listaPython = document.getElementById("listapy");

function validarFormulario(e) {
  e.preventDefault(); // Evita que la página se recargue al enviar el formulario
  mensajeCurso.textContent = ""; // Limpiamos cualquier mensaje previo

  // Validación: ambos campos deben estar rellenos
  if (nombre.value.trim() === "" || apellido.value.trim() === "") {
    mensajeCurso.textContent = "Debes rellenar todos los campos.";
    mensajeCurso.style.color = "red";
    return; // Salimos sin hacer nada más
  }

  // Según el curso seleccionado, añadimos el alumno a la lista correspondiente
  // El patrón se repite para "redes", "html" y "py":
  // 1. Creamos un <li> con el nombre completo
  // 2. Le añadimos un botón "Eliminar"
  // 3. El botón elimina su propio <li> al hacer click
  // 4. Insertamos el <li> en la lista del curso

  if (curso.value === "redes") {
    const nuevoAlumno = document.createElement("li");
    const btnEliminar = document.createElement("button");
    btnEliminar.type = "button";       // Evita que el botón envíe el formulario
    btnEliminar.textContent = "Eliminar";
    btnEliminar.className = "botonEliminar";

    nuevoAlumno.textContent = `${nombre.value} ${apellido.value}`;
    nuevoAlumno.appendChild(btnEliminar); // Botón dentro del <li>
    listaRedes.appendChild(nuevoAlumno);  // <li> dentro de la lista de Redes

    // Al pulsar "Eliminar", borra ese alumno de la lista
    btnEliminar.addEventListener("click", function () {
      nuevoAlumno.remove();
    });

    mensajeCurso.textContent = "Formulario enviado correctamente.";
    mensajeCurso.style.color = "green";
  }

  if (curso.value === "html") {
    const nuevoAlumno = document.createElement("li");
    const btnEliminar = document.createElement("button");
    btnEliminar.type = "button";
    btnEliminar.textContent = "Eliminar";
    btnEliminar.className = "botonEliminar";

    nuevoAlumno.textContent = `${nombre.value} ${apellido.value}`;
    nuevoAlumno.appendChild(btnEliminar);
    listaHtml.appendChild(nuevoAlumno);

    btnEliminar.addEventListener("click", function () {
      nuevoAlumno.remove();
    });

    mensajeCurso.textContent = "Formulario enviado correctamente.";
    mensajeCurso.style.color = "green";
  }

  if (curso.value === "py") {
    const nuevoAlumno = document.createElement("li");
    const btnEliminar = document.createElement("button");
    btnEliminar.type = "button";
    btnEliminar.textContent = "Eliminar";
    btnEliminar.className = "botonEliminar";

    nuevoAlumno.textContent = `${nombre.value} ${apellido.value}`;
    nuevoAlumno.appendChild(btnEliminar);
    listaPython.appendChild(nuevoAlumno);

    btnEliminar.addEventListener("click", function () {
      nuevoAlumno.remove();
    });

    mensajeCurso.textContent = "Formulario enviado correctamente.";
    mensajeCurso.style.color = "green";
  }
}

// Escuchamos el evento submit del formulario para procesarlo con nuestra función
form.addEventListener("submit", validarFormulario);