package services;

public class CalculadoraServices {

    // Por defecto tiene un modificado de tipo private, solamente existe en la clase
    public double resultadoDouble = 0.0;
    public String resultadoCadena = "";
    
    public void calcular(double nro1, double nro2, char operador){
        switch(operador){
            case '+': resultadoDouble = nro1 + nro2;break;
            case '-': resultadoDouble = nro1 + nro2;break;
            case '*': resultadoDouble = nro1 + nro2;break;
            case '/': resultadoDouble = nro1 + nro2;break;
            case '%': resultadoDouble = nro1 + nro2;break;
            default: resultadoDouble = 0.0; break;    
        }
    }
    
}
