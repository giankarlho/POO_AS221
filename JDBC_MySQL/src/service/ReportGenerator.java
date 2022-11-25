package service;

import dao.Conexion;
import java.net.URL;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;


public class ReportGenerator extends Conexion {


    public JasperPrint generarReporteSimpleCliente() throws JRException, ClassNotFoundException {
        try {
            JasperReport jr = null;
            URL in = this.getClass().getResource("../reports/ListCliente.jasper");
            jr = (JasperReport) JRLoader.loadObject(in);
//            JasperPrint reporteLleno = JasperFillManager.fillReport(REPORTE_SIMPLE_CLIENTE, new HashMap(), this.conectar());
            JasperPrint reporteLleno = JasperFillManager.fillReport(jr, new HashMap(), this.conectar());
            return reporteLleno;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
    
    
    
// ************ Usando recurso exteno con: URL y JasperReport  *******************
    public JasperPrint listarCliente() throws JRException, ClassNotFoundException {
        try {            
            URL in = this.getClass().getResource("/reports/ListClientes.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(in);
            JasperPrint reporteLleno = JasperFillManager.fillReport(jr, new HashMap(), this.conectar());
            return reporteLleno;
        } catch (Exception e) {
            System.out.println("Error en Jasper-listarCliente " + e.getMessage());
        }
        return null;
    }
    
    public JasperPrint listarEstadoCliente(String estadoCli) throws JRException, ClassNotFoundException{
        try {
            HashMap parametro = new HashMap();
            parametro.put("estado", estadoCli);
            JasperPrint reporteFinal = JasperFillManager.fillReport(REPORTE_ESTADO_CLIENTE, parametro, this.conectar());
            return reporteFinal;
        } catch (Exception e) {
            System.out.println("Error en Jasper-listarEstadoCliente " + e.getMessage());
        }
        return null;
    }
}
