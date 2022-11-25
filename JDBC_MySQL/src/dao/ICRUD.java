package dao;

public interface ICRUD<Generic> {
    
    public void registrar(Generic generic) throws Exception;
    
    public void modificar(Generic generic) throws Exception;
    
    public void eliminar(int codigo) throws Exception;    
    
}
