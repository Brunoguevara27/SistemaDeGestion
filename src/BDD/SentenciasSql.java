package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SentenciasSql {


    String url = "jdbc:mysql://localhost/sistemadegestion";
    String usuario = "root";
    String clave = "";
    public Connection con = null;

    public Connection conectar() {
        try {       
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión establecida");
        } catch (SQLException ex) {
            Logger.getLogger(SentenciasSql.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "Error de conexión", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
}
