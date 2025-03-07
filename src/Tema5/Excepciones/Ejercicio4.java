package Programacion.Excepciones;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tamaño = random.nextInt(100) + 1;
        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = random.nextInt(10) + 1;
        }

        while (true) {
            System.out.print("Introduce una posición (negativo para salir): ");
            try {
                int posicion = scanner.nextInt();

                if (posicion < 0) {
                    break;
                }

                if (posicion >= 0 && posicion < tamaño) {
                    System.out.println("Valor: " + vector[posicion]);
                } else {
                    System.out.println("Posición fuera de rango.");
                }
            } catch (Exception e) {
                System.out.println("Error. Introduce un número válido.");
                scanner.next();
            }
        }

        scanner.close();
    }
}

