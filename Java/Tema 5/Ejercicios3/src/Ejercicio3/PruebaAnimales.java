package Ejercicio3;

// Programa de prueba
public class PruebaAnimales {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Perro perro = new Perro();
        Canario canario = new Canario();
        Pinguino pinguino = new Pinguino();
        Lagarto lagarto = new Lagarto();

        gato.comer();
        gato.maullar();
        gato.amamantar();

        perro.ladrar();
        perro.dormir();

        canario.volar();
        canario.cantar();

        pinguino.volar();
        pinguino.nadar();

        lagarto.tomarSol();
        lagarto.camuflarse();
    }
}