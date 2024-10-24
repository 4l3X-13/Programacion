package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        double media;
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserta el primer número:");
        n1 = scan.nextInt();
        System.out.println("Inserta el segundo número:");
        n2 = scan.nextInt();
        System.out.println("Inserta el tercer número:");
        n3 = scan.nextInt();
        media = ( n1 + n2 + n3 )/3;
        System.out.println("La media de "+ n1 + n2 + n3 +"es: " + media);
        scan.close();
    }
}