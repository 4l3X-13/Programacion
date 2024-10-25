package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args) {         Scanner scan = new Scanner(System.in);
            int numero;
            double cantidad, total;
            System.out.println("Inserta la cantidad deseada: ");
            cantidad = scan.nextInt();
            System.out.println("Inserta D/E");
            numero = scan.nextInt();

            switch (numero){
                case '0':
                    total = cantidad * 1.08;
                    System.out.println("El total " + total + "€");
                    break;
                case '1':
                    total = cantidad * 0.92;
                    System.out.println("La cantidad insertada son " + total + "$");
            }
            scan.close();
        }
    }

}

