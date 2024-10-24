package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Inserta 3 números : ");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();
        if (n1 <= n2 && n1 <= n3){
            System.out.println("Está en orden de menor a mayor.");
        }else {
            System.out.println("No está en orden de menor a mayor.");
        }
    scan.close();
    }
}
