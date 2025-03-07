package Programacion.Excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        try {
            System.out.print("Introduce un valor entero: ");
            num = scanner.nextInt(); // Intentamos leer el entero
            System.out.println("Valor introducido: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        } finally {
            scanner.close(); 
        }
    }
}
