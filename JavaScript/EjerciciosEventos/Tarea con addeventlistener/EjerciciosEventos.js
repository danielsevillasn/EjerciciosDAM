// ============================================================
// BOTÓN TOGGLE — Mostrar y ocultar imagen alternando su texto
// ============================================================

let botonOcultar = document.getElementById("btnToggle");

// Cada click comprueba el estado actual de la imagen y actúa en consecuencia
botonOcultar.addEventListener("click", function(){

    if (image.style.display === "none") {
        // La imagen estaba oculta → la mostramos y actualizamos el texto del botón
        image.style.display = "block";
        botonOcultar.textContent = "Ocultar Imagen";
    } else {
        // La imagen estaba visible → la ocultamos y actualizamos el texto del botón
        image.style.display = "none";
        botonOcultar.textContent = "Mostrar Imagen";
    }
});


// ============================================================
// LISTA DE NOMBRES — Añadir y eliminar elementos dinámicamente
// ============================================================

let listaNombres = document.getElementById('listaNombres'); // <ul> donde se añaden los nombres

// keyup: se dispara justo DESPUÉS de soltar una tecla (a diferencia de keydown)
input.addEventListener("keyup", function(evento){

    // Solo actuamos si la tecla soltada es Enter
    if (evento.key === "Enter") {

        let nombre = input.value;

        // Solo añadimos si el campo no está vacío
        if (nombre !== "") {

            // 1. Creamos el <li> con el nombre escrito
            let li = document.createElement("li");
            li.textContent = nombre;

            // 2. Creamos el botón "Eliminar" y lo metemos dentro del <li>
            let btnEliminar = document.createElement("button");
            btnEliminar.textContent = "Eliminar";
            btnEliminar.className = "botonEliminar"; // Clase CSS para estilarlo
            li.appendChild(btnEliminar);

            // 3. Añadimos el <li> completo (con su botón) a la lista del DOM
            listaNombres.appendChild(li);

            // 4. Reasignamos el evento "click" a TODOS los botones eliminar del DOM
            // Nota: se vuelven a seleccionar todos cada vez para incluir el recién creado
            let botonesEliminar = document.querySelectorAll(".botonEliminar");
            botonesEliminar.forEach(function(boton){
                boton.addEventListener("click", function(){
                    boton.parentElement.remove(); // Elimina el <li> que contiene ese botón
                });
            });

            // 5. Limpiamos el input y devolvemos el foco para escribir el siguiente nombre
            input.value = "";
            input.focus();
        }
    }
});


// ============================================================
// BLOQUES — Efecto hover añadiendo y quitando clase CSS
// ============================================================

// Seleccionamos todos los elementos que tengan la clase "bloque"
let bloques = document.querySelectorAll(".bloque");

// Recorremos cada bloque y le asignamos los eventos de ratón
bloques.forEach(function(bloque){

    // mouseenter: el cursor ENTRA en el bloque → añadimos la clase de hover
    bloque.addEventListener("mouseenter", function(){
        this.classList.add("bloqueHover"); // "this" hace referencia al bloque concreto que recibe el evento
    });

    // mouseleave: el cursor SALE del bloque → quitamos la clase de hover
    bloque.addEventListener("mouseleave", function(){
        this.classList.remove("bloqueHover");
    });
});