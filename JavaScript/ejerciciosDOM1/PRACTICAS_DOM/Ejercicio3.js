function Apartado(){
    const li = document.querySelectorAll('li');

    for(let i = 0; i<li.length; i++){
        alert(li[i].textContent);
    }
    alert("El numero de li es: "+li.length);
}