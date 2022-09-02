package calculadora;

public class Calculadora2 {
    
    public static void main(String[] args) {
        
        // Inicializando las variables, = asignación
        double nro1 = 159;
        double nro2 = 15;
        int operador = 1;      
        
        // Con == estoy comparando valores numéricos
        if (operador == 1){
            System.out.println("La suma: " + (nro1 + nro2));
        } else if (operador == 2){
            System.out.println("La resta: " + (nro1 - nro2));
        } else if (operador == 3){
            System.out.println("El producto: " + (nro1 * nro2));
        } else{
            System.out.println("No has ingresado el número correcto");
        }          
        
    }
            
}
