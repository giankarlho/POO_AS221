package calculadora;

import java.util.Scanner;

public class Calculadora4 {

    public static void main(String[] args) {

        // Declarando e instanciando un objeto de la librería Scanner
        Scanner entrada = new Scanner(System.in);

        double nro1 = 0.0;
        double nro2 = 0.0;
        char operador = 0;

        System.out.println("Ing. el 1er. número:");
        nro1 = entrada.nextDouble();
        System.out.println("Ing. el 2do. número:");
        nro2 = entrada.nextDouble();
        System.out.println("Ing. el operador: '+'->suma, '-'->resta, '*'-> producto");
        operador = entrada.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("La suma: " + (nro1 + nro2)); break;
            case '-':
                System.out.println("La resta: " + (nro1 - nro2)); break;
            case '*':
                System.out.println("El producto: " + (nro1*nro2)); break;
            default:System.out.println("No haz ingresado el nro. correcto");
        }
    }
}
