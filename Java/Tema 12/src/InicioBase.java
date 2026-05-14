import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase ejecutable que inicializa una base de datos con su correspondiente url
 * y que intenta conectarla
 * 
 */
public class InicioBase {
    public static void main(String[] args) throws Exception {
        // url de la base de datos (creará el archivo si no existe)
        String url = "jdbc:sqlite:Empleados.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Conexion establecida con SQlite");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}