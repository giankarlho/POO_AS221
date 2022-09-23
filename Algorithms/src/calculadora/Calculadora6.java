package calculadora;

import java.util.Scanner;
import services.CalculadoraServices;

public class Calculadora6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculadoraServices calculadora = new CalculadoraServices();
        double nro1 = 0.0, nro2 = 0.0;
        char operador = 0;
        System.out.println("Ing. el nro. ->");
        nro1 = input.nextDouble();
        while (true) {
            System.out.println("Ing. el operador");
            operador = input.next().charAt(0);
            System.out.println("Ing. el siguiente nro.->");
            nro2 = input.nextDouble();
            calculadora.calcular(nro1, nro2, operador);
            System.out.println("El resultado: " + calculadora.resultadoDouble);
            System.out.println("Deseas continuar: SI->1 o NO->2");
            int opcion = input.nextInt();
            if (opcion == 2) break; // rompe el bucle
            nro1 = calculadora.resultadoDouble;
        }
        System.out.println("Fin de la aplicación");
    }
}
