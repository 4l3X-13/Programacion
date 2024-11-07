package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota, aprobado = 0, suspendido = 0;
         while (true) {
            System.out.println("Inserta la nota:");
            nota = scan.nextInt();

            if (nota < 0) {
                break;
            }

            if (nota >= 5)
                aprobado++;

            else {
                suspendido++;
            }
        }
                System.out.println("Hay "+ aprobado+ " aprobados y "+ suspendido+" suspendidos.");

        scan.close();
    }
}