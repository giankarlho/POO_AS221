package algoritmos;

public class Prueba {

    public static void calcular(int nro1, int nro2) {
        System.out.println("Suma: " + (nro1 + nro2));
        System.out.println("Resta: " + (nro1 - nro2));
        System.out.println("Multi: " + (nro1 * nro2));
    }

    public static void main(String[] args) {
        Prueba.calcular(8, 9);
    }
}
