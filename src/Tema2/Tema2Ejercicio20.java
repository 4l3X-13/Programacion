package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA, numB, imp;
        int contador;
        System.out.println("Inserta 2 números enteros: ");
        numA = scan.nextInt();
        numB = scan.nextInt();

        if (numB > numA) {
            if (numA % 2 == 0) {
            } else {
                numA++;
            }
            for (int i = numA; i < numB; i += 2) {
                System.out.println(i);

            }
            scan.close();
        }
    }
}