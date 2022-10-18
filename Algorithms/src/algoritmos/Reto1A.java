package algoritmos;

import java.util.Scanner;

/*
Calcular las calificaciones de un grupo de alumnos. 
La nota final de cada alumno se calcula según el siguiente criterio: 
La parte práctica vale el 10%; 
La parte de problemas vale el 50% 
Y la parte teórica el 40%. 
El algoritmo leerá el nombre del alumno, 
las tres notas, escribirá el promedio y
volverá a pedir los datos del siguiente alumno 
hasta que el nombre sea una cadena vacía.
Las notas deben estar entre 0 y 20, si no lo están,
no imprimirá las notas, mostrará un mensaje de error 
y volverá a pedir otro alumno.
*/
public class Reto1A {
    
    public static void main(String[] args) {
        System.out.println("Ingresa la cantidad de alumnos");
        Scanner entrada = new Scanner(System.in);
        int cantAlumnos = entrada.nextInt();
        double notas = 0.0;
        String nombre="";
        int cantNotas = 1;
        for (int j=1 ; j<= cantAlumnos ; j++){
            System.out.println("Ing. tu nombre");
            nombre = entrada.nextLine();            
            if (nombre.trim().length()==0) {
                System.out.println("Adiós");
                break;
            }
            while (cantNotas < 4){
                System.out.println("Ing. las nota: " + cantNotas);                        
                cantNotas ++;
                notas = notas + entrada.nextDouble();
                if (notas <0 && notas >20) continue;
                System.out.println("El promedio es: " + notas/3);
            }
            
        }
    }
    
    
}
