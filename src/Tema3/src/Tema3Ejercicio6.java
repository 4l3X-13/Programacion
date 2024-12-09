package Tema3.src;

import java.util.Scanner;

public class Tema3Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa muestra las tablas de multiplicar del 1 al 10:");

        imprimirTodasLasTablas();

        scanner.close();
    }

    public static void imprimirTodasLasTablas() {
        for (int numero = 1; numero <= 10; numero++) {
            imprimirTabla(numero);
            System.out.println();
        }
    }

    public static void imprimirTabla(int numero) {
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}