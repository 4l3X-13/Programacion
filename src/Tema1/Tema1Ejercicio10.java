package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el primer número real: ");
            double num1 = scanner.nextDouble();

            System.out.print("Introduce el segundo número real: ");
            double num2 = scanner.nextDouble();

            double suma = num1 + num2;
            double producto = num1 * num2;
            double division = num1 / num2;
            double resto = num1 % num2;

            System.out.println("La suma de los dos números es: " + suma);
            System.out.println("El producto de los dos números es: " + producto);
            System.out.println("La división del primer número entre el segundo es: " + division);
            System.out.println("El resto de la división es: " + resto);

        }
    }


