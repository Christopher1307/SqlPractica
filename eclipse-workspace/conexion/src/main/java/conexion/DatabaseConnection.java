package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Agenda1\"";
    private static final String USER = "pro";
    private static final String PASSWORD = "sa";
    private static Connection conexion = null;

    public static Connection obtenerConexion() {
        if (conexion == null) {
            try {
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión establecida con la base de datos.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conexion;
    }

    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
