package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese el primer número: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();
                System.out.print("Ingrese el tercer número: ");
                int num3 = scanner.nextInt();

                if (num1 <= num2 && num2 <= num3) {
                    System.out.println("Los números están ordenados de menor a mayor.");
                } else {
                    System.out.println("Los números NO están ordenados de menor a mayor.");
                }

                scanner.close();
            }
        }
