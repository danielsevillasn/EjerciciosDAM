package Tema6.EjercicioGeneral.Principal;
import Tema6.EjercicioGeneral.Objetos.*;
import Tema6.EjercicioGeneral.Enum.*;

public class GestionTech {
    public static void main(String[] args) {
        // 1. Creamos los dispositivos
        Movil m1 = new Movil("Sony", 400, Estado.NUEVO, 8);
        Movil m2 = new Movil(m1); // Copia

        // 2. Instanciamos nuestra clase FINAL
        // No podemos heredar de ella, pero sí crear objetos
        Cargador miCargador = new Cargador();

        // 3. Polimorfismo con Arrays (Tipo Dispositivo[])
        Dispositivo[] almacen = new Dispositivo[3];
        almacen[0] = m1;
        almacen[1] = m2;
        almacen[2] = new Movil("Nokia", 150, Estado.USADO, 4);

        System.out.println("--- PROCESO DE CARGA Y ESTADO ---");
        
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i] != null) {
                System.out.println(almacen[i].toString());
                
                // Usamos el objeto de la clase final
                miCargador.cargar(); 
                
                // Llamada al método de la interfaz
                almacen[i].encender(); 
                System.out.println("-------------------------");
            }
        }
    }
}