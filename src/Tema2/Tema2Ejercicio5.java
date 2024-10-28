package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();
        double media = (num1 + num2 + num3) / 3;

        System.out.printf("La media con decimales es: %.2f%n", media);

        System.out.printf("La media sin decimales es: %.0f%n", media);

        scanner.close();
    }
}