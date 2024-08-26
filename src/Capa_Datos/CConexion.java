
package Capa_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CConexion {
    
    Connection con = null;
    String user = "ejemploBD"; // Nombre de usuario
    String pass = "123456789"; // Contraseña de la base de datos
    
    String ip = "localhost";   // Direccion del servidor
    String puerto = "5432";    // Puerto
    String bd = "bd_libros";   // Base de datos a utilizar
    String url = "jdbc:postgresql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection getConeccion() { // Establecer la coneccion a la BD
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, pass);
            // JOptionPane.showMessageDialog(null, "Coneccion a BD exitosa");
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la coneccion de la BD:  " + e.getMessage());
        }
        return con;
    }
    
    public void closeConnection() { // Cortar la coneccion a la BD
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la desconeccion de la BD: " + e.getMessage());
        }
    }
    
    
}
