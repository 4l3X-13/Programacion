package Programacion.Excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        try {
            System.out.print("Introduce el primer número entero (num1): ");
            num1 = scanner.nextInt();

            System.out.print("Introduce el segundo número entero (num2): ");
            num2 = scanner.nextInt();

            int resultado = num1 / num2;
            System.out.println("El resultado de " + num1 + " / " + num2 + " es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto. Asegúrate de introducir solo números enteros.");
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: No se puede dividir entre cero.");
        } finally {
            scanner.close();
        }
    }
}
