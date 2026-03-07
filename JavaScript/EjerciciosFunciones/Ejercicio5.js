function fecha(dia, mes) {
    let año = new Date();
    const meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
    mes = meses[mes-1];
    alert("Hoy es "+dia+" del "+mes+" de "+año.getFullYear());
}
fecha(prompt("Ingresa el dia"), prompt("Ingresa el mes"));