package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num, numfinal;
        System.out.println("Inserta la cantidad deseada para calcular la raíz cuadrada: ");
        num = scan.nextDouble();
        System.out.println("Inserta D/E");
        if (num > 0) {
            Math.sqrt(num);

        } else {
            System.out.println("ERROR");
        }
        scan.close();
    }
}