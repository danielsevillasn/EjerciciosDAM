package SimulacroExamen;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 * Encapsula el formato de empleados.dat.
 * Un registro ocupa 36 bytes: int (4) + 10 caracteres (20) + int (4) + double (8).
 */
public class FicheroAleatorioEmpleados {
    private static final int CARACTERES_APELLIDO = 10;
    private static final int TAM_REGISTRO = 36;
    private final File archivo;

    public FicheroAleatorioEmpleados(File archivo) {
        this.archivo = archivo;
    }

    /** Sobrescribe el fichero con los cinco registros de partida del enunciado. */
    public void guardarIniciales() throws Exception {
        Empleado[] iniciales = {
            new Empleado(1, "Sevilla", 10, 1500.50), new Empleado(2, "Fernandez", 20, 1750.00),
            new Empleado(3, "Gil", 10, 1625.75), new Empleado(4, "Lopez", 30, 2100.00),
            new Empleado(5, "Ramos", 20, 1900.25)
        };
        try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {
            raf.setLength(0); // Evita registros sobrantes de una ejecución anterior.
            for (Empleado empleado : iniciales) escribirRegistro(raf, empleado);
        }
    }

    /** Lee todos los registros desde el byte 0 hasta el final real del fichero. */
    public List<Empleado> listar() throws Exception {
        List<Empleado> empleados = new ArrayList<>();
        try (RandomAccessFile raf = new RandomAccessFile(archivo, "r")) {
            while (raf.getFilePointer() < raf.length()) empleados.add(leerRegistro(raf));
        }
        return empleados;
    }

    /**
     * Consulta directa: (id - 1) * 36 lleva al inicio de ese registro.
     * Así no es necesario leer los empleados anteriores.
     */
    public Empleado buscarPorId(int id) throws Exception {
        long posicion = (long) (id - 1) * TAM_REGISTRO;
        try (RandomAccessFile raf = new RandomAccessFile(archivo, "r")) {
            if (id <= 0 || posicion + TAM_REGISTRO > raf.length()) return null;
            raf.seek(posicion);
            return leerRegistro(raf);
        }
    }

    /** seek(length) sitúa el puntero justo después del último registro. */
    public void anadir(Empleado empleado) throws Exception {
        try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {
            raf.seek(raf.length());
            escribirRegistro(raf, empleado);
        }
    }

    /** Escribe los campos siempre en el orden que leerRegistro deberá respetar. */
    private void escribirRegistro(RandomAccessFile raf, Empleado e) throws Exception {
        raf.writeInt(e.getId());
        String apellido = String.format("%-10s", e.getApellido().toUpperCase()).substring(0, CARACTERES_APELLIDO);
        raf.writeChars(apellido); // Cada char ocupa 2 bytes: 10 * 2 = 20.
        raf.writeInt(e.getDepartamento());
        raf.writeDouble(e.getSalario());
    }

    /** Lee en el mismo orden y con el mismo tipo que se empleó al escribir. */
    private Empleado leerRegistro(RandomAccessFile raf) throws Exception {
        int id = raf.readInt();
        StringBuilder apellido = new StringBuilder();
        for (int i = 0; i < CARACTERES_APELLIDO; i++) apellido.append(raf.readChar());
        int departamento = raf.readInt();
        double salario = raf.readDouble();
        return new Empleado(id, apellido.toString().trim(), departamento, salario);
    }
}
