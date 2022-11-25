package controlador;

import dao.ClienteImpl;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class ClienteC {

    ClienteImpl dao;
    Cliente cli;
    Cliente vista;
    List<Cliente> listado;

    public ClienteC() {
        dao = new ClienteImpl();
        cli = new Cliente();
    }

    public void registrar() {
        try {
            dao.registrar(cli);
        } catch (Exception e) {
            System.out.println("Error en ClienteC/registrar : " + e.getMessage());
        }
    }

    public void modificar() {
        try {
            dao.modificar(cli);
        } catch (Exception e) {
            System.out.println("Error en ClienteC/modificar : " + e.getMessage());
        }
    }

    public void eliminar() {
        try {
           dao.eliminar(cli.getIdcli());
        } catch (Exception e) {
            System.out.println("Error en ClienteC/eliminar : " + e.getMessage());
        }
    }

    public void listar(DefaultTableModel modelo, Integer tipo, String dato) {
        try {

        } catch (Exception e) {
            System.out.println("Error en ClienteC/listar : " + e.getMessage());
        }
    }
}
