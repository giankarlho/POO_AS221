
package algoritmos;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Tamaño :");
       int length = scanner.nextInt();
       int[] sides =  new int[length];
       for (int i = 0; i < length; i++) {
           System.out.print("Valores -> \t");
           sides[i] = scanner.nextInt();
           System.out.println(sides[i]*sides[i]);
       }
      
//       for (int j=0 ; j < sides[0]; j++){
//           System.out.println("output: ");
//           System.out.println(sides[j+1]*sides[j+1]);
//       }      
   }
}

