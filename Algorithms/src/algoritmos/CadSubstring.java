package algoritmos;

public class CadSubstring {
    
    public static void main(String[] args) {
        // El índice en java empieza en 0
        String cadena = "456789";
        System.out.println("Tamaño cadena: " + cadena.length());
        System.out.println("Substring1 (2): " + cadena.substring(2));
        System.out.println("Substring2 (0,5): " + cadena.substring(0,5));
        System.out.println("Substring2 (0,length): " + cadena.substring(0,cadena.length()-1));
    }
}
