package Teoria;

/* Controles.java
 *
 * */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// ÉSTO ES LA CLASE PRINCIPAL QUE EXTIENDE DE JFRAME...
public class Controles extends JFrame {
    private JPanel contentPane;
    private JTextField txtCajaDeTexto;
    static Controles frame;
    private JPasswordField passwordField;

    // la función que primero se ejecuta que crea
    // el frame en memoria...
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new Controles();
                    // ... y lo visualiza
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // aquí está el constructor de la clase que todo
    // lo programa...
    public Controles() {
        // se contruye la ventana
        setTitle("JavaSwing 6 Componentes básicos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 458, 363);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // la etiqueta
        JLabel lblEtiqueta = new JLabel("Etiqueta");
        lblEtiqueta.setBounds(10, 11, 67, 14);
        contentPane.add(lblEtiqueta);

        // la caja de texto
        txtCajaDeTexto = new JTextField();
        txtCajaDeTexto.setText("Caja de texto");
        txtCajaDeTexto.setBounds(10, 36, 152, 20);
        contentPane.add(txtCajaDeTexto);
        txtCajaDeTexto.setColumns(10);

        // el cuadro combinado
        JComboBox comboBox = new JComboBox();
        // los elementos
        comboBox.setModel(new DefaultComboBoxModel(new String[] { "Elemento 1", "Elemento 2", "Elemento 3" }));
        // comienza seleccionado el elemento 1
        comboBox.setSelectedIndex(1);
        comboBox.setBounds(10, 67, 191, 20);
        contentPane.add(comboBox);

        // el botón
        JButton btnBotn = new JButton("Botón");
        // cuando se pulsa hace ésto
        btnBotn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(frame, "Esto es un boton simple.");
            }
        });
        btnBotn.setBounds(53, 95, 89, 23);
        contentPane.add(btnBotn);

        // la casilla de verificación
        JCheckBox chckbx = new JCheckBox("Casilla de verificación");
        chckbx.setSelected(true);
        chckbx.setBounds(10, 125, 191, 23);
        contentPane.add(chckbx);

        // los botones de radio
        JRadioButton rdbtn1 = new JRadioButton("RadioButton 1");
        rdbtn1.setBounds(10, 151, 109, 23);
        contentPane.add(rdbtn1);

        JRadioButton rdbtn2 = new JRadioButton("RadioButton 2");
        rdbtn2.setBounds(10, 177, 109, 23);
        contentPane.add(rdbtn2);

        // el grupo para los botones
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(rdbtn1);
        radioGroup.add(rdbtn2);

        // otras casillas de verificación que se van a agrupar
        // para ver el comportamiento
        JCheckBox chckbx1 = new JCheckBox("CheckBox 1 agrupado");
        chckbx1.setBounds(10, 203, 166, 23);
        contentPane.add(chckbx1);

        JCheckBox chckbx2 = new JCheckBox("CheckBox 2 agrupado");
        chckbx2.setBounds(10, 229, 152, 23);
        contentPane.add(chckbx2);

        // el grupo para las casillas de verificación
        ButtonGroup chkGroup = new ButtonGroup();
        chkGroup.add(chckbx1);
        chkGroup.add(chckbx2);

        // el botón de activación
        JToggleButton tglbtn = new JToggleButton("Botón de activación");
        // que está seleccionado inicialmente
        tglbtn.setSelected(true);
        tglbtn.setBounds(10, 259, 166, 23);
        contentPane.add(tglbtn);

        // el área de texto
        JTextArea txtrAreaDeTexto = new JTextArea();
        // con una linea en el borde
        txtrAreaDeTexto.setBorder(new LineBorder(new Color(0, 0, 0)));
        // tres lineas de texto permitidas
        txtrAreaDeTexto.setRows(3);
        // el texto
        txtrAreaDeTexto.setText("Area de texto");
        txtrAreaDeTexto.setBounds(224, 11, 205, 58);
        contentPane.add(txtrAreaDeTexto);

        // el texto de contrasela
        passwordField = new JPasswordField();
        passwordField.setBounds(224, 80, 152, 20);
        // contraseña inicial
        passwordField.setText("Supercontraseña");
        contentPane.add(passwordField);

        // el llamado 'hilandero'
        JSpinner spinner = new JSpinner();
        spinner.setBounds(224, 111, 101, 20);
        contentPane.add(spinner);

        // la lista
        JList list = new JList();
        // la declaración de los elementos
        list.setModel(new AbstractListModel() {
            String[] values = new String[] { "Elemento 1", "Elemento 2", "Elemento 3" };

            // función que deveuelve el número de elementos
            @Override
            public int getSize() {
                return values.length;
            }

            // función para acceder a cada elemento
            // por ejemplo usando
            //
            // list.getModel().getElementAt(1)
            //
            // nos devolverá el elemento "Elemento 2"
            @Override
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        list.setSelectedIndex(1);
        list.setBounds(224, 142, 167, 52);
        contentPane.add(list);

        // el separador
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBounds(211, 11, 2, 297);
        contentPane.add(separator);

        // inicializacion de la barra de progreso,
        // la barra de desplazamiento y el deslizador.
        // los he puesto aquí juntos porque los uso
        // después y era necesario.
        final JProgressBar progressBar = new JProgressBar();
        final JScrollBar scrollBar = new JScrollBar();
        final JSlider slider = new JSlider();

        // configuraciones de la barra de progreso
        progressBar.setValue(50);
        progressBar.setBounds(224, 203, 205, 14);
        contentPane.add(progressBar);

        // la barra de desplazamiento
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent arg0) {
                // mueve a la vez la barra de progreso y el deslizador
                progressBar.setValue(scrollBar.getValue());
                slider.setValue(scrollBar.getValue());
            }
        });
        // valor inicial
        scrollBar.setValue(50);
        scrollBar.setOrientation(JScrollBar.HORIZONTAL);
        scrollBar.setBounds(224, 233, 205, 23);
        contentPane.add(scrollBar);

        // el deslizador, capturando evento
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent arg0) {
                // mueve la barra de progreso y la de desplazamiento
                // cada vez que se mueve el deslizador.
                progressBar.setValue(slider.getValue());
                scrollBar.setValue(slider.getValue());
            }
        });
        // valores para que salga la regla numerada
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(10);
        slider.setToolTipText("");
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBounds(224, 267, 200, 52);
        contentPane.add(slider);

    } // termina el constructor de la ventana
} // termina la clase
