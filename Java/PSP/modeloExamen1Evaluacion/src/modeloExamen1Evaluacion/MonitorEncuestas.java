package modeloExamen1Evaluacion;

/**
 * Clase monitor que moritorea todas las encuestas obteniendo sus respectivos resultados
 * 
 * MonitorEncuestas
 */
public class MonitorEncuestas {
    private static final String[] COLORES = {
        "Blanco", "Azul", "Verde", "Rojo", "Amarillo",
        "Naranja", "Marron", "Gris", "Negro"
    };

    private int nBlanco = 0;
    private int nAzul = 0;
    private int nVerde = 0;
    private int nRojo = 0;
    private int nAmarillo = 0;
    private int nNaranja = 0;
    private int nMarron = 0;
    private int nGris = 0;
    private int nNegro = 0;
    private int nSinRespuesta = 0;

    public synchronized int[] getResultados() {
        return new int[] {
            nBlanco, nAzul, nVerde, nRojo, nAmarillo,
            nNaranja, nMarron, nGris, nNegro
        };
    }

    public String getColor(int posicion) {
        return COLORES[posicion];
    }

    public synchronized void incrementarSinRespuesta() {
        nSinRespuesta++;
    }

    public synchronized int getSinRespuesta() {
        return nSinRespuesta;
    }

    public synchronized void comprobarNumero(int numero) {
        switch (numero) {
            case 1:
                nBlanco++;
                break;
            case 2:
                nAzul++;
                break;
            case 3:
                nVerde++;
                break;
            case 4:
                nRojo++;
                break;
            case 5:
                nAmarillo++;
                break;
            case 6:
                nNaranja++;
                break;
            case 7:
                nMarron++;
                break;
            case 8:
                nGris++;
                break;
            case 9:
                nNegro++;
                break;
            default:
                break;
        }
    }
}
