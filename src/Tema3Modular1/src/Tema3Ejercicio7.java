package Tema3Modular1.src;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUsu;

        do {
            System.out.print("Introduce un número para comprobar si es primo (0 para salir): ");
            numUsu = scanner.nextInt();

            if (numUsu == 0) {
                System.out.println("Programa terminado.");

            } else if (numUsu > 1) {
                boolean esPrimo = esPrimo(numUsu);
                System.out.println("¿Es primo? " + esPrimo);
            } else {
                System.out.println("Introduce un número mayor que 1.");
            }
        } while (numUsu != 0);

        scanner.close();
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números <= 1 no son primos
        }

        for (int i = 2; i <= Math.sqrt(num); i++) { // Iterar hasta la raíz cuadrada del número
            if (num % i == 0) {
                return false; // Si se encuentra un divisor, no es primo
            }
        }

        return true; // Si no se encuentran divisores, es primo
    }
}
