package services;

public class CalculadoraServices {

    // Por defecto tiene un modificado de tipo private, solamente existe en la clase
    public double resultadoDouble = 0.0;
    public String resultadoCadena = "";
    
    public void calcular(double nro1, double nro2, char operador){
        switch(operador){
            case '+': resultadoDouble = nro1 + nro2;break;
            case '-': resultadoDouble = nro1 - nro2;break;
            case '*': resultadoDouble = nro1 * nro2;break;
            case '/': resultadoDouble = nro1 / nro2;break;
            case '%': resultadoDouble = nro1 % nro2;break;
            default: resultadoDouble = 0.0; break;    
        }
    }
    
    public String esPrimo(int nro){
        // ++ -> +1
        int cantDiv = 0;
        for (int i=1 ; i<=nro ; i++){
            if (nro % i == 0) cantDiv ++;
        }
        if (cantDiv == 2){
            resultadoCadena = "Si es primo";
        }else{
            resultadoCadena = "No es mi primo";
        }
        return resultadoCadena;
    }
    
}
