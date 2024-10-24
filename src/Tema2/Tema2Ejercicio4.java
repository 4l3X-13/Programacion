package Tema2;

import java.io.PrintStream;
import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        System.out.println("Inserta nº 1");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        System.out.println("Inserta nº 2");
        n2 = scan.nextInt();
        System.out.println("Inserta nº 3");
        n3 = scan.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("El mayor es " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El mayor es " + n2);
        } else {
            System.out.println("El mayor es " + n3);
        }
        scan.close();
    }
    }


