package Programacion.Excepciones;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vector = new double[5];
        int index = 0;

        while (index < 5) {
            try {
                System.out.print("Introduce un número para la posición " + (index + 1) + ": ");
                vector[index] = scanner.nextDouble();
                index++;
            } catch (Exception e) {
                System.out.println("Error. Introduce un número válido.");
                scanner.next(); 
            }
        }

        System.out.println("Los números introducidos son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vector[i]);
        }

        scanner.close();
    }
}
