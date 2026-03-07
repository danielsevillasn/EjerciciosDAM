function Apartado1() {
    const id = "age-table";
    const tablaId = document.getElementById(id);
    alert(tablaId);
}

function Apartado2() {
    const id = "age-table";
    const tablaId = document.getElementById(id);
    const label = tablaId.getElementsByTagName("label");
    alert("Hay: " + label.length + "  label en la tabla");
}

function Apartado3() {
    const id = 'age-table';
    const tablaId = document.getElementById(id);
    const td = tablaId.getElementsByTagName("td");
    const Primertd = td[0];
    alert(Primertd.textContent);
}

function Apartado3_1(){
    const id = 'age-table';
    const tablaId = document.getElementById(id);
    const Primertd = tablaId.querySelector('td');
    alert(Primertd.textContent);
}

function Apartado4() {
    const name = "search";
    const formId = document.getElementsByName(name);
    alert(formId);
}

function Apartado5() {
    const name = "search";
    const formId = document.getElementsByName(name);
    const primerInput = formId[0].querySelector('input[type="text"][name="search"]');
    alert(primerInput);
}

function Apartado5_1() {
    const name = "search";
    const formId = document.getElementsByName(name)[0];
    const primerInput = formId.querySelector('input');
    console.log(primerInput);
}

function Apartado6() {
    const name = "search";
    const formId = document.getElementsByName(name)[0];
    const inputs = formId.querySelectorAll('input');
    const ultimoInput = inputs[inputs.length - 1];
    console.log(ultimoInput);
}
