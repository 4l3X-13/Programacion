package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un año: ");
            int ano = scanner.nextInt();

            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println(ano + " es un año bisiesto.");
            } else {
                System.out.println(ano + " no es un año bisiesto.");
            }

        }
    }

