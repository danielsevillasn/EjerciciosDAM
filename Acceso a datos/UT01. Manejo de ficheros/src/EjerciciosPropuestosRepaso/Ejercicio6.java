package EjerciciosPropuestosRepaso;

import java.io.*;
import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        String nombreFichero = "vehiculos.dat";

        // 1. Lectura de datos por teclado y guardado en el fichero (Modo Append / No sobrescribir)
        try {
            String matricula = JOptionPane.showInputDialog("Introduce la matrícula:");
            
            // Comprobamos que el usuario no haya cancelado el diálogo
            if (matricula != null && !matricula.trim().isEmpty()) {
                String marca = JOptionPane.showInputDialog("Introduce la marca:");
                
                // Parseamos el double del depósito manejando posibles errores de formato
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Introduce el tamaño de depósito (litros):"));
                
                String modelo = JOptionPane.showInputDialog("Introduce el modelo:");

                // DataOutputStream para escribir. FileOutputStream(fichero, true) permite añadir al final.
                try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreFichero, true))) {
                    dos.writeUTF(matricula);
                    dos.writeUTF(marca);
                    dos.writeDouble(deposito);
                    dos.writeUTF(modelo);
                    JOptionPane.showMessageDialog(null, "Vehículo guardado correctamente en el fichero.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: El tamaño del depósito debe ser un valor numérico.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de E/S al guardar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // 2. Lectura de todos los vehículos almacenados en el fichero usando DataInputStream
        File fichero = new File(nombreFichero);
        if (fichero.exists()) {
            try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {
                // Bucle infinito que se detendrá automáticamente al llegar al final del fichero (EOFException)
                while (true) {
                    String matricula = dis.readUTF();
                    String marca = dis.readUTF();
                    double deposito = dis.readDouble();
                    String modelo = dis.readUTF();

                    // Formatear la salida para mostrarla en un cuadro de diálogo por cada vehículo
                    String mensaje = "=== DATOS DEL VEHÍCULO ===\n" +
                                     "• Matrícula: " + matricula + "\n" +
                                     "• Marca: " + marca + "\n" +
                                     "• Depósito: " + deposito + " L\n" +
                                     "• Modelo: " + modelo;

                    JOptionPane.showMessageDialog(null, mensaje, "Información del Vehículo", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (EOFException e) {
                // Fin de fichero alcanzado de forma normal; no requiere acción de error
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al leer el fichero: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}