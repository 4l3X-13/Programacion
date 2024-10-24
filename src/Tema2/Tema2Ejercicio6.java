package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1;
        System.out.println("Inserta un número : ");
        n1 = scan.nextInt();
        if (n1 > 0 ) {
            System.out.println(n1 + " es positivo");
        } else if (n1<0) {
            System.out.println(n1 + " es negativo");
        } else  {
            System.out.println(n1 + " es 0");
        }
        scan.close();
    }
}
