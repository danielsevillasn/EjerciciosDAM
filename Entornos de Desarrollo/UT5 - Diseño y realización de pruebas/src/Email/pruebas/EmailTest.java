package Email.pruebas;

import static org.junit.Assert.*;
import org.junit.Test;
import Email.implementaciones.EmailSeparator;

public class EmailTest {

    @Test
    public void caracteresEspeciales1(){
        String[] arrayPrueba = {"pe-pe","gmail.com"};
        String[] emailPrueba = EmailSeparator.separaEmail("pe-pe@gmail.com");
        assertArrayEquals(arrayPrueba,emailPrueba);
    }

    @Test
    public void caracteresEspeciales2(){
        String[] arrayPrueba = {"pepe","gm-ail.com"};
        String[] emailPrueba = EmailSeparator.separaEmail("pepe@gm-ail.com");
        assertArrayEquals(arrayPrueba,emailPrueba);
    }

    @Test
    public void caracteresEspeciales3(){
        String[] arrayPrueba = {"pe-pe","gm-ail.com"};
        String[] emailPrueba = EmailSeparator.separaEmail("pe-pe@gm-ail.com");
        assertArrayEquals(arrayPrueba,emailPrueba);
    }

    @Test
    public void variosArrobas(){
        String[] arrayPrueba = {"pepe@","gmail.com"};
        String[] emailPrueba = EmailSeparator.separaEmail("pepe@@gmail.com");
        assertArrayEquals(arrayPrueba,emailPrueba);
    }

    @Test
    public void ningúnArroba(){
        String[] emailPrueba = EmailSeparator.separaEmail("pepegmail.com");
        assertArrayEquals(null,emailPrueba);
    }

    @Test
    public void noDominio(){
        String[] emailPrueba = EmailSeparator.separaEmail("pepe@");
        assertArrayEquals(null,emailPrueba);
    }

    @Test
    public  void noNombre(){
        String[] emailPrueba = EmailSeparator.separaEmail("@gmail.com");
        assertArrayEquals(null,emailPrueba);
    }

    @Test
    public  void noNombreYDominio(){
        String[] emailPrueba = EmailSeparator.separaEmail("@");
        assertArrayEquals(null,emailPrueba);
    }

    @Test
    public  void dominioSinExtension(){
        String[] emailPrueba = EmailSeparator.separaEmail("pepe@gmail");
        assertArrayEquals(null,emailPrueba);
    }

    @Test
    public void emailValido(){
        String[] arrayPrueba = {"pepe","gmail.com"};
        String[] emailPrueba = EmailSeparator.separaEmail("pepe@gmail.com");
        assertArrayEquals(arrayPrueba,emailPrueba);
    }

    @Test
    public void limiteArrobaFinal(){
        String[] arrayPrueba = {"pepe","g"};
        String[] emailPrueba = EmailSeparator.separaEmail("pepe@g");
        assertArrayEquals(arrayPrueba,emailPrueba);
    }

    @Test
    public void limiteArrobaPrincipio(){
        String[] arrayPrueba = {"p","gmail.com"};
        String[] emailPrueba = EmailSeparator.separaEmail("p@gmail.com");
        assertArrayEquals(arrayPrueba,emailPrueba);
    }

    @Test
    public void pocoContenido(){
        String[] arrayPrueba = {"p","g"};
        String[] emailPrueba = EmailSeparator.separaEmail("p@g");
        assertArrayEquals(arrayPrueba,emailPrueba);
    }

    @Test
    public void muchoContenido(){
        String[] arrayPrueba = {"ppppppppppppppppppppppppppppppppppppppppppppppppppp","gggggggggggggggggggggggggggggggggggggggggggggg"};
        String[] emailPrueba = EmailSeparator.separaEmail("ppppppppppppppppppppppppppppppppppppppppppppppppppp@gggggggggggggggggggggggggggggggggggggggggggggg");
        assertArrayEquals(arrayPrueba,emailPrueba);
    }
}
