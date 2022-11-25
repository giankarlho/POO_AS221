package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public Connection cnx = null;

    public Connection conectar() throws Exception {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost/BDVentas";
            Class.forName(driver).newInstance();
            cnx = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Error en la conexión, revisa xfa ");
        }
        return cnx;
    }

    public static void main(String[] args) throws Exception {
        Conexion cnx2 = new Conexion();
        cnx2.conectar();
        // este método me retorna una variable de tipo Connection cnx
        if (cnx2.cnx != null) {
            System.out.println("Conectado, que shevere");
        } else {
            System.out.println("No pasa nada, sin conexión");
        }
    }

}
