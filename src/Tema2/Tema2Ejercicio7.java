package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args) {
        double n1, n2, result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserta un número :");
        n1 = scan.nextInt();
        System.out.println("Inserta otro número : ");
        n2 = scan.nextInt();
        if  (n1 > n2) {
            result = (n1 - n2);
        } else result = (n2-n1);
        System.out.print("El resultado es : " + result);
        scan.close();
    }
}
