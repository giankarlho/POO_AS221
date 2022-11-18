package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static Connection cnx = null;

    public static Connection conectar() throws Exception {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost/BDVentas";
            Class.forName(driver).newInstance();
            cnx = DriverManager.getConnection(url, user, pass);
//            return cnx;
        } catch (Exception e) {
            System.out.println("Error en la conexión, revisa xfa ");
        }
        return cnx;
    }

    public static void main(String[] args) throws Exception {
        Conexion.conectar();
        // este método me retorna una variable de tipo Connection cnx
        if (cnx != null) {
            System.out.println("Conectado, que shevere");
        } else {
            System.out.println("No pasa nada, sin conexión");
        }
    }

}
