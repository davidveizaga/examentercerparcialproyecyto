
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion {

    public Connection get_conConection() {
        Connection conexion = null;

        try {
            // Establecer la conexión a la base de datos
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos MySQL");
            }

        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión a la base de datos: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
        return conexion;
    }

}