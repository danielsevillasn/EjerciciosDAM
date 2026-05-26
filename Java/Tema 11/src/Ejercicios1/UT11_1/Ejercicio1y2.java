package Ejercicios1.UT11_1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Ejercicio1y2 {
    public static void main(String[] args) {
        
        // 1. Creamos el contenedor principal (la ventana) con su título
        JFrame miFrame = new JFrame("Título de la ventana"); // [cite: 43]
        
        // 2. Creamos el contenedor secundario (el panel)
        JPanel panel1 = new JPanel(); // [cite: 52]
        
        // Modificación de la propiedad de color de fondo (Background)
        // Usamos la clase Color de AWT para pintarlo de un color llamativo (azul)
        panel1.setBackground(Color.BLUE);

        // Modificación de la propiedad de visibilidad (por defecto es true, pero la aseguramos)
        panel1.setVisible(true);
        
        // Modificación de la propiedad ToolTipText (texto de ayuda al pasar el ratón por encima)
        panel1.setToolTipText("Este es el panel principal de nuestra interfaz");

        // 3. Añadimos el panel modificado al JFrame
        miFrame.add(panel1);
        
        // 4. Configuraciones esenciales del JFrame para que la aplicación funcione correctamente
        miFrame.setSize(500, 400); // Definimos las dimensiones de la ventana (ancho y alto)
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Permite cerrar el programa al pulsar la 'X'
        miFrame.setVisible(true); // Hace que la ventana y todo su contenido sean visibles para el usuario
    }
}
