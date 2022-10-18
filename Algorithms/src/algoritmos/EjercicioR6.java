package algoritmos;

import java.util.Scanner;

/*
Leer un número entero de dos dígitos distintos de uno y determinar 
si un dígito es múltiplo del otro.

*/
public class EjercicioR6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ing. un nro. de 2 dígitos");
        int nro = input.nextInt();
        int u=0,d=0;
        if (nro <10 && nro >99) {
            System.out.println("El nro. no es de dos dígitos");
        } else {
            u = nro % 10;
            d = nro / 10;
            if (d%u ==0 || u%d ==0){
                System.out.println("Son múltiplos");
            } else{
                System.out.println("No son múltiplos");
            }
        }
        
    }
        
 }
    

