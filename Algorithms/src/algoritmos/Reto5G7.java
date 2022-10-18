/*
Se quiere determinar el tipo de persona según su edad:
Si es menor a 5 años es un bebé
Si es mayor a 5 y menor a 12 es un niño.
Si es mayor a 12 y menor que 25 es un adolescente.
Si es mayor a 25 y menor que 60 es adulto
Sino es adulto mayor
Constraints:
	0 <= Edad <=100

 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author Monitor
 */

public class Reto5G7 {
    public static void main(String[] args) {
        
        Scanner edad = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona:");
    
        int n;
        n = edad.nextInt();
        
        if(n <= 5 ){
            System.out.println("Es un bebé");
        }else if ( n > 5 && n < 12){
            System.out.println("Es un niño");
        }else if ( n > 12 && n < 25){
            System.out.println("Es un adolescente");
        }else if ( n > 25 && n < 60){
            System.out.println("Es un adulto");
        }else {
            System.out.println("Es un adulto mayor");
        }
    
    }
       
}
