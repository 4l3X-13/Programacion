package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        boolean esAdulto = isAdult(edad);

        if (esAdulto == true) {
            System.out.println("Eres mayor de edad");
        } else
            System.out.println("Eres menor de edad");

    }

    public static boolean isAdult(int edadF) {
        if (edadF >= 18) {
            return true;
        }
            return false;

    }
}
