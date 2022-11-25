package modelo;

public class Producto {
    private int idpro;
    private String descripcion;
    private Double precioVta;
    private Double costo;    
    private int cantidad;
    private int idproveedor;

    public int getIdpro() {
        return idpro;
    }

    public void setIdpro(int idpro) {
        this.idpro = idpro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioVta() {
        return precioVta;
    }

    public void setPrecioVta(Double precioVta) {
        this.precioVta = precioVta;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }
    
    
    
}
