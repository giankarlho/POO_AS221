package algoritmos;

public class BingoAB4 {

    public static void main(String[] args) {

        int fila[] = new int[5];

        for (int t = 0; t <= 4; t++) {
            fila[t] = (int) (Math.random() * 15) + 15*t + 1;  
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(fila[i] + "\t");
        }
    }

}
