package dao;

import java.sql.Date;
import modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ClienteImpl extends Conexion implements ICRUD<Cliente> {

    static int cantRegistros = 0;

    @Override
    public void registrar(Cliente cli) throws Exception {
        String sql = "insert into cliente (nomcli, apecli,dnicli, sexcli,naccli) values"
                + "(?, ?, ?,?,?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getDni());
            ps.setString(4, cli.getSexo());
            ps.setDate(5, (Date) cli.getNacimiento());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en ClienteImpl -> registrar: " + e.getMessage());
        }
    }

    @Override
    public void modificar(Cliente cli) throws Exception {
        String sql = "update cliente set nomcli=?, apecli=?,dnicli=?, sexcli=?,"
                + "naccli=? where idcli=? ";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getDni());
            ps.setString(4, cli.getSexo());
            ps.setDate(5, (Date) cli.getNacimiento());
            ps.setInt(6, cli.getIdcli());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en ClienteImpl/modificar: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(int codigo) throws Exception {
        String sql = "delete from cliente where idcli=" + codigo;
        try {
            PreparedStatement ps = this.conectar().prepareCall(sql);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en ClienteImpl/eliminar: " + e.getMessage());
        }
    }

    public void listar(DefaultTableModel modeloTabla, Integer tipo, String dato) throws Exception {
        // Tipo: 1-> Todos, 2->nombre, 3->apellido, 4->dni, 5->sexo
        String sql = "";
        switch (tipo) {
            case 1:
                sql = "select * from cliente";
                break;
            case 2:
                sql = "select * from cliente where nomcli like '%" + dato + "%'";
                break;
            case 3:
                sql = "select * from cliente where apecli like '%" + dato + "%'";
                break;
            case 4:
                sql = "select * from cliente where dnicli like '%" + dato + "%'";
                break;
            case 5:
                sql = "select * from cliente where sexcli = '" + dato + "'";
                break;
        }
        String datos[] = new String[6];
        try {
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cantRegistros = 0;
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    datos[i] = rs.getString(i + 1);
                }
                modeloTabla.addRow(datos);
                cantRegistros++; // cantRegistros = cantRegistros + 1
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error en ClienteImpl/listar" + e.getMessage());
        }
    }

}
