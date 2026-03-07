package ModularPrueba;
import ModularPrueba.Clases.Datos;
import ModularPrueba.Clases.Opciones;
public class EvaluaRA6 {
    public static void main(String[] args) {
        //Crea una variable que almacenara el valor del metodo obtenido en la clase Datos
        String menu = "";

        while (true){
            menu = Datos.menu();
            menu.trim();
            if (menu.equals("0")){ //SALIR
                System.out.println("\nSaliendo...");
                break;
            }else if (menu.equals("1")){ //MATRIZ MAGICA
                Opciones.matrizMagica();
            }else if (menu.equals("2")){ //TRADUCTOR JAVALANDIA
                Opciones.javalandia();
            }else{ ///ERROR
                System.out.println("\nEl mensaje introducido no es valido");
            }
        }
    }
}
