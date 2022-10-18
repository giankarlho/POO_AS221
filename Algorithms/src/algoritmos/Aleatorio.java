package algoritmos;

public class Aleatorio {
    public static void main(String[] args) {
        // Mínimo 1 y máximo 6
        System.out.println((int)(Math.random()*6) + 1 );
        // Mínimo 1 y máximo 15
        System.out.println((int)(Math.random()*15) + 1 );
        // Mínimo 16 y máximo 30
        System.out.println((int)(Math.random()*15) + 16);
    }
}
