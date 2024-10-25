package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letra;
        double cantidad, total;
        System.out.println("Inserta la cantidad deseada: ");
        cantidad = scan.nextInt();
        System.out.println("Inserta D/E");
        letra = scan.next().charAt(0);

        switch (letra){
            case 'D':
                 total = cantidad * 1.08;
                System.out.println("El total " + total + "€");
            break;
            case 'E':
                total = cantidad * 0.92;
                System.out.println("La cantidad insertada son " + total + "$");
        }
        scan.close();
    }
}
