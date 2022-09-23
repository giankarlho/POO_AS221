package calculadora;

import java.util.Scanner;
import services.CalculadoraServices;

public class Calculadora5 {
    public static void main(String[] args) {
       Scanner ingreso = new Scanner(System.in);
       double nro1=0.0, nro2=0.0;
       char ope = 0;
       System.out.println("Ing. el nro1 ");
       nro1 = ingreso.nextInt();
       System.out.println("Ing. el nro2 ");
       nro2 = ingreso.nextInt();
       System.out.println("Ing. el operador ");
       ope = ingreso.next().charAt(0);
       CalculadoraServices calculadora = new CalculadoraServices();
       calculadora.calcular(nro1, nro2, ope);
       System.out.println("El resultado es: " + calculadora.resultadoDouble);
    }
 
}
