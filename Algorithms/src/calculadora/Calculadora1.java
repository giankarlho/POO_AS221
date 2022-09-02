package calculadora;

public class Calculadora1 {
    
    // psvm
    public static void main(String[] args) {
       
        short edad1 = 25;   // -32,768 a 32,767
        long edad2 = 26;        
        byte edad4 = 45;    // lo ideal -128 a 127
        int edad3 = 30;
        
        int nro1 = 10;
        int nro2 = 3;
        
        // sout NetBeans y sysout Eclipse
        System.out.println("Concatenado: " + nro1 + nro2); // juntar , concatenar , unir cadenas
        System.out.println("La suma: " + (nro1 + nro2));
        System.out.println("La resta: " + (nro1 - nro2));
        System.out.println("El producto: " + (nro1 * nro2));
        System.out.println("La división: " + (nro1 / nro2));
        System.out.println("El módulo: " + (nro1 % nro2)); // residuo
    }
    
}
