function Apartado1() {
    const todosEnlaces = document.querySelectorAll("a");
    let contador = todosEnlaces.length;
    alert("Hay " + contador + " enlaces en la página");
}

function Apartado1_1() {
    const totalEnlaces = document.getElementsByTagName('a').length;
    console.log("Hay " + totalEnlaces + " enlaces en la página");
}

function Apartado2() {
    const todosEnlaces = document.querySelectorAll("a")
    let penUltimoEnlace;
    for (let i = 0; i < todosEnlaces.length; i++) {
        if (i == todosEnlaces.length - 2) {
            penUltimoEnlace = todosEnlaces[i];
        }
    }
    alert("El ultimo enlace es: " + penUltimoEnlace);
}

function Apartado2_1() {
    const enlaces = document.getElementsByTagName('a');
    const penultimoEnlace = enlaces[enlaces.length - 2].href;
    console.log("El ultimo enlace es: " + penultimoEnlace);
}

function Apartado3() {
    const todosEnlaces = document.querySelectorAll("a")
    let contador = 0;
    for (let i = 0; i < todosEnlaces.length; i++) {
        if (todosEnlaces[i] == "http://prueba/") {
            contador++;
        }
    }
    alert("El enlace \" http://prueba \" se repite: " + contador + " veces");
}

function Apartado3_1() {
    const enlacesPrueba = document.querySelectorAll('a[href="http://prueba/"]').length;
    console.log("El enlace \" http://prueba \" se repite: " + enlacesPrueba + " veces");
}

function Apartado4() {
    const lista = document.getElementsByTagName('p');
    const ultimoParrafo = lista[lista.length - 1];
    const enlaces = ultimoParrafo.querySelectorAll("a");
    alert("Hay: " + enlaces.length + " enlaces en el ultimo parrafo");
}

function Apartado4_1() {
    const párrafos = document.getElementsByTagName('p');
    const enlacesTercerParrafo = párrafos[2].getElementsByTagName('a').length;
    console.log("Hay: " + enlacesTercerParrafo + " enlaces en el ultimo parrafo");
}