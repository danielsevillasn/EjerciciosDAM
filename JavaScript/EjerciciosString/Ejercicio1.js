let fraseInicio = "Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar";
let fraseFinal = fraseInicio.replaceAll(/[aiouáíóú]/gi,"e");
alert("La frase inicial era: "+fraseInicio);
alert("La frase final es: "+fraseFinal);