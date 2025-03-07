package Programacion.Excepciones;

import java.util.Scanner;

public class Ejercicio5 {

    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("El valor debe ser positivo.");
        }
        System.out.println("Valor positivo: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("El valor debe ser negativo.");
        }
        System.out.println("Valor negativo: " + n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce un número (negativo para salir): ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                break;
            }

            try {
                imprimePositivo(valor);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                imprimeNegativo(valor);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
