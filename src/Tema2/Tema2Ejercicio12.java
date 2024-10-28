package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Inserta 3 números : ");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();
        if (n1 >= n2 && n1 >= n3) {
            System.out.println("El número 1 es el mayor.");
        } else if (n2 >= n1 && n2 >= n3) {    System.out.println("El número 2 es el mayor.");
        } else {    System.out.println("El número 3 es el mayor.");
        }
        if ((n1 > n2 && n1 < n3) || (n1 > n3 && n1 < n2)) {    System.out.println("El número 1 es el del medio.");
        } else if ((n2 > n1 && n2 < n3) || (n2 > n3 && n2 < n1)) {    System.out.println("El número 2 es el del medio.");
        } else {    System.out.println("El número 3 es el del medio.");
        }
        if (n1 <= n2 && n1 <= n3) {    System.out.println("El número 1 es el menor.");
        } else if (n2 <= n1 && n2 <= n3) {    System.out.println("El número 2 es el menor.");
        } else {    System.out.println("El número 3 es el menor.");
        }
    }
}
