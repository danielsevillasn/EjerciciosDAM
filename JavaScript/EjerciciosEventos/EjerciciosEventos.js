let botonOcultar = document.getElementById("btnToggle");
botonOcultar.addEventListener("click", function(){
    if (image.style.display === "none") {
        image.style.display = "block";
        botonOcultar.textContent = "Ocultar Imagen";
    } else {
        image.style.display = "none";
        botonOcultar.textContent = "Mostrar Imagen";
    }
});

let listaNombres = document.getElementById('listaNombres');

input.addEventListener("keyup", function(evento){
    if (evento.key === "Enter") {
        let nombre = input.value;
        if (nombre !== "") {
            let li = document.createElement("li");
            li.textContent = nombre;

            let btnEliminar = document.createElement("button");
            btnEliminar.textContent = "Eliminar";
            btnEliminar.className = "botonEliminar";
            li.appendChild(btnEliminar);
            listaNombres.appendChild(li);

            let botonesEliminar = document.querySelectorAll(".botonEliminar");
            botonesEliminar.forEach(function(boton){
                boton.addEventListener("click", function(){
                    boton.parentElement.remove();
                });
            });

            input.value = "";
            input.focus();
        }
    }
});

let bloques = document.querySelectorAll(".bloque");

bloques.forEach(function(bloque){
    bloque.addEventListener("mouseenter", function(){
        this.classList.add("bloqueHover");
    });
    
    bloque.addEventListener("mouseleave", function(){
        this.classList.remove("bloqueHover");
    });
})
