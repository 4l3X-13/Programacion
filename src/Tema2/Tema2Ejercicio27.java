package Tema2;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;


        System.out.println("Los primeros 20 números primos son:");
        while (count < 20) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}


