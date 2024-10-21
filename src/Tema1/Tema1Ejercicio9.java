package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el primer número entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Introduce el segundo número entero: ");
            int num2 = scanner.nextInt();


            int suma = num1 + num2;
            int resta = num1 - num2;
            int producto = num1 * num2;
            int division = 0;
            int resto = 0;

            if (num2 != 0) {
                division = num1 / num2;
                resto = num1 % num2;
            } else {
                System.out.println("No se puede dividir por cero.");
            }

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
            if (num2 != 0) {
                System.out.println("División: " + division);
                System.out.println("Resto: " + resto);
            }
        }
    }


