package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserta un numero entero: ");
        int numero = scan.nextInt();
        int contador = 0;
        while (numero != 0) {
            numero = numero /10;
            contador++;
        }
        System.out.println("El número tiene "+ contador +" cifras.");
        scan.close();
    }
}
