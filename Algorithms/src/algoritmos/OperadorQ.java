package algoritmos;

import java.util.Scanner;

public class OperadorQ {
    public static void main(String[] args) {
        String color;
        Scanner scanner = new Scanner(System.in);
        color = "\033[0;35m";
        System.out.println(color + "Introduce un nro. entero");
        int dividendo = scanner.nextInt();
        color = "\033[0;31m";
        System.out.println(color + "Introduce otro nro. entero");
        int divisor = scanner.nextInt();
        int resultado;
        if (divisor == 0){
            resultado = 0;
        } else {
            resultado = dividendo / divisor;                    
        }
        resultado = divisor ==  0   ?   0 : dividendo/divisor;
        System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + resultado);
    }
}
