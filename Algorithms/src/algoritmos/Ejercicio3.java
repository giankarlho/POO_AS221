package algoritmos;

import java.util.Scanner;

/*
Lee dos números e imprime cuál de ellos es mayor o bien si son iguales.
*/
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ing. el nro. 1");
        int nro1 = input.nextInt();
        System.out.println("Ing. el nro. 2");
        int nro2 = input.nextInt();
        
        if (nro1 > nro2){
            System.out.println("El nro1: " + nro1 + " es mayor que el nro2: " + nro2);
        } else if (nro2 > nro1){
            System.out.println("El nro2: " + nro2 + " es mayor que el nro1: " + nro1);
        } else {
            System.out.println("Son iguales");
        }        
    }    
}
