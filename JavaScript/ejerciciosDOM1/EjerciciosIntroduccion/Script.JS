function ejercicio1() {
    const titulo = document.getElementById("tituloPrincipal");
    titulo.textContent = "DOM Manipulado con Éxito";
}

function ejercicio2() {
    const parrafo = document.getElementById("parrafoIntro");
    parrafo.style.backgroundColor = "lightblue";
}

function ejercicio3() {
    const primerElemento = document.querySelector(".caja");
    primerElemento.style.border = "2px solid red";
}

function ejercicio4(){
    const todosElementos = document.querySelectorAll("li.item");
    for(let i = 0;i<todosElementos.length;i++){
        todosElementos[i].style.color = "blue";
    }
}

function ejercicio5(){
    const img = document.querySelector("#imagenDemo");
    img.src = "img/nuevaimg2.jpg";
    img.alt = "Nueva Imagen Cargada";
}