package algoritmos;

public class BingoAB5 {

    public static void main(String[] args) {

        int bingo[][] = new int[5][5];

        for (int h = 0; h <= 4; h++) {
            for (int t = 0; t <= 4; t++) {
                bingo[h][t] = (int) (Math.random() * 15) + 15 * t + 1;  
            }
        }        

        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(bingo[j][i] + "\t");
            }
            System.out.println("");
        }
    }
}
