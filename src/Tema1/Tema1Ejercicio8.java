package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio8 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el primer número entero: ");
            int numero1 = scanner.nextInt();

            System.out.print("Introduce el segundo número entero: ");
            int numero2 = scanner.nextInt();

            if (numero1 > numero2) {
                System.out.println("El mayor es: " + numero1);
            } else if (numero2 > numero1) {
                System.out.println("El mayor es: " + numero2);
            } else {
                System.out.println("Ambos números son iguales.");
            }

        }
    }


