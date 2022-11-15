package algoritmos;

/*
Se debe crear la siguiente matriz y asignar en cada posición los valores que se muestran. 
    1   3   5   7
    8   10  12  14
    15  17  19  21
    22  24  26  28
 */

public class Ejercicio38AB {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int valor=-1; 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = valor + 2; 
                valor = matriz[i][j];
            }
            valor = matriz[i][3] - 1;            
        }

        // Imprimiendo la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");                 
            }
            System.out.println("");
        }        
    }
}
