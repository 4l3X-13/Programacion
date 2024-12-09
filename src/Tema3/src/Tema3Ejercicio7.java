package Tema3.src;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce números primos: ");
        int numUsu = scanner.nextInt();
        boolean EsPrimo = esPrimo(numUsu);
    }
}
 /*   public static boolean esPrimo (int numUsu) {
        do {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(numUsu); i++) {
                if (numUsu % i == 0) {
                    esPrimo = false;
                    break;
                }

        }while (numUsu > 0);

    }


}
