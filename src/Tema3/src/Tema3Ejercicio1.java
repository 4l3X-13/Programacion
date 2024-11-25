package Tema3.src;

import java.util.Scanner;

public class Tema3Ejercicio1 {
    public static int numberSign(int number) {
        if (number > 0) {
            return 1; // Positivo
        } else if (number < 0) {
            return -1; // Negativo
        } else {
            return 0; // 0
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.print("Introduce un número: ");
        int userNumber = scanner.nextInt();

        // Llamar a la función numberSign
        int result = numberSign(userNumber);

        // Mostrar el resultado
        if (result == 1) {
            System.out.println("1");
        } else if (result == -1) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }

        scanner.close(); // Cerrar el Scanner
    }
}
