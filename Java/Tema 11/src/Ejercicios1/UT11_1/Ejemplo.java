package Ejercicios1.UT11_1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo {
    public static void main(String[] args) {
        JFrame pantalla = new JFrame("Pantalla ejemplo");

        JButton boton = new JButton("Hola");
        JPanel panel = new JPanel();
        panel.add(boton);

        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pantalla.setSize(400,400);
        pantalla.setVisible(true);

        pantalla.add(panel);
    }
}
