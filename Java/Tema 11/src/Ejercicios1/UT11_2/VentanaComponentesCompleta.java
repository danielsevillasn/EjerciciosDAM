package Ejercicios1.UT11_2;

import javax.swing.*;
import java.awt.FlowLayout;

public class VentanaComponentesCompleta extends JFrame {

    // 1. Declaración de todas las variables de los componentes del temario
    private JMenuBar barraMenu;
    private JMenu menuArchivo;
    private JMenuItem itemSalir;

    private JLabel etiqueta;
    private JButton boton;
    private JTextField campoTexto;
    private JTextArea areaTexto;
    private JCheckBox casillaVerificacion;
    private JRadioButton opcion1;
    private JRadioButton opcion2;
    private ButtonGroup grupoRadioBotones; // Para agrupar los JRadioButton
    private JComboBox<String> listaDesplegable;

    public VentanaComponentesCompleta() {
        // Configuración básica del contenedor principal
        setTitle("Muestrario Completo de Componentes");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Usamos FlowLayout para que los elementos se posicionen uno tras otro
        // cómodamente
        setLayout(new FlowLayout()); // [cite: 2, 4]

        // 2. Inicialización y configuración de los componentes individuales

        // Estructura de Menús
        barraMenu = new JMenuBar();
        menuArchivo = new JMenu("Archivo");
        itemSalir = new JMenuItem("Salir");
        menuArchivo.add(itemSalir); // Añadimos el ítem dentro del menú
        barraMenu.add(menuArchivo); // Añadimos el menú dentro de la barra
        setJMenuBar(barraMenu); // Asignamos la barra de menús a la ventana[cite: 4]

        // Componentes de Texto y Acción
        etiqueta = new JLabel("Nombre de usuario:"); // [cite: 4]
        campoTexto = new JTextField(20); // 20 columnas de ancho[cite: 2, 4]
        boton = new JButton("Enviar Datos"); // [cite: 4]

        areaTexto = new JTextArea(5, 30); // 5 filas y 30 columnas de tamaño[cite: 4]

        // Componentes de Selección
        casillaVerificacion = new JCheckBox("Acepto los términos y condiciones"); // [cite: 4]

        opcion1 = new JRadioButton("Modalidad Presencial"); // [cite: 4]
        opcion2 = new JRadioButton("Modalidad Online"); // [cite: 4]

        // Agrupamos los RadioButtons para que sean mutuamente excluyentes (solo uno
        // seleccionado)
        grupoRadioBotones = new ButtonGroup(); // [cite: 3]
        grupoRadioBotones.add(opcion1);
        grupoRadioBotones.add(opcion2);

        // Componente de Lista Desplegable (Combo Box)
        String[] ciudades = { "Madrid", "Sevilla", "Barcelona", "Valencia" };
        listaDesplegable = new JComboBox<>(ciudades); // [cite: 4]

        // 3. Adición manual de los componentes al flujo visual de la ventana
        add(etiqueta);
        add(campoTexto);
        add(boton);
        add(new JLabel("Comentarios adicionales:")); // Etiqueta auxiliar de organización
        add(areaTexto);
        add(casillaVerificacion);
        add(opcion1);
        add(opcion2);
        add(new JLabel("Selecciona tu sede:")); // Etiqueta auxiliar
        add(listaDesplegable);
    }
}