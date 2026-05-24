package Ejercicios1.UT11_2;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout; // Importamos el layout de bordes
import java.awt.GridLayout;

public class Ejercicio1 {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("Demostración de Layouts");
        ventana.setSize(500, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Creamos algunos componentes (en este caso, botones para interactuar)
        JButton boton1 = new JButton("Botón Superior / 1");
        JButton boton2 = new JButton("Botón Izquierdo / 2");
        JButton boton3 = new JButton("Botón Central / 3");
        JButton boton4 = new JButton("Botón Derecho / 4");
        JButton boton5 = new JButton("Botón Inferior / 5");

        // ====================================================================
        // OPCIÓN A: APLICAR BORDERLAYOUT (Descomenta esta sección para probarla)
        // ====================================================================

        BorderLayout miLayoutBordes = new BorderLayout(); // Creación del objeto layout
        ventana.setLayout(miLayoutBordes); // Asignación al JFrame

        //Al añadir componentes, especificamos su zona geográfica de destino
        ventana.add(boton1, BorderLayout.NORTH);  // Arriba
        ventana.add(boton2, BorderLayout.WEST);   // Izquierda
        ventana.add(boton3, BorderLayout.CENTER); // Centro (ocupa el espacio restante)
        ventana.add(boton4, BorderLayout.EAST);   // Derecha
        ventana.add(boton5, BorderLayout.SOUTH);  // Abajo


        // ====================================================================
        // OPCIÓN B: APLICAR GRIDLAYOUT (Activada por defecto para este ejercicio)
        // ====================================================================
        // Estructura los componentes en una rejilla de celdas del mismo tamaño.
        // Indicamos en el constructor: (filas, columnas)
        //GridLayout miLayoutRejilla = new GridLayout(3, 2); 
        //ventana.setLayout(miLayoutRejilla); // Asignación al JFrame

        // En GridLayout, el orden en el que añadimos los elementos determina su posición
        //ventana.add(boton1); // Celda (Fila 1, Columna 1)
        //ventana.add(boton2); // Celda (Fila 1, Columna 2)
        //ventana.add(boton3); // Celda (Fila 2, Columna 1)
        //ventana.add(boton4); // Celda (Fila 2, Columna 2)
        //ventana.add(boton5); // Celda (Fila 3, Columna 1)
        // La celda (Fila 3, Columna 2) quedará vacía en este caso.

        // 3. Hacemos visible la ventana final
        ventana.setVisible(true);
    }
}
