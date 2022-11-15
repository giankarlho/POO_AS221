/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        double pago = 0;
        for (int i = 1; i <= 3; i++) {
            pago = amount * 0.9;
            amount = (int) pago;
        }
        System.out.println(amount);
    }

}
