package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
      public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un número para calcular su factorial: ");
            int number = scanner.nextInt();

            double factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + number + " es: " + factorial);
        }
    }


