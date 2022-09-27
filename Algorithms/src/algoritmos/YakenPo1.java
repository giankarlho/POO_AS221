package algoritmos;

// 1->Piedra 👊
// 2->Papel ?💌
// 3->Tijera ✂
import javax.swing.JOptionPane;

public class YakenPo1 {

    public static void main(String[] args) {
        int jugador2 = 1; // La PC elige piedra
        int jugador1 = Integer.parseInt(JOptionPane.showInputDialog("Ing. la jugada"));
        if (jugador1 == 1) {
            System.out.println("El jugador 1 saca 👊");
            if (jugador2 == 1) {
                System.out.println("Empatamos los dos sacamos 👊");
            } else if (jugador2 == 2) {
                System.out.println("Pierdo, el jugador2 sacó 💌");
            } else if (jugador2 == 3) {
                System.out.println("Gano, el jugador2 sacó ✂");
            }
        } else if (jugador1 == 2) {
            System.out.println("El jugador 1 saca 💌");
            if (jugador2 == 1) {
                System.out.println("Gano, el jugador2 sacó 👊");
            } else if (jugador2 == 2) {
                System.out.println("Empatamos, sacamos los dos 💌");
            } else if (jugador2 == 3) {
                System.out.println("Pierdo, el jugador2 sacó ✂");
            }
        } else if (jugador1 == 3) {
            System.out.println("El jugador 1 saca ✂");
            if (jugador2 == 1) {
                System.out.println("Pierdo, el jugador2 sacó 👊");
            } else if (jugador2 == 2) {
                System.out.println("Gano, el jugador2 sacó 💌");
            } else if (jugador2 == 3) {
                System.out.println("Empatamos, sacamos ✂");
            }
        }
    }
}
