package Ejercicio8;

public class PruebaPrestable {
    public static void main(String[] args) {
        VideoJuego v = new VideoJuego("Super mario", 60);
    
            v.prestar();
            v.devolver();
            v.prestar();
            v.devolver();
            v.prestar();
            v.devolver();
    
            Prestamo p = new Prestamo(500, "Fernando");
            
            p.prestar();
            p.prestar();
            p.prestar();
            
            p.devolver();
            p.devolver();
            p.prestar();
            p.devolver();
            p.devolver();
            p.devolver();
    }
}
