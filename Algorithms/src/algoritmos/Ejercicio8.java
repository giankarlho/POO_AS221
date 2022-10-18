package algoritmos;

import java.util.Scanner;

/*
Una tienda hace un descuento de $10 si el total de compra es mayor a $500.
Deberás calcular el precio a pagar, basado en el valor de la compra.
*/
public class Ejercicio8 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalCompra = input.nextInt();
        
        if (totalCompra > 500){
            System.out.println("El precio total es: " + (totalCompra - 10));            
        } else {
            System.out.println("El precio total es: " + totalCompra);
        }
    }
}
