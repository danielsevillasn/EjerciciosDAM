//ejmplo1 evento con boton-saludo

const mensaje = document.getElementById("mensajeBienvenida");

function mostrarBienvenida() {
  mensaje.textContent = "¡Bienvenid@ a la práctica de eventos!";
}

const boton1 = document.getElementById("btn");
const fondo = document.querySelectorAll("div");

function cambiarFondo1() {
  fondo[5].style.backgroundColor = "blue";
}

boton1.addEventListener("mouseover", mostrarBienvenida);
boton1.addEventListener("click", cambiarFondo1);

// ejemplo 2 evento con botón que crea parrafo con texto

const boton2 = document.getElementById("btn2");

function crearParrafo() {

  // Creamos el elemento
  const nuevoParrafo = document.createElement("p");

  nuevoParrafo.textContent = "¡Ahora creamos el elemento para darte la bienvenida!";

  // Lo insertamos en el documento 
  boton2.parentElement.appendChild(nuevoParrafo);
}

boton2.addEventListener("click", crearParrafo, { once: true });

// Con el {once:true} conseguimos que solo se ejecute una vez, otra forma de conseguirlo.

//Ejemplo 3 creamos div con estilo porpio para bienvenida.

const boton3 = document.getElementById("btn3");

function crearSaludoGrande() {

  // Evitamos que se cree más de uno, otra forma de hacerlo comrobando que ya pertenece a la clase

  if (document.querySelector(".saludoGrande")) return;

  // Creamos el div, lo añadimos a la clase de CSS y le añadimos el texto.
  const nuevoDiv = document.createElement("div");

  nuevoDiv.classList.add("saludoGrande");

  nuevoDiv.textContent = "¡Bienvenid@ a la práctica avanzada de eventos DOM!";

  // Lo insertarmos
  boton3.parentElement.appendChild(nuevoDiv);
}

boton3.addEventListener("click", crearSaludoGrande, { once: true });

const parrafo1 = document.getElementById("mensajeBienvenida")
const nuevaImagen = document.createElement("img");

function incorporarimagen() {
  nuevaImagen.src = "img/img3.png";
  nuevaImagen.alt = "Esta es una foto de bienvenida"
  nuevaImagen.classList.add("img")


  parrafo1.parentElement.appendChild(nuevaImagen)
}
boton3.addEventListener("click", incorporarimagen, { once: true });


//ejercicio4 mostrar  y ocultar imagen


const foto = document.getElementById("foto");
const botonOcultar = document.getElementById("btnToggle");
const contImagen = document.getElementById("imagen")


function toggleImagen() {
  foto.classList.toggle("oculta");
  botonOcultar.textContent = "Mostrar imagen";
}



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

// Creacion de un enlace 
const enlace1 = document.createElement("a");
enlace1.textContent = "Ver información detallada del curso";
enlace1.href = "curso1.html";
enlace1.target = "_blank";
enlace1.classList.add("enlaceCurso1");

let enlace1Visible = false;

function crearEnlaceCurso1() {
  if (!enlace1Visible) {
    Curso1.parentElement.appendChild(enlace1);
  } else {
    Curso1.parentElement.removeChild(enlace1);
  }
  enlace1Visible = !enlace1Visible;
}
Curso1.addEventListener("click", crearEnlaceCurso1);

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



/*Contar caracteres del textarea

const textArea = document.getElementById("mensajeTexto");
const inFo = document.getElementById("infoText");

function contarCaracteres() {

  const cantidad = textArea.value.length;

  inFo.textContent = `Caracteres escritos: ${cantidad}`;
}

textArea.addEventListener("input",contarCaracteres)
*/
// Conntador inverso de caracteres.
const textArea = document.getElementById("mensajeTexto");
const info = document.getElementById("infoText");
const panelAviso = document.getElementById("mensajePalabraTabu");

const MAX = 100;
const palabraTabu = "error";

function controlarLimite() {

  const cantidad = textArea.value.length;
  const restantes = MAX - cantidad;

  if (cantidad > MAX) {
    textArea.value = textArea.value.substring(0, MAX);
    info.textContent = "Lo siento. Has superado el máximo permitido";
    info.style.color = "red";
  } else {
    info.textContent = `Te quedan ${restantes} caracteres`;
    info.style.color = "black";
  }

}
// Vamos a hacer que haya una palabra que cuando la escriba el ususario reciba una alerta
function encontrarPalabraTabu() {

  const texto = textArea.value.toLowerCase();

  if (texto.includes(palabraTabu)) {
    panelAviso.textContent = "Has escrito una palabra tabú";


  } else {
    panelAviso.textContent = "";
  }

}

textArea.addEventListener("input", controlarLimite);
textArea.addEventListener("input", encontrarPalabraTabu);

/* Crear lista con los que introducen los dos campos y por tanto el envio se realizaría  correctamente. En el caso de que un campo esté sin rellenar mostrar mensaje.

const formulario = document.getElementById("form1");
const campoN = document.getElementById("fname");
const campoA = document.getElementById("lname");
const mensajeLista = document.getElementById("mensaje");
const lista = document.getElementById("listaApuntados");

function procesarEnvio(e) {

  e.preventDefault();

  const nombre = campoN.value.trim();
  const apellido = campoA.value.trim();

  if (nombre === "" || apellido === "") {

    mensajeLista.textContent = "Debes rellenar ambos campos.";
    mensajeLista.style.color = "red";

  } else {

    mensajeLista.textContent = `${nombre} ${apellido} se ha apuntado correctamente.`;
    mensajeLista.style.color = "green";

    // Crear elemento li
    const nuevoAlumno = document.createElement("li");

    // Añadir texto
    nuevoAlumno.textContent = `${nombre} ${apellido}`;

    // Insertarlo en la lista
    lista.appendChild(nuevoAlumno);

    // Limpiar campos
    campoNombre.value = "";
    campoApellido.value = "";
  }
}

formulario.addEventListener("submit", procesarEnvio);
*/
const form = document.getElementById("form1");
const nombre = document.getElementById("fname");
const apellido = document.getElementById("lname");
const curso = document.getElementById("curso");
const mensajeCurso = document.getElementById("mensaje");

const listaRedes = document.getElementById("listaRedes");
const listaHtml = document.getElementById("listaHtml");
const listaPython = document.getElementById("listapy");

function validarFormulario(e) {
  e.preventDefault();
  mensajeCurso.textContent = "";

  if (nombre.value.trim() === "" || apellido.value.trim() === "") {
    mensajeCurso.textContent = "Debes rellenar todos los campos.";
    mensajeCurso.style.color = "red";
    return;
  }

  if (curso.value === "redes") {
    const nuevoAlumno = document.createElement("li");
    const btnEliminar = document.createElement("button");
    btnEliminar.type = "button";
    btnEliminar.textContent = "Eliminar";
    btnEliminar.className = "botonEliminar";

    nuevoAlumno.textContent = `${nombre.value} ${apellido.value}`;
    nuevoAlumno.appendChild(btnEliminar);
    listaRedes.appendChild(nuevoAlumno);

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

form.addEventListener("submit", validarFormulario);
