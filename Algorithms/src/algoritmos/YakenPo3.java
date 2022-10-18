package algoritmos;

import javax.swing.JOptionPane;

public class YakenPo3 {

    public static void main(String[] args) {
        int jugador2 = (int) Math.round(Math.random() * 3 + 1); // La PC elige piedra
        System.out.println("El jugador2 saca " + jugador2);
        int jugador1 = Integer.parseInt(JOptionPane.showInputDialog("Ing. la jugada"));
        if (jugador1 == jugador2) {
            System.out.println("Empatamos los dos sacamos");
        } else if ((jugador1 == 1 && jugador2 == 2) || (jugador1 == 2 && jugador2 == 3) || (jugador1 == 3 && jugador2 == 1)){
                System.out.println("Pierde el jugador1");            
        } else {
             System.out.println("Gana el jugador1");            
        }
    }
}
