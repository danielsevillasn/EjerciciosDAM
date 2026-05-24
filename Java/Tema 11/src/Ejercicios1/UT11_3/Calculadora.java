package Ejercicios1.UT11_3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Extendemos de JFrame e implementamos ActionListener para centralizar los eventos en esta clase
public class Calculadora extends JFrame implements ActionListener {
    
    // Componentes de la interfaz
    private JLabel resultado;
    private JPanel panelBotones;
    
    // Variables para la lógica matemática interna
    private double primerNumero = 0;
    private String operador = "";
    private boolean principioOperacion = true;

    public Calculadora() {
        // 1. Configuración de la ventana principal
        super("Calculadora Swing");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout()); // Usamos BorderLayout para separar la pantalla de los botones

        // 2. Crear la pantalla de visualización (JLabel)
        resultado = new JLabel("0");
        cp.add(resultado, BorderLayout.NORTH); // Posicionado en la parte superior

        // 3. Crear el panel para los botones con una rejilla simétrica (GridLayout)
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5)); // 4 filas, 4 columnas y 5px de separación

        // Definimos el orden de los botones para que queden perfectamente alineados
        String[] textoBotones = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        // Creamos, registramos y añadimos cada botón dinámicamente
        for (String texto : textoBotones) {
            JButton boton = new JButton(texto);
            boton.addActionListener(this); // Vinculamos el botón a nuestro manejador de eventos (this)
            panelBotones.add(boton);
        }

        // Añadimos el panel de botones en el centro de la ventana
        cp.add(panelBotones, BorderLayout.CENTER);
    }

    // 4. Lógica de control de eventos (Manejador único)
    @Override
    public void actionPerformed(ActionEvent e) {
        // Recuperamos el botón exacto que ha sido pulsado por el usuario
        JButton botonPulsado = (JButton) e.getSource();
        String textoBoton = botonPulsado.getText();

        // Acción: Botón de Limpieza (C)
        if (textoBoton.equals("C")) {
            primerNumero = 0;
            operador = "";
            resultado.setText("0");
            principioOperacion = true;
        } 
        // Acción: Botón de Igualdad (=)
        else if (textoBoton.equals("=")) {
            calcularResultado(Double.parseDouble(resultado.getText()));
            operador = ""; // Vaciar el operador tras el cálculo
            principioOperacion = true;
        } 
        // Acción: Operadores matemáticos
        else if (textoBoton.equals("+") || textoBoton.equals("-") || textoBoton.equals("*") || textoBoton.equals("/")) {
            primerNumero = Double.parseDouble(resultado.getText());
            operador = textoBoton;
            principioOperacion = true;
        } 
        // Acción: Números (0-9)
        else {
            if (principioOperacion) {
                resultado.setText(textoBoton);
                principioOperacion = false;
            } else {
                resultado.setText(resultado.getText() + textoBoton);
            }
        }
    }

    // Método auxiliar encargado de procesar la operación aritmética acumulada
    private void calcularResultado(double segundoNumero) {
        double calculo = 0;
        switch (operador) {
            case "+": calculo = primerNumero + segundoNumero; break;
            case "-": calculo = primerNumero - segundoNumero; break;
            case "*": calculo = primerNumero * segundoNumero; break;
            case "/": 
                if (segundoNumero != 0) {
                    calculo = primerNumero / segundoNumero; 
                } else {
                    resultado.setText("Error");
                    return;
                }
                break;
            default: calculo = segundoNumero; break; // Si no hay operador anterior
        }
        resultado.setText(String.valueOf(calculo));
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.setVisible(true);
    }
}