import java.sql.*;

public class App2 {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:Empleados.db";

        // Usamos try-with-resources para cerrar la conexión automáticamente
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")) {

            while (rs.next()) {
                // Sacamos los datos por consola
                System.out.println("ID: " + rs.getInt("id") + 
                                   " | Nombre: " + rs.getString("nombre") + 
                                   " | Sueldo: " + rs.getDouble("sueldo"));
            }

        } catch (SQLException e) {
            System.err.println("Error de SQL: " + e.getMessage());
        }
    }
}