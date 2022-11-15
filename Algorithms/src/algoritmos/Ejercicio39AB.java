package algoritmos;

/**
 *
 * Generar y simular el lanzamiento de un dado y guardar en una matriz de NxM
 * donde N y M sean de dos cifras y determinar: ¿Cuántas lanzadas sacaron 6?
 * ¿Cuántos pares hay en la matriz? ¿Qué fila tiene la mayor suma?
 */
public class Ejercicio39AB {

    public static void main(String[] args) {
        int canSeis=0, canPares=0, sumaFila = 0, sumaMayor=0;
        int fila = (int) (Math.random() * 91 + 10);
        int columna = (int) (Math.random() * 91 + 10);
        
        int matriz[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = (int) (Math.random() * 6 + 1);
            }
        }
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz[i][j] == 6){
                    canSeis ++;
                }
                if (matriz[i][j]%2 == 0){
                    canPares ++;
                }
                sumaFila = sumaFila + matriz[i][j];
            }
            if (sumaMayor < sumaFila){
                sumaMayor = sumaFila;
            }
        }
        
        System.out.println("La cantidad de seis: " + canSeis);
        System.out.println("La cantidad de pares: " + canPares);
        System.out.println("La suma mayor es: " + sumaMayor);
    
        System.out.println("Matriz de " + fila + " filas y " + columna + " columnas");
        // Imprimiendo la matriz
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + "\t");                 
            }
            System.out.println("");
        }       
        
    }
}
