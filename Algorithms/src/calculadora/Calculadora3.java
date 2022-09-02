package calculadora;

import java.util.Scanner;

public class Calculadora3 {
    
    public static void main(String[] args) {
        
        // Declarando e instanciando un objeto de la librería Scanner
        Scanner entrada = new Scanner(System.in);
        
        double nro1 = 0.0;
        double nro2 = 0.0;
        int operador = 0;
        
        System.out.println("Ing. el 1er. número:");
        nro1 = entrada.nextDouble();
        System.out.println("Ing. el 2do. número:");
        nro2 = entrada.nextDouble();
        System.out.println("Ing. el operador: 1->suma, 2->resta");
        operador = entrada.nextInt();        
        
        if (operador == 1){
            System.out.println("La suma: " + (nro1 + nro2));
        } else if (operador == 2){
            System.out.println("La resa: " + (nro1 - nro2));
        } else{
            System.out.println("No has ingresado el número correcto");
        }          
        
    }            
}
