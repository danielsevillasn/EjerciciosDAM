package EjerciciosPropuestosRepaso.Ejercicio7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        File archivo = new File("vehiculosSerializable.dat");

        System.out.print("Introduce la matrícula: ");
        String matricula = s.nextLine();

        if (matricula != null && !matricula.trim().isEmpty()) {
            System.out.print("Introduce la marca: ");
            String marca = s.nextLine();

            System.out.print("Introduce el tamaño de depósito (litros): ");
            double deposito = Double.parseDouble(s.nextLine());

            System.out.print("Introduce el modelo: ");
            String modelo = s.nextLine();

            Vehiculo v = new Vehiculo(matricula, marca, deposito, modelo);

            // 2. Guardado en el fichero (Modo Append controlado)
            try {
                ObjectOutputStream guardarObjeto;

                // Si el archivo ya existe y tiene contenido, usamos nuestra clase personalizada
                // MiObjectOutputStream.
                // Si está vacío o no existe, usamos el ObjectOutputStream normal para que
                // escriba la cabecera inicial.
                if (archivo.exists() && archivo.length() > 0) {
                    guardarObjeto = new MiObjectOutputStream(new FileOutputStream(archivo, true));
                } else {
                    guardarObjeto = new ObjectOutputStream(new FileOutputStream(archivo, true));
                }

                guardarObjeto.writeObject(v);
                guardarObjeto.close();
                System.out.println("\nVehículo guardado correctamente.\n");

            } catch (IOException e) {
                System.out.println("Error al escribir en el fichero: " + e.getMessage());
            }
        }
        System.out.println("\nLista vehiculos: ");
        if (archivo.exists()) {
            try (ObjectInputStream cargarObjeto = new ObjectInputStream(new FileInputStream(archivo))) {
                while (true) {
                    Vehiculo vCargado = (Vehiculo) cargarObjeto.readObject();
                    System.out.println("• Matrícula : " + vCargado.getMatrícula());
                    System.out.println("• Marca     : " + vCargado.getMarca());
                    System.out.println("• Depósito  : " + vCargado.getDepósito() + " L");
                    System.out.println("• Modelo    : " + vCargado.getModelo());
                    System.out.println("----------------------------------------");
                }
            } catch (EOFException e) {
                // Excepción normal que indica que hemos llegado al final del archivo
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        }
        s.close();

    }
}
