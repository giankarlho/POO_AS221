package services;

public class CalculadoraS {
    
    public static double calcular(double nro1, char operador, double nro2) {
        double resultado = 0.0;        
        switch (operador) {
            case '+':
                resultado = nro1 + nro2;
                break;
            case '-':
                resultado = nro1 - nro2;
                break;
            case '*':
                resultado = nro1 * nro2;
                break;
            case '/':
                resultado = nro1 / nro2;
                break;
        }
        return resultado;
    }
    
    public int factorial(int nro){
        int resultado = 1;
        for (int i = nro ; i >= 1; i--){
            resultado = resultado *i;
        }
        return resultado;
    }
    
    public String primo(int nro){
        String mensaje = "";
        int cantDiv = 0;
        for (int i = 1; i<nro/2 ; i++){
            if (nro % i == 0){
                cantDiv +=1;
            }
        }
        if (cantDiv == 1){
            mensaje = "Es Primo";
        }else{
            mensaje = "No es Primo";
        }
        return mensaje;
    }
    
    public String primoPerfecto(int nro){             
        String mensaje = "";        
        int cantDiv = 1,sumDiv = 0;
        
        for (int i = 1; i < nro; i++) {
            if (nro % i == 0) {
                cantDiv += 1;
                sumDiv += i;
            }
        }
        if (cantDiv == 2) {
            mensaje = "Es Primo";
        } else {
            mensaje = "No es Primo";
        }
        if (sumDiv == nro){
            mensaje = mensaje + " y Es Perfecto";      
        }else{
            mensaje = mensaje + " y No es Perfecto";      
        } 
        return mensaje;
    }
    
    public String perfecto(int nro){             
        // Nro. primo: 2 divisores: 1 y el nro. | 19: 1 , 19
        // Nro. perfecto: suma divisores = nro | 6 = 1 + 2 + 3
        String mensaje = "";        
        int cantDiv = 1, sumDiv = 0;
        
        for (int i = 1; i < nro; i++) {
            if (nro % i == 0) {          
                sumDiv += i;
            }
        }        
        if (sumDiv == nro){
            mensaje = "Es perfecto";      
        }else{
            mensaje = "No es perfecto";      
        } 
        return mensaje;
    }
    
    public static String fibonacci(int nro){
        String mensaje = "";  
        int a = 0, b = 1, c;         
        mensaje = mensaje + b + ", ";
        for(int i = 1; i< nro; i++){             
            c = a + b;
            a = b;
            b = c;             
            mensaje = mensaje + c + ", ";
        }
        return mensaje;
    }
    
    public static String capicua(int nro) {
        String mensaje = "";
        int r, s = 0, a;
        a = nro;
        while (nro != 0) {
            r = nro % 10;
            s = s * 10 + r;
            nro = nro / 10;
        }
        if (s == a) {
            mensaje = "Es capicua";
        } else {
            mensaje = "No es capicua";
        }
        return mensaje;
    }

}